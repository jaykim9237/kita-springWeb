package global.sesoc.web5.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import global.sesoc.web5.dao.MemberDAO;
import global.sesoc.web5.vo.Member;


@Controller
@RequestMapping("member") //여기~
public class MemberController {
	
	@Autowired
	MemberDAO dao;

	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);

	
	@RequestMapping(value = "join", method = RequestMethod.POST)
	public String join(Member member) {
		logger.debug("가입에서 전달 된 값 {}", member);
		dao.insert(member);
		return "redirect:/";
	}
	
	/*방법1)@RequestMapping(value = "/member/join"--->여기를 직접준다
	 방법2) 클래스 앞에 중간경로를 RequestMapping으로 만들어 주는 것이야
	 		이 컨트롤러를 사용할 때마다 경로를 따라 가주는 것이지
	 경로는 세분화해주는게 좋아*/
	@RequestMapping(value = "join", method = RequestMethod.GET)
	public String join() {
		return "memberjsp/joinForm";
	}
	
	
	//로그인 폼으로 이동
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String login() {
		return "memberjsp/loginForm";
	}
	
	/*
	 * 로그인 폼에서 입력한 아이디와 비밀번호를 검증하고 로그인 처리
	 */
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String login(Member member, HttpSession session) {
		//전달된 아이디로 회원정보를 검색
		//로그인 폼에서 가지고 온 값들이 멤버 타입인지 어떻게 알지? -->우리가 멤버에 아이디랑 패스워드를 정의를 해준 것이잖아
		//그거를 네임에 받아서 가지고 온 것이야, 우리가 처음에 그 아이디를 멤버 타입으로 정해준 것이니까 멤버로 받아올 수 있는 것이지 
		
		//여기에서 겟아이디로 불러줘도 우리가 아는 것은 value값을 login에서 받아왔잖아
		//그리고 그 값을 다오의 get멤버 메서드에 넣은거지--> 그 겟멤버 메서드는 아이디를 받아서 mapper에 저장을 해서 받아오는거야
		Member resultMember = dao.getMember(member.getId()); 
		//전달된 비밀번호와 디비에서 검색한 비밀번호 비교
		if(resultMember !=null && resultMember.getPassword().equals(member.getPassword())) {
			//아이디 비밀번호가 맞으면 세션에 아이디와 이름을 저장하고 메인화면으로 리다이렉트
			session.setAttribute("loginId",	resultMember.getId());
			session.setAttribute("loginName",	resultMember.getName());
			return "redirect:/";
		}
		else {
			//틀리면 로그인 폼으로 포워딩
			return "memberjsp/loginForm";
		}
	}
	
	//로그아웃 올려주셨움
	@RequestMapping(value = "logout", method = RequestMethod.GET)
	public String logout(Member member, HttpSession session) {
			session.removeAttribute("loginId");
			session.removeAttribute("loginName");
			return "redirect:/";
		}
	
	/*
	 * 아이디 중복확인 폼으로 이동
	 */
	@RequestMapping(value = "idcheck", method = RequestMethod.GET)
	public String idcheck() {
		return "memberjsp/idcheck";
	}
	
	@RequestMapping(value = "idcheck", method = RequestMethod.POST)
	public String idcheck(String searchId, Model model) {
		Member member = dao.getMember(searchId);
		model.addAttribute("searchId", searchId);
		model.addAttribute("member", member);
		return "memberjsp/idcheck";
	}
	
	/*
	 * 개인정보 수정 폼으로 이동
	 */
	@RequestMapping(value = "update", method = RequestMethod.GET)
	public String update(HttpSession session, Model model) {
		//세션의 아이디를 읽어서 DB에서 개인정보를 검색
		//세션은 오브제트 타입으로 저장을 해서? 불러와서? 그렁거고 원래 스트링이 맞으니까
		String id = (String)session.getAttribute("loginId");
		Member member = dao.getMember(id);
		//개인정보를 모델에 저장 그리고 나서 수정폼으로 이동
		model.addAttribute("member", member);
		return "memberjsp/updateForm";
	}
	
	/*
	 * 사용자가 입력한 내용을 DB테이블에 반영
	 */
	@RequestMapping(value = "update", method = RequestMethod.POST)
	public String update(Member member, HttpSession session) {
		String id = (String)session.getAttribute("loginId");
		member.setId(id);
		dao.update(member);
		return "redirect:/";
	}
	
	@RequestMapping(value = "list", method = RequestMethod.GET)
	public String list() {
		return "memberjsp/list";
	}
	
}

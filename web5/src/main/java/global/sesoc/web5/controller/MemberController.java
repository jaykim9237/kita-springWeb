package global.sesoc.web5.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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

	
	/*방법1)@RequestMapping(value = "/member/join"--->여기를 직접준다
	 방법2) 클래스 앞에 중간경로를 RequestMapping으로 만들어 주는 것이야
	 		이 컨트롤러를 사용할 때마다 경로를 따라 가주는 것이지
	 경로는 세분화해주는게 좋아*/
	@RequestMapping(value = "join", method = RequestMethod.GET)
	public String join() {
		return "memberjsp/joinForm";
	}
	
	@RequestMapping(value = "join", method = RequestMethod.POST)
	public String join(Member member) {
		logger.debug("가입에서 전달 된 값 {}", member);
		dao.insert(member);
		return "redirect:/";
	}
	
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String login() {
		return "member/loginform";
	}
	
	/*
	 * 로그인 폼에서 입력한 아이디와 비밀번호를 검증하고 로그인 처리
	 */
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String login(Member member, HttpSession session) {
		//전달된 아이디로 회운정보를 검색
		Member resultMember = dao.getMember(Member.getId());
		//전달된 비밀번호와 디비에서 검색한 비밀번호 비교
		if(resultMember !=null && resultMember.getPassword().equals(member.getPassword())) {
			//아이디 비밀번호가 맞으면 세션에 아이디와 이름을 저장하고 메인화면으로 리다이렉트
			session.setAttribute("loginId",	resultMember.getId());
			session.setAttribute("loginName",	resultMember.getName());
			return "redirect;/";
		}
		else {
			//틀리면 로그인 폼으로 포워딩
			return "memberjsp/loginForm";
		}
	}
	
}

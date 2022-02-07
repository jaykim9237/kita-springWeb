package global.sesoc.blog.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import global.sesoc.blog.dao.MemberDAO;
import global.sesoc.blog.vo.MemberVO;

/**
 * 회원 관련 콘트롤러
 * 가입, 로그인, 로그아웃
 */
@Controller
@RequestMapping("member")
public class MemberController {
	
	@Autowired
	MemberDAO dao;
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);

	//회원가입으로 이동
	@RequestMapping(value = "join", method = RequestMethod.GET)
	public String join() {
		return "memberjsp/joinForm";
	}

	//로그인으로 이동
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String login() {
		return "memberjsp/loginForm";
	}
	
	//회원가입하기
	@RequestMapping(value = "join", method = RequestMethod.POST)
	public String join(MemberVO membervo) {
		logger.debug("가입에서 전달 된 값 {}", membervo);
		int result = dao.insertMember(membervo);
		if (result != 1) {
				//저장이 안됐으면
		return "memberjsp/joinForm";
		}
			//저장 성공했으면
		return "redirect:/";
	}
	
	//로그인하기
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String login(MemberVO membervo, HttpSession session) {
		MemberVO resultMember = dao.getMember(membervo.getId());
		if (resultMember != null && resultMember.getPassword().equals(membervo.getPassword())) {
			//ID와 비번이 맞으면 세션에 ID와 이름을 저장하고 메인화면으로 리다이렉트
			session.setAttribute("loginId", resultMember.getId());
			session.setAttribute("loginName", resultMember.getName());
		}
		return "redirect:/";
	}
	
	//블로그 (회원) 목록으로 이동
			@RequestMapping(value = "listMember", method = RequestMethod.GET)
			public String list(Model model) {
				ArrayList<MemberVO> memberlist = dao.listMember();
				model.addAttribute("memberlist", memberlist);
				return "memberjsp/listMember";
			}
	
}

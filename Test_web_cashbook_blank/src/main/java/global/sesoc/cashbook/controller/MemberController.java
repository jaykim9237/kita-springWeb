package global.sesoc.cashbook.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import global.sesoc.cashbook.dao.MemberDAO;
import global.sesoc.cashbook.vo.MemberVO;

@Controller
@RequestMapping("member")
public class MemberController {
	
	@Autowired
	MemberDAO dao;
	
	//회원가입으로 이동
	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public String join() {
		return "member/joinForm";
	}
	
	//회원가입하기
	@RequestMapping(value = "/join", method = RequestMethod.POST)
	public String join(MemberVO membervo) {
		int result = dao.insertMember(membervo);
		if (result != 1) {
			//DB저장에 실패한 경우 가입폼으로 이동
			return "joinForm";
		}
		return "redirect:/";
	}
	
	//로그인폼으로 이동
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		return "member/loginForm";
	}
	
	//로그인하기
	@RequestMapping (value="login", method=RequestMethod.POST)
	public String login(String userid, String userpwd, Model model, HttpSession session) {
		MemberVO member = dao.getMember(userid);
		//같으면 세션에 저장
		if (member != null && member.getUserpwd().equals(userpwd)) {
			session.setAttribute("loginId", member.getUserid());
			return "redirect:/";
		}
		//다르면
		else {
			return "member/loginForm";
		}
	}
	
	//로그아웃
	@RequestMapping (value="logout", method=RequestMethod.GET)
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
}

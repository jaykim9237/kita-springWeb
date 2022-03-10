package global.sesoc.school.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import global.sesoc.school.dao.AdminDAO;
import global.sesoc.school.vo.AdminVO;

/**
 * 관리자 로그인, 로그아웃
 */
@Controller
public class AdminController {
	private static final Logger logger = LoggerFactory.getLogger(AdminController.class);
	
	@Autowired
	AdminDAO adminDAO;
	
	/* 로그인페이지로 이동 */
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String login() {
		return "login";
	}
	
	/* 로그인 */
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String login(AdminVO adminvo, HttpSession session) {
		
		AdminVO resultMember = adminDAO.getAdmin(adminvo.getAdminid());
		
		if(resultMember != null && resultMember.getAdminpwd().equals(adminvo.getAdminpwd())) {
			session.setAttribute("loginId", resultMember.getAdminid());
			return "redirect:/";
		}
		
		else {
			//틀리면 로그인 폼으로 포워딩
			return "home";
	}
	/* 로그아웃 하면 메인으로 이동*/
	
	
	}//로그인.post
	
}

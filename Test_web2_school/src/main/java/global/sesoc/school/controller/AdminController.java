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
	
	/**
	 * 로그인 폼으로 이동
	 */
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginForm() {
		return "login";
	}
	
	/**
	 * 로그인 처리
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(AdminVO vo, HttpSession session) {
		logger.debug("전달된 로그인정보 : {}", vo);
		
		AdminVO result = adminDAO.getAdminInfo(vo.getAdminid());
		
		if (result != null && vo.getAdminpwd().equals(result.getAdminpwd())) {
			session.setAttribute("loginId", vo.getAdminid());
			logger.info("로그인 성공");
		}
		else {
			logger.info("로그인 실패");
		}
		
		return "redirect:/";
	}
	
	/**
	 * 로그아웃
	 * @param session
	 * @return
	 */
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpSession session) {
		session.removeAttribute("loginId");
		return "redirect:/";
	}
	
}

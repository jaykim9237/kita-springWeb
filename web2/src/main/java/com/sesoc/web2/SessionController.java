package com.sesoc.web2;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SessionController {
	private static final Logger logger = LoggerFactory.getLogger(SessionController.class);
	
	//세션에 값 저장
	@RequestMapping(value = "/session1", method = RequestMethod.GET)
	public String session1(HttpSession session) {
		session.setAttribute("id", "abc");
		session.setAttribute("name", "홍길동");
		
		return "redirect:/";
 	}
	
	//세션에 값 삭제
	@RequestMapping(value = "/session2", method = RequestMethod.GET)
	public String session2(HttpSession session) {
		session.removeAttribute("id");
		session.removeAttribute("name");
		return "redirect:/";
 	}
}

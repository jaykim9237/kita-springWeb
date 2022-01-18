/**
 * 
 */
package com.sesoc.web2;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CookieController {
	
	private static final Logger logger = LoggerFactory.getLogger(CookieController.class);
	
	@RequestMapping(value = "/cookie1", method = RequestMethod.GET)
	public String cookie1(HttpServletResponse res) {
		
		//쿠키 생성 
		//쿠키는 문자만 저장 할 수 있고, 용량에 제한이 있어 
		Cookie c1 = new Cookie("num", "1234");
		Cookie c2 = new Cookie("str", "abcd");
		c1.setMaxAge(60*60*24*3);
		
		
		//클라이언트로 쿠키 저장
		res.addCookie(c1);
		res.addCookie(c2);
		return "redirect:/";
	}
	
	//쿠키삭제
	@RequestMapping(value = "/cookie2", method = RequestMethod.GET)
	public String cookie2(HttpServletResponse res) {
		
		//같은이름으로 유지 시간이 00초인 쿠키를 생성
		Cookie c1 = new Cookie("num", "null");
		Cookie c2 = new Cookie("str", "null");
		c1.setMaxAge(0);
		c2.setMaxAge(0);
		
		//클라이언트롤 저장하여 덮어쓴다
		res.addCookie(c1);
		res.addCookie(c2);
		return "redirect:/";
	}
	
	@RequestMapping(value = "/cookie3", method = RequestMethod.GET)
	public String cookie3(@CookieValue(value="num", defaultValue = "0") int num,
			@CookieValue(value="str", defaultValue= "") String str) {
		
		logger.debug("쿠키 num의 값{}", num);
		logger.debug("쿠키 str의 값{}", str);
		return "redirect:/";
	}
}

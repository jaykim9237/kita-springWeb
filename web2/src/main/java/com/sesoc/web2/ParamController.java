package com.sesoc.web2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ParamController {
	
	private static final Logger logger = LoggerFactory.getLogger(ParamController.class);
	
	@RequestMapping(value = "/param1", method = RequestMethod.GET)
	public String param1(String name, int num) {
		
		logger.debug("name: {}, num: {}", name, num);
		return "redirect:/";
		/* 리다이렉트 -> 자동으로 어떤 경로로 보내주는 것 굳이 결과 페이지가 없으면 그냥 다른 곳으로 보내주는 것
		 * 이동을 원하는 경로를 써주는 것이고, 받은 정보 그냥 남겨두고 떠나는 거야 */
	}
	
	//글쓰기로 폼이동
	@RequestMapping(value = "/param2", method = RequestMethod.GET)
	public String param2() {
		return "writeForm";
	}
	
	//사용자 폼에서 전송된 parameter 받기
//	@RequestMapping(value = "/write", method = RequestMethod.POST)
//	public String write(String name, String phone, String com) {
//		logger.debug("name: {}, phone: {}, com: {}", name, phone, com);
//		
//		return "redirect:/";
//	}		
		 /* 1.네임과 변수가 다를 경우 
		 *  2. 한글이 깨지는 경우 web.xml에 한글 그게 있는지 
		 *  3. 라이브러리를 pom.xml 이랑 log4j 에 버전이 맞는지 확인하기
		 */
	//사용자 폼에서 전송된 parameter 받기
	@RequestMapping(value = "/write", method = RequestMethod.POST)
	public String write(Person p) {
		logger.debug("Person: {}", p);
		
		return "redirect:/";
		
	}
}


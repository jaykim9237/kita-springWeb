package com.sesoc.web2;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class JstlController {
	
	@RequestMapping(value = "/jstl", method = RequestMethod.GET)
	public String jstlTest1(Model model) {
		
		int n=1;
		String s = "abc";
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		list.add("ddd");
		
		String phone = "010-111-2222";
		String date = "<marquee>문자열</marquee>";
		
		
		
		
		model.addAttribute("number", n);
		model.addAttribute("str", s);
		model.addAttribute("list", list);
		model.addAttribute("phone", phone);
		model.addAttribute("date", date);
		//리퀘스트 요청이 지속 될 때까지 지속됨
		return "jstl";
	}
	
	@RequestMapping(value = "/jstl2", method = RequestMethod.GET)
	public String jstlTest2(Model model) {
		String s= "abcde FSEG sd fSD 가나다라";
		/* 두번 째 jstl은 파일은 따로 만들었지만 컨트롤러를 같이 사용한 것 그래서 컨트롤러에 새로 메서드를 만들어 준 것 */
		model.addAttribute("str", s);
				return "jstl2";
	}
	
	
	
}

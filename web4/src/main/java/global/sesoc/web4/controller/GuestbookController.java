package global.sesoc.web4.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import global.sesoc.web4.HomeController;

@Controller
public class GuestbookController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list() {
		//글 목록을 보여주는 기능
		
		return "list";
	}
	
	@RequestMapping(value = "/write", method = RequestMethod.GET)
	public String write() {
		//쓰기 폼으로 이동
		
		return "write";
	}
	
	@RequestMapping(value = "/write", method = RequestMethod.POST)
	public String write2() {
		//사용자가 쓴 글을 DB에 저장
		
		return "redirect:/list";
	}
	
	
}

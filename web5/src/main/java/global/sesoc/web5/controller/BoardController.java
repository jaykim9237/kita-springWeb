package global.sesoc.web5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("board")
public class BoardController {
	
	//메인화면에서 "게시판" 클릭하면 게시판 목록이 출력되는 
	@RequestMapping(value = "list", method = RequestMethod.GET)
	public String list() {
		return "boardjsp/list";
	}
}

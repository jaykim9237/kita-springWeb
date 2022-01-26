package global.sesoc.web5.controller;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import global.sesoc.web5.dao.ManagerDAO;
import global.sesoc.web5.vo.Member;

@Controller
@RequestMapping("manager")
public class ManagerController {
	private static final Logger logger = LoggerFactory.getLogger(ManagerController.class);

	@Autowired
	ManagerDAO dao;
	
	//매니저페이지로 넘어가기
	@RequestMapping(value = "list", method = RequestMethod.GET)
	public String list(Model model){
		ArrayList<Member> list = dao.list();
		logger.debug("디비에서 가지고 온 목록{}", list);
		model.addAttribute("list", list);	
		return "managerjsp/list";
	}
}

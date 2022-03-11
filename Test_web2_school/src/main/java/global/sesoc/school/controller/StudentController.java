package global.sesoc.school.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import global.sesoc.school.dao.StudentDAO;
import global.sesoc.school.vo.ScoreVO;
import global.sesoc.school.vo.StudentVO;

@Controller
public class StudentController {
	private static final Logger logger = LoggerFactory.getLogger(StudentController.class);

	@Autowired
	StudentDAO studentDAO;
	
	/**
	 * 학생 등록 폼으로 이동
	 */
	@RequestMapping(value = "/insert", method = RequestMethod.GET)
	public String insert() {
		return "insert";
	}
	
	/**
	 * 학생 등록
	 * @param vo 등록할 학생정보
	 */
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public String insert(StudentVO vo) {
		logger.debug("저장할 학생정보 : {}", vo);
		studentDAO.insert(vo);
		return "redirect:/";
	}
	
	/**
	 * 학생 목록 보기
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(Model model) {
		ArrayList<StudentVO> list = studentDAO.list();
		model.addAttribute("list", list);
		return "list";
	}

	/**
	 * 학생 정보 삭제
	 * @param stnum 삭제할 학생 번호
	 */
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String delete(String stnum) {
		logger.debug("삭제할 학생 번호 : {}", stnum);
		studentDAO.delete(stnum);
		return "redirect:/list";
	}
	
	/**
	 * 학생 정보 수정폼으로 이동
	 * @param stnum 수정할 학생 번호
	 */
	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String update(String stnum, Model model) {
		logger.debug("수정할 학생 번호 : {}", stnum);
		
		//기존 학생 정보를 JSP로 전달 
		StudentVO vo = studentDAO.select(stnum);
		model.addAttribute("student", vo);
		
		return "update";
	}
	
	/**
	 * 학생 정보 수정
	 * @param vo 수정할 학생 정보
	 */
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(StudentVO vo) {
		logger.debug("수정할 학생 정보 : {}", vo);
		studentDAO.update(vo);
		return "redirect:/list";
	}

}

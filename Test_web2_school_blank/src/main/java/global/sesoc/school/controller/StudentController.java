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
@RequestMapping("student")
public class StudentController {
	private static final Logger logger = LoggerFactory.getLogger(StudentController.class);

	@Autowired
	StudentDAO studentDAO;
	
	/* 학생등록으로 이동 */
	@RequestMapping(value = "enroll", method = RequestMethod.GET)
	public String enrollStudent() {
		return "studentjsp/enrollStudent";
	}
	
	/* 학생등록 */
	@RequestMapping(value = "enroll", method = RequestMethod.POST)
	public String enrollStudent(StudentVO studentvo) {
		logger.debug("전달 된 학생 값{}", studentvo);
		studentDAO.enrollStudent(studentvo);
		return "home";
	}
	
	/* 학생관리로 이동 이동하면 리스트가 펼쳐져야함*/
	@RequestMapping(value = "manager", method = RequestMethod.GET)
	public String managerStudent(Model model) {
		
		ArrayList<StudentVO> studentlist = studentDAO.listStudent();
		model.addAttribute("studentlist", studentlist);
		return "studentjsp/managerStudent";
	}
	
	/* 학생 삭제 */
	@RequestMapping(value = "delete", method = RequestMethod.GET)
	public String deleteStudent(String stclass, String stnum) {
		
		logger.debug("학생 삭제 반 {}", stclass);
		logger.debug("학생 삭제 학번{}", stnum);
		
		studentDAO.deleteStudent(stclass, stnum);
		
		return "studentjsp/editStudent";
	}
	
	/* 학생 수정으로 이동 */
	@RequestMapping(value = "edit", method = RequestMethod.GET)
	public String editStudent(String stclass, String stnum) {
		
		logger.debug("학생 수정 반 {}", stclass);
		logger.debug("학생 수정 학번{}", stnum);
		
		studentDAO.editStudent(stclass, stnum);
		return "studentjsp/editStudent";
	}
	
	/* 학생 수정 */
}

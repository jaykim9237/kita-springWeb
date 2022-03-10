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

import global.sesoc.school.dao.ScoreDAO;
import global.sesoc.school.vo.ScoreVO;
import global.sesoc.school.vo.StudentVO;

@Controller
@RequestMapping("score")
public class ScoreController {
	private static final Logger logger = LoggerFactory.getLogger(ScoreController.class);

	@Autowired
	ScoreDAO scoreDAO;
	
	/* 성적입력으로 이동 */
	@RequestMapping(value = "add", method = RequestMethod.GET)
	public String addScore() {
		return "scorejsp/addScore";
	}
	
	/* 성적저장 */
	
	/* 전체성적으로 이동 이 때 다 펼쳐서 보여줘야 함*/
	@RequestMapping(value = "total", method = RequestMethod.GET)
	public String totalScore() {
		return "scorejsp/totalScore";
	}
	
	/* 성적통계로 이동 */
	@RequestMapping(value = "chart", method = RequestMethod.GET)
	public String chartScore() {
		return "scorejsp/chartScore";
	}
	
	

}

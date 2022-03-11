package global.sesoc.school.controller;

import java.util.ArrayList;
import java.util.HashMap;

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
public class ScoreController {
	private static final Logger logger = LoggerFactory.getLogger(ScoreController.class);

	@Autowired
	ScoreDAO scoreDAO;
	
	/**
	 * 성적 입력 폼으로 이동
	 * @param vo 저장할 성적 정보
	 */
	@RequestMapping(value = "/scoreInsert", method = RequestMethod.GET)
	public String scoreInsert() {
		return "scoreInsert";
	}
	
	/**
	 * 성적 저장
	 * @param vo 저장할 성적 정보
	 */
	@RequestMapping(value = "/scoreInsert", method = RequestMethod.POST)
	public String scoreInsert(ScoreVO vo) {
		logger.debug("저장할 성적 : {}", vo);
		
		scoreDAO.scoreInsert(vo);
		return "redirect:/";
	}
	
	/**
	 * 전체 성적 보기
	 */
	@RequestMapping(value = "/scoreList", method = RequestMethod.GET)
	public String scoreList(Model model) {
		ArrayList<ScoreVO> list = scoreDAO.scoreList();
		model.addAttribute("list", list);
		return "scoreList";
	}
	
	/**
	 * 성적 통계 페이지로 이동
	 */
	@RequestMapping(value = "/stats", method = RequestMethod.GET)
	public String stats() {
		return "stats";
	}

	/**
	 * 성적 계산하기
	 */
	@ResponseBody
	@RequestMapping(value = "/calc", method = RequestMethod.POST)
	public Integer calc(String stclass, String subject, String calc) {
		logger.debug("전달된 값 : {}, {}, {}", stclass, subject, calc);
		
		HashMap<String, String> map = new HashMap<>();
		map.put("stclass", stclass);
		map.put("subject", subject);
		map.put("calc", calc);
		logger.debug("map 내용 : {}", map);
		
		int score = scoreDAO.calc(map);
		
		return score;
	}


}

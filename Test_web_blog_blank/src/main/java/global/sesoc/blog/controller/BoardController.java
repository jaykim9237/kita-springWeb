package global.sesoc.blog.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import global.sesoc.blog.dao.BoardDAO;
import global.sesoc.blog.vo.BoardVO;
import global.sesoc.blog.vo.MemberVO;

/**
 * 블로그 콘트롤러
 * 블로그에 글쓰기, 읽기, 목록, 삭제, 수정, 추천 처리
 */
@Controller
@RequestMapping("board")
public class BoardController {
	
	@Autowired
	BoardDAO dao;
	
	//개인블로그(목록)으로 이동
	@RequestMapping(value = "list", method = RequestMethod.GET)
	public String list(Model model) {
		ArrayList<BoardVO> boardlist = dao.boardList();
		model.addAttribute("boardlist", boardlist);
		return "boardjsp/list";
	}
	//글읽기로 이동
	
	//글쓰기 폼으로 이동
	@RequestMapping(value = "write", method = RequestMethod.GET)
	public String write() {
		return "boardjsp/writeForm";
	}
	//글쓰기
	@RequestMapping(value = "write", method = RequestMethod.POST)
	public String write(BoardVO board, HttpSession session,	Model model) {
		return "boardjsp/writeForm";
	}
	//글 수정하기 폼으로 이동
	
	//글 수정하기
	
	//글 삭제하기
	
	//추천하기
	
	
	
}

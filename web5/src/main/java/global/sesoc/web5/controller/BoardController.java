package global.sesoc.web5.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import global.sesoc.web5.dao.BoardDAO;
import global.sesoc.web5.vo.Board;

@Controller
@RequestMapping("board")
public class BoardController {

	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);

	@Autowired
	BoardDAO dao;

	// 메인화면에서 "게시판" 클릭하면 게시판 목록이 출력되는 페이지로 이동
	@RequestMapping(value = "list", method = RequestMethod.GET)
	public String list(Model model) {
		ArrayList<Board> list = dao.list();
		logger.info("DB에서 가져온 목록{}", list);
		model.addAttribute("list", list);
		return "boardjsp/list";
	}

	// 글쓰기 폼으로 이동
	@RequestMapping(value = "write", method = RequestMethod.GET)
	public String write() {
		return "boardjsp/write";
	}

	// 글저장
	@RequestMapping(value = "write", method = RequestMethod.POST)
	public String write(Board board, HttpSession session) {
		//언제 loginId를 세션에 넣었냐면, 우리 멤버 컨트롤러에서 로그인 할 때 set으로 넣었어 
		String id = (String) session.getAttribute("loginId");
		logger.debug("로그인 아이디 {}", id);
		board.setId(id);
		dao.insertBoard(board);

		return "redirect:/board/list";
	}

	// 글 한개 읽는 기능
	@RequestMapping(value = "read", method = RequestMethod.GET)
	public String read(int num, Model model) {
		// DB에서 글 1개를 읽어서 모델에 저장하고 read.jsp로 포워딩
		logger.debug("전달 된 num:{}", num);
		Board board = dao.read(num);
		logger.debug("{}", board);
		// addAttribute의 " "에 들어가는 것은 타입이 아니고 새로운 변수를 선언해주는 것이야
		model.addAttribute("board", board);
		return "boardjsp/read";

	}

	// 글 수정폼으로 이동
	@RequestMapping(value = "update", method = RequestMethod.GET)
	public String update(int num, Model model) {
		// 전달받은 글번호(num)로 DB조회해서 해당 글 정보를 모델에 저장하고 jsp로 포워딩
		logger.debug("전달받은 num", num);
		Board board = dao.read(num); // 여기 리드로 받아서 넣는거 맞는지 여쭈기
		model.addAttribute("board", board);
		return "boardjsp/update";
	}

	//글 수정폼에 입력한 값을 전달받아 DB갱신
	  
	@RequestMapping(value = "update", method = RequestMethod.POST) 
	public String update(Board board, HttpSession session) { 
		//로그인 한 사용자가 본인글만 수정하도록 수정조건을 글번호와 작성자 아이디로 
		String id = (String) session.getAttribute("loginId");
		board.setId(id);
//		int num = dao.update(board); 내가 혼자 생각했지만 틀린 것
//		board.setBoardnum(num);
		dao.update(board);
		return "redirect:/board/list"; 
	 }
	 
	/*방법 1 처음부터 boardnum 값이 하나가 들어있는 것을 board객체로 받아온 것이지 만약에 그러지 않았다면 
	 		아래 방법처럼 board를 new로 새로 받아와야해 */
	@RequestMapping(value = "delete", method = RequestMethod.GET) 
	public String delete(Board board, HttpSession session) {
		String id = (String) session.getAttribute("loginId");
		board.setId(id);
		logger.debug("전달 된 파람 :{}", board);
		dao.delete(board);
		return "redirect:/board/list";
	}
	/* 방법 2
	@RequestMapping(value = "delete", method = RequestMethod.GET) 
	public String delete(int num, HttpSession session) {
		--boardnum을 그냥 num에 받아온 것이지 우리가 만든 것은 boardnum인데, 그니까 이거를 보드객체에 넣어줘야지
		--객체를 생성하기
		Board board = new Board();
		--보드넘에 num값을 넣어주는 것
		board.setBoardnum(num);
		--로그인 아이디를 받아서 넣어주는 것 
		String id = (String) session.getAttribute("loginId");
		board.setId(id);
		logger.debug("전달 된 파람 :{}", board);
		dao.delete(board);
		return "redirect:/board/list";
	}*/
}

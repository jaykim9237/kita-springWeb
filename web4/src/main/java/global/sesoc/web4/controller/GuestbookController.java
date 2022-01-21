package global.sesoc.web4.controller;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import global.sesoc.web4.dao.GuestbookDAO;
import global.sesoc.web4.vo.Guestbook;

/*방명록의 글쓰기, 읽기, 삭제를 위한 콘트롤러
 * 22.1.20
 * @author by 김현정
 * */

/*클래스 위에는 클래스에 대한 설명 변수위에는 메소드에는 그 것에 대한 각각의 설명을 적어야해
 * 어떤건지 누가 언제 만들었는지 왜 만들었는지*/

@Controller
public class GuestbookController {
	
	private static final Logger logger = LoggerFactory.getLogger(GuestbookController.class);
	
	@Autowired
	GuestbookDAO dao;
	
	
	
	/*
	 * 방명록 글쓰기 폼으로 이동
	 * @return 글쓰기 폼을 출력하는 write.jsp로 포워딩
	 * */
	@RequestMapping(value = "/write", method = RequestMethod.GET)
	public String write() {
		//쓰기 폼으로 이동
		
		return "write";
	}
	
	/**
	 * 뭐하는 메서드인지, 
	 * @param book 글쓰기 폼에서 사용자가 작성한 글 내용
	 * @return 방명록 화면으로 리다이렉트
	 */
	@RequestMapping(value = "/write", method = RequestMethod.POST)
	public String write2(Guestbook book) {
		//사용자가 쓴 글을 DB에 저장
		logger.debug("전달 된 param :{}", book);
		dao.insert(book);
		
		return "redirect:/list";
	}
	
	/*
	 * 글 목록을 보여주는 기능 dao의 글목록 읽기 메소드를 호출하여 글 목록을 리턴받는다. Model 객체에 글목록을 저장하고
	 * list.jsp로 포워딩
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(Model model) {
		
		ArrayList<Guestbook> list = dao.select();
		logger.debug("결과:{}",list);
		model.addAttribute("list", list);
		return "list";
	}
	/**
	 * 비밀번호가 맞는지 확인하고 삭제하는 메서드, 비밀번호가 맞는지는 어떻게 알 수 있냐면,
	 * sql형식으로 mapper.xml에서 where로 조건값을 줬잖아! 
	 * @param book
	 * @return
	 */

	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public String delete(Guestbook book) {
		logger.debug("전달된 파람 : {}", book);
		dao.delete(book);
		
		return "redirect:/list";
	}
	
	
}

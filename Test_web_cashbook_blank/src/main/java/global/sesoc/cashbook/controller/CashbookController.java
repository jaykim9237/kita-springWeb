package global.sesoc.cashbook.controller;

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

import global.sesoc.cashbook.dao.MemberDAO;
import global.sesoc.cashbook.dao.CashbookDAO;
import global.sesoc.cashbook.vo.MemberVO;
import global.sesoc.cashbook.vo.CashbookVO;

@Controller
@RequestMapping("cashbook")
public class CashbookController {
	
	@Autowired
	CashbookDAO dao;
	
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	//가계부로 이동
	@RequestMapping(value = "/cashbook", method = RequestMethod.GET)
	public String cashbook(String userid, Model model) {
		
		//회원의 가계부 목록
		ArrayList<CashbookVO> cashbooklist = dao.cashbook(userid);
		
		//회원의 아이디와 글 목록을 모델에 저장
		model.addAttribute("cashbooklist", cashbooklist);
		model.addAttribute("userId", userid);
		
		
		return "cashbook/cashbook";
	}
	
	//통계로 이동
	@RequestMapping(value = "/chart", method = RequestMethod.GET)
	public String chart(String userid, Model model) {
		
		//연도별 통계
		ArrayList<CashbookVO> chartlist = dao.chart(userid);
		
		//회원의 아이디와 통계목록을 모델에 저장
		model.addAttribute("chartlist", chartlist);
		model.addAttribute("userId", userid);
		return "cashbook/chart";
	}
	
	//수입등록
	@RequestMapping(value = "/income", method = RequestMethod.POST)
	public String income(CashbookVO cashbookvo,HttpSession session,	Model model) {
		//수입 아직 미완성
		String id = (String) session.getAttribute("loginId");
		cashbookvo.setUserid(id);
		int result = dao.income(cashbookvo);
		logger.debug("입금에서 전달 된 값 {}", cashbookvo); 
		if (result != 1) {
			//DB저장에 실패한 경우 가입폼으로 이동
			return "resirect";
		}
		
		return "redirect:/";
	}
	//지출등록
	@RequestMapping(value = "/spending", method = RequestMethod.POST)
	public String spending(CashbookVO cashbookvo,HttpSession session, Model model) {
		//수출 미완성
		String id = (String) session.getAttribute("loginId");
		cashbookvo.setUserid(id);
		dao.spending(cashbookvo);
		logger.debug("출금에서 전달 된 값 {}", cashbookvo); 
		
		return "redirect:/";
	}
	//삭제
	@RequestMapping (value="delete", method=RequestMethod.GET)
	public String delete(String infonum, HttpSession session) {
		//세션에서 로그인한 아이디 읽기
		String userid = (String) session.getAttribute("loginId");
		
		//삭제할 글 번호와 본인 글인지 확인할 로그인 아이디
		CashbookVO cashbook =new CashbookVO();
		cashbook.setInfonum(infonum);
		cashbook.setUserid(userid);
		
		logger.debug("넘어온 infonum : {}", infonum); 
		dao.delete(cashbook);
		return "redirect:/cashbook/cashbook";
	}
}

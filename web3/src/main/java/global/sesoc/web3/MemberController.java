package global.sesoc.web3;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import global.sesoc.web3.dao.MemberDAO;
import global.sesoc.web3.vo.Member;

/**
 * 회원 가입, 회원 목록 보기 컨트롤러
 */
@Controller
public class MemberController {
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	//회원관련 데이터 처리 객체
	@Autowired
	MemberDAO dao;
	
	
	
	//가입 폼으로 이동
	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public String viewJoinForm() {
		return "joinForm";
	}

	//가입 처리
	@RequestMapping(value = "/join", method = RequestMethod.POST)
	public String join(Member member) {
		logger.info("전달된 param : {}", member);
		
		int result = dao.insertMember(member);
		//위에 위에서 dao를 그냥 선언만해줬으니까 널이 나와야 정상인데 사용을하고 있지? 
		//이게 왜 그런지를 생각 해보면 위로가서 보면 어노테이션이 있지 Autowired 이거 
		//이거는 이 시스템이 동작하는 동안 계속 사용하는 중요한 객체,기능위주의 객체에 사용해
		
		if (result != 1) {
			return "joinForm";
		}
		return "redirect:/";
	}
	
	//회원 정보 보기 (1명)
		@RequestMapping(value = "/info", method = RequestMethod.GET)
		public String info(String id, Model model) {
			logger.debug("전달 된 아이디:{}", id);
			Member member = dao.selectMember(id);
			model.addAttribute("member", member);
			return "info";
	}
	
	//회원 목록 보기
	
	//회원 정보 삭제
		@RequestMapping(value = "/delete", method = RequestMethod.GET)
		public String delete(String id) {
			logger.debug("전달 된 아이디:{}", id);
			dao.deleteMember(id);
			return "redirect:/";
		}
}

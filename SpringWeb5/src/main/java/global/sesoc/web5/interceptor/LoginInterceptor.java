package global.sesoc.web5.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * 사용자 로그인 확인 인터셉터. HandlerInterceptorAdapter를 상속받아서 정의.
 * 누군가가 정의해놓은 것을 가져다 사용하는 것이니까. 
 * 웹브라우저로 부타 컨트롤러로 들어오는 과정에 인터셉터해서 조건을 판단해서 보내는거야, 위치가 컨트롤러 앞이라고 생각하면 좋아 
 * 
 */
public class LoginInterceptor extends HandlerInterceptorAdapter {
	private static final Logger logger = LoggerFactory.getLogger(LoginInterceptor.class);

	//이렇게 정의를 해놓고 실행을 하게 하려면, 
	
	//콘트롤러의 메서드 실행 전에 처리 --를 하는게 인터셉터 ..
	//아래 오버라이드 받은 것 타입(boolean)이랑 클래스 이름(preHandle) 똑같아야해
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		logger.debug("LoginInterceptor 실행");
		
		//세션의 로그인 정보 읽기
		//우리는 매게변수로 사용했었지 근데 그렇게 하면 안되구 이렇게 해야하는 거야 
		HttpSession session = request.getSession();
		String loginId = (String) session.getAttribute("loginId");
		
		//로그인되지 않은 경우 로그인 페이지로 이동
		if (loginId == null) {
			//request.getContextPath()로 루트 경로를 구하여 절대 경로로 처리
			/*
			 * 응답에 대한 객체, 의 sendRedirect객체를 사용해서 돌려보내는 것이야 
			 * 컨트롤러에서의 return redirect 를 하는거라고 보면 돼 
			 * 
			 * getContextPath() 는 우리가 막 localhost, abc.com이런 경로는 직접코드에 쓰면 안돼
			 * 그럴 때 써서 경로를 자동으로 불러오게 해주는 코드야 
			 * 
			 * 이프문에 걸리면 보내는 것이야 
			 */
			response.sendRedirect(request.getContextPath() + "/member/login");
			return false;
		}
		//로그인 된 경우 요청한 경로로 진행
		/* 만약에 안걸리면 로그인하려던 길 그냥 가게 만드는 것이야 */
		
		/*만약에 관리자 페이지를 만들어 그러면 위에 if조건에 그 계정에 대해서 널이 아니면 진입이 가능하게 만드는 것이지 
		 * 그리고 아니면 못들어가게 하면 그게 일반계정인 것이지*/
		return super.preHandle(request, response, handler);
	}

}

package global.sesoc.web3.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import global.sesoc.web3.dao.MemberMapper;
import global.sesoc.web3.vo.Member;

/**
 * 회원관련 DB 처리 클래스
 * DAO 데이터와 관련된 처리들을 해주는 것, 데이터와 소통해주는 곳이라고 생각하면 좋다.
 */


/*@Controller 객체를 생성해서 올련놓는 것을 말해. 그런데 다른 것으로 할 수 있다는 의미인가 다른 것으로
  @Service
  @Repository -데이터를 저장하고 데이터와 관련된 것
사실 셋다 똑같아 결과는 객체를 생성해서 먼저 올려두는 것이야*/

@Repository
public class MemberDAO {
	private static final Logger logger = LoggerFactory.getLogger(MemberDAO.class);
	
	//빈으로 등록된 객체를 가져옴
	@Autowired
	SqlSession sqlSession;
	
	//DB에 회원 정보 저장
	public int insertMember(Member member) {
		MemberMapper mapper = sqlSession.getMapper(MemberMapper.class);
		int result = 0;

		result = mapper.insert(member);
		return result;
	}

	
	//회원 정보 1명 조회
	public Member selectMember(String id) {
		MemberMapper mapper = sqlSession.getMapper(MemberMapper.class);
		Member m = mapper.select(id);
		/* 모델을 읽을 변수 잘 생각해야해 info.jsp에서 불러가서 사용하는 것이라서*/
		/*select 인터페이스를 만들어 놓고 바로 구현하는 것처럼 보일 수 있게 해놓는 것이 마이바티스가 해주는 것이야 */
		return m;
	}
	
	//회원 목록 
	public ArrayList<Member> listMember() {
		MemberMapper mapper = sqlSession.getMapper(MemberMapper.class);
		ArrayList<Member> list = mapper.list();
		return list;
	}
	
	//회원 정보 삭제
	public int deleteMember(String id) {
		MemberMapper mapper = sqlSession.getMapper(MemberMapper.class);
		int result = 0;

		result = mapper.delete(id);
		return result;
	}




	

}

package global.sesoc.cashbook.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import global.sesoc.cashbook.vo.MemberVO;

@Repository
public class MemberDAO {
	@Autowired
	private SqlSession sqlSession;

	public int insertMember(MemberVO membervo) {
		MemberMapper mapper = sqlSession.getMapper(MemberMapper.class);
		
		int result = 0;
		result = mapper.insertMember(membervo);
		return result;
	}

	public MemberVO getMember(String userid) {
		MemberMapper mapper = sqlSession.getMapper(MemberMapper.class);
		MemberVO member = mapper.getMember(userid);
		return member;
	}
	
}

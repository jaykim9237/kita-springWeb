package global.sesoc.web5.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import global.sesoc.web5.vo.Member;

@Repository
public class MemberDAO {
	
	@Autowired
	SqlSession sqlSession;
	
	public int insert(Member member) {
		MemberMapper mapper = sqlSession.getMapper(MemberMapper.class);
		int result = mapper.insert(member);
		return result;
	}

	public Member getMember(String id) {
		MemberMapper mapper = sqlSession.getMapper(MemberMapper.class);
		Member m = mapper.getMember(id);
		return m;
	}

	public int  update(Member member) {
		MemberMapper mapper = sqlSession.getMapper(MemberMapper.class);
		int result = mapper.update(member);
		return result;
	}
}
;
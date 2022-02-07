package global.sesoc.blog.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import global.sesoc.blog.vo.MemberVO;

/**
 * 회원 관련 DAO
 */
@Repository
public class MemberDAO {
	
	@Autowired
	SqlSession sqlSession;
	/*
	 * 회원가입처리
	 */
	public int insertMember(MemberVO membervo) {
		int result = 0;
		MemberMapper mapper = sqlSession.getMapper(MemberMapper.class);
		result = mapper.insertMember(membervo);
		return result;
	}
	public MemberVO getMember(String id) {
		MemberMapper mapper = sqlSession.getMapper(MemberMapper.class);
		MemberVO m = mapper.getMember(id);
		return m;
	}
	
	public ArrayList<MemberVO> listMember() {
		MemberMapper mapper = sqlSession.getMapper(MemberMapper.class);
		ArrayList<MemberVO> memberlist = mapper.listMember();
		return memberlist;
	}



}

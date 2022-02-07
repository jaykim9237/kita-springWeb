package global.sesoc.blog.dao;

import java.util.ArrayList;

import global.sesoc.blog.vo.MemberVO;

/**
 * 회원 관련 Mybatis 사용 메서드
 */
public interface MemberMapper {
	
	//회원가입
	public int insertMember(MemberVO membervo);
	
	//로그인 페이지
	public MemberVO getMember(String id);

	public ArrayList<MemberVO> listMember();




}

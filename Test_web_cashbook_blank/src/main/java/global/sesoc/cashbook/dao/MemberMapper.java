package global.sesoc.cashbook.dao;

import global.sesoc.cashbook.vo.MemberVO;

public interface MemberMapper {

	int insertMember(MemberVO membervo);

	MemberVO getMember(String userid);


}

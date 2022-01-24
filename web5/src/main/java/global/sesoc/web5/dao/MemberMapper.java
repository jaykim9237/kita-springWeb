package global.sesoc.web5.dao;

import global.sesoc.web5.vo.Member;

public interface MemberMapper {

	public int insert(Member member);

	public Member getMember(String id);

	public int update(Member member);

}

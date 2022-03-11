package global.sesoc.school.dao;

import global.sesoc.school.vo.AdminVO;

public interface AdminMapper {
	//관리자 정보 조회
	public AdminVO selectAdmin(String id);

}

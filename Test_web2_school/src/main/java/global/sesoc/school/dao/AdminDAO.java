package global.sesoc.school.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import global.sesoc.school.vo.AdminVO;

@Repository
public class AdminDAO {
	@Autowired
	private SqlSession sqlSession;
	
	/**
	 * 관리자 정보 검색
	 * @param id 검색할 회원 ID
	 * @return 검색결과를 담은 Member 객체
	 */
	public AdminVO getAdminInfo(String id) {
		AdminMapper mapper = sqlSession.getMapper(AdminMapper.class);
		AdminVO vo = mapper.selectAdmin(id);
		return vo;
	}

}

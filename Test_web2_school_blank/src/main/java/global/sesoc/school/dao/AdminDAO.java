package global.sesoc.school.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import global.sesoc.school.vo.AdminVO;

@Repository
public class AdminDAO {
	@Autowired
	private SqlSession sqlSession;

	public AdminVO getAdmin(String adminid) {
		AdminMapper mapper = sqlSession.getMapper(AdminMapper.class);
		AdminVO admin = mapper.getAdmin(adminid);
		return admin;
	}
	


}

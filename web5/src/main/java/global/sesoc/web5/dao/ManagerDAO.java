package global.sesoc.web5.dao;
import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import global.sesoc.web5.vo.Member;

@Repository
public class ManagerDAO {

	@Autowired
	SqlSession sqlSession;

	public ArrayList<Member> list() {
		ManagerMapper mapper = sqlSession.getMapper(ManagerMapper.class);
		ArrayList<Member> list = mapper.list();
		return list;
	}
}

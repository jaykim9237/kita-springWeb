package global.sesoc.school.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import global.sesoc.school.vo.AdminVO;
import global.sesoc.school.vo.ScoreVO;

@Repository
public class ScoreDAO {

	@Autowired
	SqlSession sqlSession;
	

}
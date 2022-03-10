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

	public int addScore(ScoreVO scorevo) {
		ScoreMapper mapper = sqlSession.getMapper(ScoreMapper.class);
		int result = mapper.addScore(scorevo);
		return result;
	}

	public ArrayList<ScoreVO> listScore() {
		ScoreMapper mapper = sqlSession.getMapper(ScoreMapper.class);
		ArrayList<ScoreVO> scorelist = mapper.listScore();
		return scorelist;
	}

	public ArrayList<ScoreVO> all_stclass(String text) {
		ScoreMapper mapper = sqlSession.getMapper(ScoreMapper.class);
		ArrayList<ScoreVO> all_stclass = mapper.all_stclass(text);

		return all_stclass;
	}
	

}
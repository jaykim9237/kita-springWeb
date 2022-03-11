package global.sesoc.school.dao;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import global.sesoc.school.vo.AdminVO;
import global.sesoc.school.vo.ScoreVO;

@Repository
public class ScoreDAO {

	@Autowired
	SqlSession sqlSession;
	
	/**
	 * 성적 등록
	 * @param vo 등록할 성적 정보
	 * @return 저장된 행 수
	 */
	public int scoreInsert(ScoreVO vo) {
		ScoreMapper mapper = sqlSession.getMapper(ScoreMapper.class);
		int result = mapper.scoreInsert(vo);
		return result;
	}
	
	/**
	 * 전체 성적 보기
	 * @return 모든 학생의 성적 정보
	 */
	public ArrayList<ScoreVO> scoreList() {
		ScoreMapper mapper = sqlSession.getMapper(ScoreMapper.class);
		ArrayList<ScoreVO> result = mapper.scoreList();
		return result;
	}

	/**
	 * 성적 통계
	 * @param map 계산할 조건
	 * @return 점수
	 */
	public int calc(HashMap<String, String> map) {
		ScoreMapper mapper = sqlSession.getMapper(ScoreMapper.class);
		int score = 0;
		
		score = mapper.calc(map);
		return score;
	}
	



}
package global.sesoc.school.dao;

import java.util.ArrayList;
import java.util.HashMap;

import global.sesoc.school.vo.ScoreVO;

//성적 처리
public interface ScoreMapper {
	//성적 등록
	public int scoreInsert(ScoreVO vo);
	//전체 성적 읽기
	public ArrayList<ScoreVO> scoreList();
	//성적 통계
	public int calc(HashMap<String, String> map);
}

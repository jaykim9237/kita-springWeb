package global.sesoc.school.dao;

import java.util.ArrayList;

import global.sesoc.school.vo.ScoreVO;
import global.sesoc.school.vo.StudentVO;

//성적 처리
public interface ScoreMapper {

	int addScore(ScoreVO scorevo);

	ArrayList<ScoreVO> listScore();

	ArrayList<ScoreVO> all_stclass(String text);

}

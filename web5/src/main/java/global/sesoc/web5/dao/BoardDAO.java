package global.sesoc.web5.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import global.sesoc.web5.vo.Board;

@Repository
public class BoardDAO {
	
	@Autowired
	SqlSession sqlSession;
	


	public int insertBoard(Board board) {
	BoardMapper mapper = sqlSession.getMapper(BoardMapper.class);
	int result	= mapper.insertBoard(board);
	return result;
	}



	public ArrayList<Board> list() {
		BoardMapper mapper = sqlSession.getMapper(BoardMapper.class);
		ArrayList<Board> list = mapper.list();
		return list;
	}



	public Board read(int num) {
		BoardMapper mapper = sqlSession.getMapper(BoardMapper.class);
		Board result = mapper.read(num);
		return result;
	}



	public Board update(Board board) {
		BoardMapper mapper = sqlSession.getMapper(BoardMapper.class);
		Board result = mapper.update(board);
		return result;
	}




}

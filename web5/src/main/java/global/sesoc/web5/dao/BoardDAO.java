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
	

	//입력된 값의 개수 (처리된 개수)를 알려고 하는 것이니까 출력을 해준 것이다.
	public int insertBoard(Board board) {
	BoardMapper mapper = sqlSession.getMapper(BoardMapper.class);
	int result	= mapper.insertBoard(board);
	return result;
	}


	//여기도 목록으로 출력되는 list를 보여주려고 하는 것이니까 출력을 해야지
	public ArrayList<Board> list() {
		BoardMapper mapper = sqlSession.getMapper(BoardMapper.class);
		ArrayList<Board> list = mapper.list();
		return list;
	}


	//여기는 board 값을 보여주려는 것이니까 당연히 출력을 board로 해야지!
	public Board read(int num) {
		BoardMapper mapper = sqlSession.getMapper(BoardMapper.class);
		Board result = mapper.read(num);
		//글을 하나 읽었어 이때 한번 읽을 때 마다 hit을 올려주는거야. 
		//메퍼에 함수를 하나 만들어 줘야해 그 함수에서 값을 올려주는 것을 받아서 mapper에 넣어주는 것이지
		mapper.updateHits(num);
		return result;
	}


	//여기 인트로 받아준 것은 처리한 개수를 보여주는 것이니까 안보여주려면 void로 받아도 되지
	public int update(Board board) {
		BoardMapper mapper = sqlSession.getMapper(BoardMapper.class);
		int result	= mapper.update(board);
		return result; 
	}


	public int delete(Board board) {
		BoardMapper mapper = sqlSession.getMapper(BoardMapper.class);
		int result = 0;
		result = mapper.delete(board);
		return result;
	}








}

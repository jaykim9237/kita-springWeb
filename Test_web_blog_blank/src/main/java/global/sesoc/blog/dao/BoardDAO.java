package global.sesoc.blog.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import global.sesoc.blog.vo.BoardVO;
import global.sesoc.blog.vo.MemberVO;

/**
 * 게시판 관련 DAO
 */
@Repository
public class BoardDAO {
	
	@Autowired
	SqlSession sqlSession;

	public ArrayList<BoardVO> boardList() {
		BoardMapper mapper = sqlSession.getMapper(BoardMapper.class);
		ArrayList<BoardVO> boardlist = mapper.boardList();
		return boardlist;
	}
	
	

}

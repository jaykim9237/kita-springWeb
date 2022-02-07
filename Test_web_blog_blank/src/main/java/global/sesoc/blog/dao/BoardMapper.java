package global.sesoc.blog.dao;

import java.util.ArrayList;

import global.sesoc.blog.vo.BoardVO;

/**
 * 블로그 글 관련 Mybatis 사용 메서드
 */
public interface BoardMapper {

	ArrayList<BoardVO> boardList();


}

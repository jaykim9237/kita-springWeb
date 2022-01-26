package global.sesoc.web5.dao;

import java.util.ArrayList;

import global.sesoc.web5.vo.Board;

public interface BoardMapper {


		public int insertBoard(Board board);

		public ArrayList<Board> list();

		public Board read(int num);

		public int update(Board board);

		public int delete(Board board);

		public int updateHits(int num);



}

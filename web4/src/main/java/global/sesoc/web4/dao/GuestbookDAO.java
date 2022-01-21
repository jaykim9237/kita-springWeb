package global.sesoc.web4.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import global.sesoc.web4.vo.Guestbook;

/*방명록 DAO*/

@Repository
public class GuestbookDAO {

	@Autowired
	SqlSession sqlSession;
	/*
	 * 객체를 생성해서 받아온 것 이 객체 생성을 아까 안해준거야 그래서 문제가 어디었냐면 서블랫 콘텍스트에 빈들이 없었어,,,그래서 웹3을
	 * 배껴서 왔움
	 */
	
	// 글저장
	public int insert(Guestbook board) {
		GuestbookMapper mapper = sqlSession.getMapper(GuestbookMapper.class);
		int res = mapper.insert(board);
		return res;
	}
	
	//회원목록
	public ArrayList<Guestbook> select() {
		GuestbookMapper mapper = sqlSession.getMapper(GuestbookMapper.class);
		ArrayList<Guestbook> list = mapper.list();
		return list;
	}

	//회원삭제
	public int delete(Guestbook book) {
		GuestbookMapper mapper = sqlSession.getMapper(GuestbookMapper.class);
		int result = 0;
		
		result = mapper.delete(book);
		return result;
	}
}

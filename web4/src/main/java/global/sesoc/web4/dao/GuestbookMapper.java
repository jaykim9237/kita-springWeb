package global.sesoc.web4.dao;

import java.util.ArrayList;

import global.sesoc.web4.vo.Guestbook;

/*회원정보 관련 Mybatis 사용 메서드
GuestMapper.xml의 id와 똑같이 매핑 해야함*/

public interface GuestbookMapper {
		public int insert(Guestbook guest);
		
		public ArrayList<Guestbook> list();

		public int delete(Guestbook book);
	}


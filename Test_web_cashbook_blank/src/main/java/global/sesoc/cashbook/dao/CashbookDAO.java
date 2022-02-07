package global.sesoc.cashbook.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import global.sesoc.cashbook.vo.CashbookVO;
import global.sesoc.cashbook.vo.MemberVO;

@Repository
public class CashbookDAO {

	@Autowired
	SqlSession sqlSession;

	public int income(CashbookVO cashbookvo) {
		CashbookMapper mapper = sqlSession.getMapper(CashbookMapper.class);
		int result = 0;
		result = mapper.income(cashbookvo);
		return result;
	}

	public int spending(CashbookVO cashbookvo) {
		CashbookMapper mapper = sqlSession.getMapper(CashbookMapper.class);
		int result = 0;
		result = mapper.spending(cashbookvo);
		return result;
	}

	public ArrayList<CashbookVO> cashbook(String userid) {
		CashbookMapper mapper = sqlSession.getMapper(CashbookMapper.class);
		ArrayList<CashbookVO> cashbooklist = mapper.cashbook(userid);
		return cashbooklist;
	}

	public ArrayList<CashbookVO> chart(String userid) {
		CashbookMapper mapper = sqlSession.getMapper(CashbookMapper.class);
		ArrayList<CashbookVO> chartlist = mapper.chart(userid);
		return chartlist;
	}

	public int delete(CashbookVO cashbook) {
		CashbookMapper mapper = sqlSession.getMapper(CashbookMapper.class);
		int result = 0;
		result = mapper.delete(cashbook);
		return result;
	}

		
}

package global.sesoc.cashbook.dao;

import java.util.ArrayList;

import global.sesoc.cashbook.vo.CashbookVO;
import global.sesoc.cashbook.vo.MemberVO;

public interface CashbookMapper {

	int income(CashbookVO cashbookvo);

	int spending(CashbookVO cashbookvo);

	ArrayList<CashbookVO> cashbook(String userid);

	ArrayList<CashbookVO> chart(String userid);

	int delete(CashbookVO cashbook);



}

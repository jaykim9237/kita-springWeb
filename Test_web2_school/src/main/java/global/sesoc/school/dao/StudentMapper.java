package global.sesoc.school.dao;

import java.util.ArrayList;

import global.sesoc.school.vo.StudentVO;

//학생정보 처리
public interface StudentMapper {
	//학생 등록
	public int insert(StudentVO vo);
	//전체 학생 목록
	public ArrayList<StudentVO> list();
	//1명의 학생 정보 조회
	public StudentVO select(String stnum);
	//학생 정보 삭제
	public int delete(String stnum);
	//학생 정보 수정
	public int update(StudentVO vo);
}

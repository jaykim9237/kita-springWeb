package global.sesoc.school.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import global.sesoc.school.vo.AdminVO;
import global.sesoc.school.vo.StudentVO;

@Repository
public class StudentDAO {

	@Autowired
	SqlSession sqlSession;
	
	/**
	 * 학생 등록
	 * @param vo 등록할 학생 정보
	 * @return 저장된 행 수
	 */
	public int insert(StudentVO vo) {
		StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
		int result = mapper.insert(vo);
		return result;
	}
	
	/**
	 * 1명의 학생 정보 조회
	 * @param stnum 조회할 학생 번호
	 * @return 학생 정보
	 */
	public StudentVO select(String stnum) {
		StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
		StudentVO result = mapper.select(stnum);
		return result;
	}
	
	/**
	 * 전체 학생 목록 조회
	 * @return 학생 목록
	 */
	public ArrayList<StudentVO> list() {
		StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
		ArrayList<StudentVO> list = mapper.list();
		return list;
	}
	
	/**
	 * 학생 정보 삭제
	 * @param stnum 삭제할 학생 번호
	 * @return 삭제된 행 수 
	 */
	public int delete(String stnum) {
		StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
		int result = mapper.delete(stnum);
		return result;
	}

	/**
	 * 학생 정보 수정
	 * @param vo 수정할 정보
	 * @return 수정된 행 수 
	 */
	public int update(StudentVO vo) {
		StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
		int result = mapper.update(vo);
		return result;
	}





}
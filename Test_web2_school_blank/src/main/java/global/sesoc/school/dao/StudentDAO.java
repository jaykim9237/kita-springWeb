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

	public int enrollStudent(StudentVO studentvo) {
		StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
		int result = mapper.enrollStudent(studentvo);
		return result;
	}

	public ArrayList<StudentVO> listStudent() {
		StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
		ArrayList<StudentVO> studentlist = mapper.listStudent();
		return studentlist;
	}

	public int deleteStudent(String stclass, String stnum) {
		StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
		int result = mapper.deleteStudent(stclass, stnum);
		return result;
	}

	public int editStudent(String stclass, String stnum) {
		StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
		int result = mapper.editStudent(stclass, stnum);
		return result;
	}
	




}
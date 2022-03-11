package global.sesoc.school.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import global.sesoc.school.controller.StudentController;
import global.sesoc.school.vo.AdminVO;
import global.sesoc.school.vo.StudentVO;

@Repository
public class StudentDAO {

	@Autowired
	SqlSession sqlSession;
	private static final Logger logger = LoggerFactory.getLogger(StudentController.class);

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

	public int deleteStudent(String stnum) {
		StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
		logger.debug("학생 삭제 학번 dao {}", stnum);
		int result = mapper.deleteStudent(stnum);
		return result;
	}

	public StudentVO oneStudent(String stnum) {
		StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
		StudentVO studentvo = mapper.oneStudent(stnum);

		return studentvo;
	}

	public int editStudent(StudentVO studentvo) {
		StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
		int result = mapper.editStudent(studentvo);
		return result;
	}

	public ArrayList<StudentVO> listClass() {
		StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
		ArrayList<StudentVO> classlist = mapper.listClass();
		return classlist;
	}





}
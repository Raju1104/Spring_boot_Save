package p.com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import p.com.Dao.StudentDao;
import p.com.Entity.Student;

@Component
public class Studentservice {
	@Autowired
	private StudentDao studentDao;

	public void add(Student student) {

		studentDao.save(student);
	}

	public Student findbyid(int id) {
		Optional<Student> optional = studentDao.findById(id);

		if (optional.isPresent()) {
			return optional.get();
		} else {
			throw new RuntimeException("Student Not Found.....: " + id);
		}

	}

	public Student deletebyid(int id) {
		studentDao.deleteById(id);
		return null;

	}

	public List<Student> findAll() {
		List<Student> list = studentDao.findAll();
		return list;
	}

	public List<Student> findStudentByFirstName(String fname) {
		List<Student> list = studentDao.xyz(fname);
		return list;
	}

	public List<Student> findStudentByLastName(String lname) {
		List<Student> list = studentDao.abc(lname);
		return list;
	}
	
}

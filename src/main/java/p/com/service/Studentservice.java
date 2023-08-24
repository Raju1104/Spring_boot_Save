package p.com.service;

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
	
}}

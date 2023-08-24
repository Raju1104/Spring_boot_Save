package p.com.service;

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

	
}

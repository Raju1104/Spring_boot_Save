package p.com.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import p.com.Entity.Student;
import p.com.service.Studentservice;

@RestController
public class Homecontroller {

	@Autowired
	private Studentservice studentservice;

	@PostMapping("/student")
	public String add(@RequestBody Student student) {
		studentservice.add(student);

		return "Data Added Successfully";

	}

	@GetMapping("/student/id/{id}")
	public Student findStudentById(@PathVariable int id) {
		return studentservice.findbyid(id);
	}

	@DeleteMapping("/student/id/{id}")
	public Student deleteStudentById(@PathVariable int id) {
		return studentservice.deletebyid(id);
	}


	@GetMapping("/student")
	public List<Student> findall() {
		List<Student> list = studentservice.findAll();
		
		return list ;
	}
	@GetMapping("/student/firstname/{fname}")
	public List<Student> findStudentByFirstName(@PathVariable String fname) {
		List<Student> list = studentservice.findStudentByFirstName(fname);
		 return list ;
	}
	@GetMapping("/student/lastname/{lname}")
	public List<Student> findByLastName(@PathVariable String lname) {
		List<Student> list = studentservice.findStudentByLastName(lname);
		 return list ;
	}

}

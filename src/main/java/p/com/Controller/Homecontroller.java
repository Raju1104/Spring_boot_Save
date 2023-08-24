package p.com.Controller;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	
	

}

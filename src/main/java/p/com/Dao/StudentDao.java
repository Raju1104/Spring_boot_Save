package p.com.Dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import p.com.Entity.Student;

public interface StudentDao extends JpaRepository<Student, Integer> {

//	List<Student> findByfname(String fname);
//        
	@Query(value="select * from student where fname = ?",nativeQuery = true)
	List<Student> xyz(String fname);
	
	@Query(value="select s from Student s where s.lname =:ln",nativeQuery=false)
	List<Student> abc(@Param(value="ln") String ln);
}

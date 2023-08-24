package p.com.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import p.com.Entity.Student;

public interface StudentDao  extends JpaRepository<Student, Integer>{

}

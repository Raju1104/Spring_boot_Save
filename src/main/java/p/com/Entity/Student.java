package p.com.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "student")
public class Student { 
	  
	@Column(name = "id")
	@Id
	@GeneratedValue
	private int id;

	@Size(max = 4, message=" Please Enter Proper Name.........")
	@Column(name = "fname")
	private String fname;

	@Column(name = "lname")
	private String lname;

	@Column(name = "address")	 
	private String address;

	public Student() {
	};

	public Student(int id, String fname, String lname, String address) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}

package com.week2ass.week2.StudentController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.week2ass.StudentService.AddressService;
import com.week2ass.StudentService.StudentService;
import com.week2ass.Studentbean.AddressBean;
import com.week2ass.Studentbean.StudentBean;
import com.week2ass.Studentbean.Studentbean2;

@RestController
public class StudentController {
	@Autowired
	private StudentService stu;
	@Autowired
	private AddressService addr;
	@RequestMapping("/home")
	
	public String disply(){
		System.out.println("Hello");
		return "Welcome";
		
	}
	 //b.Using Get request  method retrieve all employee details
	@GetMapping("/stu")
	@ResponseBody
	
	 public  List<StudentBean> retriveAllStudents()
	  {
		 return this.stu.findEmpList();
	  }

	 //Based on the id getting employee details
	 @GetMapping("//{id}")
	 public  StudentBean retriveStudent(@PathVariable Integer id)
	 {
		 return this.stu.dispalyemployee(id);
	 }
	 @GetMapping("/address")
	 public  List<Studentbean2> retriveAllStudentWithAddress()
	 {
		 return this.stu.Addaddress(addr.findAllAddress());
	 }
	 @PutMapping("/update")
	
	 public @ResponseBody Studentbean2 updateStudentAddress(@RequestBody AddressBean upd) {
		 addr.save(upd);
		 return this.stu.updateAddress(upd);
		 
	    
	      }
	 @GetMapping("/concat")
	 public String concatNames() {
		 return this.stu.concatnames();
	 }
	 

}

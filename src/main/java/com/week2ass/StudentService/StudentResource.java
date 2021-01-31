package com.week2ass.StudentService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.week2ass.Studentbean.AddressBean;
import com.week2ass.Studentbean.StudentBean;
import com.week2ass.Studentbean.Studentbean2;

@Component("resbean")
public class StudentResource implements StudentService {
	//List<String> arrayList=new ArrayList<String>();
	private static List<StudentBean> stu =new ArrayList<>();
	private static List<Studentbean2> stu2 =new ArrayList<>();
	static{
		stu.add(new StudentBean(1,"Hema"));
		stu.add(new StudentBean(2,"Sam"));
		stu.add(new StudentBean(3,"Ram"));
		stu.add(new StudentBean(4,"Karna"));
		
		stu2.add(new Studentbean2(1,"Hema"));
		stu2.add(new Studentbean2(2,"Sam"));
		stu2.add(new Studentbean2(3,"Ram"));
		stu2.add(new Studentbean2(4,"Karna"));
	}
	@Override

	
	public List<StudentBean> findEmpList(){
		return stu;
	}
	@Override

	public StudentBean dispalyemployee(Integer id) {
		// TODO Auto-generated method stub
		StudentBean employee = null;
		for(StudentBean e:stu)
		{ 
			if(e.getStuId()==id)
			{  
				employee=e;
				break;
			}
		}
		return employee ;
	}
	@Override
	public List<Studentbean2> Addaddress(List<AddressBean> findAllAddress) {
		// TODO Auto-generated method stub
		for(AddressBean a:findAllAddress)
			for(Studentbean2 e:stu2)
			{ 
				if(e.getId()==a.getId())
				{  
					e.setA(a);
				}
			}
		return stu2;
	}
	@Override
	public Studentbean2 updateAddress(AddressBean upd) {
		// TODO Auto-generated method stub
		Studentbean2 s=null;
		for(Studentbean2 e:stu2)
		{ 
			if(e.getId()==upd.getId())
			{  
				e.setA(upd);
				s=e;
			}
		}
		return s;
	}
	@Override
	public String concatnames() {
		// TODO Auto-generated method stub
		String name1=stu.stream().map(emp->emp.getStuName()).collect(Collectors.joining(""));
		return name1;
	}
	
	

}

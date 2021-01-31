package com.week2ass.StudentService;

import java.util.List;

import com.week2ass.Studentbean.AddressBean;
import com.week2ass.Studentbean.StudentBean;
import com.week2ass.Studentbean.Studentbean2;

public interface StudentService {

	List<StudentBean> findEmpList();

	StudentBean dispalyemployee(Integer id);

	List<Studentbean2> Addaddress(List<AddressBean> findAllAddress);

	Studentbean2 updateAddress(AddressBean upd);

	String concatnames();

	

}

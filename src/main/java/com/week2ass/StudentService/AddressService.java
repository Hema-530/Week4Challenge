package com.week2ass.StudentService;

import java.util.List;

import com.week2ass.Studentbean.AddressBean;

public interface AddressService {

	public  List<AddressBean > findAllAddress();

	public void save(AddressBean upd);

}

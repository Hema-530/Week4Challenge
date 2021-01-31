package com.week2ass.StudentService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.week2ass.Studentbean.AddressBean;

@Component
public class AddressResource implements AddressService {
	public static List<AddressBean > a=new ArrayList<AddressBean >();
	static {
	a.add(new AddressBean(1,"Hyd","TS","India"));
	a.add(new AddressBean(2,"Ban","KA","India"));
	a.add(new AddressBean(3,"Chen","TN","India"));
	a.add(new AddressBean(4,"Hyd","TS","India"));
	a.add(new AddressBean(5,"Vzg","AP","India"));
	a.add(new AddressBean(6,"Hyd","TS","India"));
	
	}
	@Override
	public List<AddressBean> findAllAddress() {
		// TODO Auto-generated method stub
		return a;
	}
	@Override
	public void save(AddressBean upd) {
		// TODO Auto-generated method stub
		for(AddressBean s:a) {
			if(s.getId()==upd.getId()) {
				s.setCity(upd.getCity());
				s.setCountry(upd.getCountry());
				s.setState(upd.getState());
			}
		}
	}
	
	
}

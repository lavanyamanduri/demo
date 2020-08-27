package com.bridgelabz.aop.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.aop.dao.Dao2;

@Service
public class Business2 {
	
	@Autowired
	private Dao2 dao2;
	
	public String calculateSomething(){
		//Business Logic
		return dao2.retrieveSomething();
	}
}
package com.pack.javabasedconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CollegeConfiguration {

	@Bean
	public College1 methodcollege()
	{System.out.println("Collegeclass object");
		College1 col=new College1();
		System.out.println("Before"+col.getCollegeId());
		col.setCollegeId(1);    //passing value from configuration class
	     col.setCollegeName("SJCIT");
		col.setDepartment(methodDepartment());
		
		System.out.println("After"+col.getCollegeId());
		System.out.println("this sysoutis used to understand the way of excutio of the program");
		return col;
	}
	
	
	@Bean
	public Department1 methodDepartment()
	{
		Department1 dept=new Department1();
		System.out.println("Department Class Object");
		System.out.println("value  "+dept.getDeptId());
	dept.setDeptId(101);
		dept.setDeptName("CSE");
		return dept;
	}
	


}

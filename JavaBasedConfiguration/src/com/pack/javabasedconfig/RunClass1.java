package com.pack.javabasedconfig;



import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context= new AnnotationConfigApplicationContext(CollegeConfiguration.class);
		College1 obj= context.getBean(College1.class);
		
		
		System.out.println("----"+obj.getDepartment().getDeptId());
	
		/* obj.setCollegeId(101);           //passing value to college class variables from main class
		obj.setCollegeName("SJCIT");
	
		Department1 department = obj.getDepartment();//passing value to Department class variables from main class
		department.setDeptId(101);
		department.setDeptName("ISE"); */ // this method is more difficult to understand better set the data in college configuration class only
		
		System.out.println("collegeID is:"+obj.getCollegeId()+ " CollegeName is: "+obj.getCollegeName());
		System.out.println("Department ID is: "+obj.getDepartment().getDeptId());
        System.out.println("Department Name is : "+obj.getDepartment().getDeptName());
	}

}

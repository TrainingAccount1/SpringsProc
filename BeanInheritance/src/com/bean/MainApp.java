package com.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ApplicationContext text=new ClassPathXmlApplicationContext("Beans.xml");
				HelloWorld obj1= (HelloWorld) text.getBean("hello1");
				obj1.getMessage1();
				obj1.getMessage2();
				
				HelloIndia obj2 =(HelloIndia) text.getBean("hello2");
				obj2.getMessage1();
				obj2.getMessage2();
				obj2.getMessage3();
		
	}

}

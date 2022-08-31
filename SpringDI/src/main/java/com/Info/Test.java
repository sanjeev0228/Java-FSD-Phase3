package com.Info;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
		//firstway --BeanContext
		@SuppressWarnings("deprecation")
		Resource resource = new ClassPathResource("application.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Student s=(Student)factory.getBean("stud");
		System.out.println("name"+s.getName());
		
		//Second --application context
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml"); 
	    Student stud=(Student)context.getBean("stud");
		System.out.println("name="+stud.getName());
		
		 Student stud1=(Student)context.getBean("stud1");
			System.out.println("name="+stud1.getName());
		
	}

}

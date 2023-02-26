package org.antwalk;

import java.util.List;


import org.antwalk.dao.EmployeeDaoImpl;
import org.antwalk.model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	   TeacherDao tr =(TeacherDao)context.getBean("teacherDaoImpl");
		System.out.println("Adding record");
		emp.create("shreya",23,5000000l );
		
		
		List<Teacher>Teachers =tr.listTeachers();
		for(Teacher tr1:Teachers) {
		System.out.println("id  "+tr1.getEmpid());
		System.out.println("Name "+tr1.getName());
		System.out.println("Address "+tr1.getAddress());

		
	}
	
	}
}

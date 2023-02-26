package org.antwalk;

import java.util.List;


import org.antwalk.dao.EmployeeDaoImpl;
import org.antwalk.model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		EmployeeDao emp =(EmployeeDao)context.getBean("employeeDaoImpl");
		System.out.println("Adding record");
		emp.create("shreya",23,5000000l );
		
		
		List<Employee>employees =emp.listEmployees();
		for(Employee emp1:employees) {
		System.out.println("id  "+emp1.getEmpid());
		System.out.println("title  "+emp1.getName());
		System.out.println("Author "+emp1.getAge());
		System.out.println("Price"+emp1.getSalary());
		
	}
	
	}
}

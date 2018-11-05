package com.mypackage.assessment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.mypackage.assessment.bean.Employee;

public class Exercise1 {
	
	private static List<Employee> employees = new ArrayList<Employee>();

	private static void init() {
		employees.add(new Employee(1001, "Victor", "72, Main St, Rukle", 10000));
		employees.add(new Employee(1002, "Victor", "72, Main St, Rukle", 13000));
		employees.add(new Employee(1003, "Victor", "72, Main St, Rukle", 15000));
		employees.add(new Employee(1004, "Victor", "72, Main St, Rukle", 11500));
		employees.add(new Employee(1005, "Victor", "72, Main St, Rukle", 12250));
		
	}
	
	public static void main(String[] args) {
		init();
		
		Collections.sort(employees);
		
		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}
}

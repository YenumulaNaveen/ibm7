package com.ibm.test;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.ibm.dao.EmpDeptDao;
import com.ibm.entity.Department;
import com.ibm.entity.Employee;

public class TestEmpDept {
	private static EmpDeptDao dao;
	
	@BeforeAll
	public static void setup() {
		dao = new EmpDeptDao();
	}
	@Test
	public void testSaveDept() {
		Department dept = new Department();
		dept.setDeptNo(12);
		dept.setDeptName("Sales");
		dao.addDept(dept);
	}
	@Test
	public void TestSaveEmp() {
		Employee emp = new Employee();
		emp.setEmpName("Naveen");
		emp.setSalary(5000);
		dao.addEmp(emp, 20);
	}
	@Test
	public void testFindDept() {
		Department dept = dao.findDept(12);
		System.out.println(dept);
		dept.getEmps().forEach(System.out::println);
	}
	@Test
	public void testRemoveDept() {
		dao.removeDept(20);
	}

}

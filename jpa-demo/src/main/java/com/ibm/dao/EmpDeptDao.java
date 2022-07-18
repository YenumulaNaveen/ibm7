package com.ibm.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import com.ibm.entity.Department;
import com.ibm.entity.Employee;
import com.ibm.entity.Customer;
import com.mysql.cj.Query;

public class EmpDeptDao {
	private EntityManagerFactory factory;

	public EmpDeptDao() {
		factory = Persistence.createEntityManagerFactory("MyJPA");
	}

	public int addDept(Department d) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(d);
		tx.commit();
		em.close();
		return d.getDeptNo();
	}

	public int addEmp(Employee e, int deptId) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Department d = em.find(Department.class, deptId);
		e.setDept(d);
		em.persist(e);
		tx.commit();
		em.close();
		return e.getEmpNo();

	}

	public void removeDept(int deptId) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Department d = em.find(Department.class, deptId);
		em.remove(d);
		tx.commit();
		em.close();
	}

	public Department findDept(int deptId) {
		EntityManager em = factory.createEntityManager();
		Department d = em.find(Department.class, deptId);
		return d;
	}

	public Employee findEmp(int empId) {
		EntityManager em = factory.createEntityManager();
		return em.find(Employee.class, empId);

	}

	public List<Employee> listEmp() {
		EntityManager em = factory.createEntityManager();
		javax.persistence.Query q = em.createQuery("from Employee");
		return q.getResultList();
	}
}

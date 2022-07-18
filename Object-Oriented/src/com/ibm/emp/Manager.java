package com.ibm.emp;
public class Manager extends Employee {
	private double commission;
	
	public Manager() {
	}

	public Manager(int empNo, String empName, double salary, double commission) {
		super(empName, salary);
		this.commission = commission;
	}

	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return super.getSalary() + commission;
	}

	@Override
	public void payslip() {
		super.payslip();
		System.out.println("Commission: " + commission);
	}
	

}

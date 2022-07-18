package com.ibm.bank;

/**
 * This class represents generalised bank account
 * @author 003S5R744
 *@version 
 */
public abstract class Accounts implements Bank {
	private int acntNo;
	private String holder;
	protected double balance;
	
	private static int autogen = INIT_ACNT_NO;
	protected Transaction[] txns;
	protected int idx;
	/** Default constructor.*/
	public Accounts() {
	}
	/**
	 * Parameterised constructor.
	 * @param holder
	 * @param balance
	 */
	
	public Accounts(String holder,double balance) {
		this.acntNo = autogen ++;
		this.holder = holder;
		this.balance = balance;
	}
	
	public void summary() {
		System.out.println("A/C NO: " + acntNo);
		System.out.println("Holder: " + holder);
		System.out.println("Balance: " + balance);
	}
	// Business Logic Methods
	public void deposit(double amount) {
		balance += amount;
		System.out.println("After deposit: " + balance);
	}
	
	public abstract void withdraw(double amount) throws BalanceException;
	
	public void statement() {
		System.out.println("Statement of A/C No:" + acntNo);
		//for(int i=0; i<idx; i++)
			//txns[i].print();
	}
	

}

package com.ibm.bank;
public class TestAccounts {
	
	public static void main(String[] args) {
		Bank s1 = AccountsFactory.openSavings("Naveen");
		try {
			s1.withdraw(1000);
		} catch (BalanceException e) {
			e.printStackTrace();// for Developer, to trobleshoot the problem
			System.out.println(e);// for logging to audit the behaviour of the application
			System.out.println(e.getMessage());// for end users information
		}
	}

}

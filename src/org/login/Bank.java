package org.login;

public class Bank extends Company{

	private void bankId() {
		System.out.println("Bank id is 5432");
	}

	public static void main(String[] args) {
		Bank b = new Bank();
		b.bankId();
		b.companyId();
		
		
		
	}

}

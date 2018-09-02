package oop;

public class AccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoanAccount la= new LoanAccount();
		la.increaseRate();
		la.setRate();
		la.setAmmortSchedule();
		la.setTerms(20);
		
		//Polymorphis changes where we are pointing
		IRate account1 = new LoanAccount();
		account1.setRate();
		account1.increaseRate();
	}

}

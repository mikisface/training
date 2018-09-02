package oop;

public class LoanAccount implements IRate {

	@Override
	public void setRate() {
		System.out.println("Rate");
		
	}

	@Override
	public void increaseRate() {
		System.out.println("Increase Rate");
		
	}
	
	public void setTerms(int terms) {
		System.out.println("Setting the terms to: "+ terms +" years");
	}
	
	public void setAmmortSchedule() {
		System.out.println("Ammortization schedule");
	}
	
}

package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		//Creating a bank account
		BankAccount acc1=new BankAccount();
		acc1.accountNumber="01234564";
		//acc1.name="Michele";
		//With Encapsulation : public API methods
		acc1.setName("Michele");
		System.out.println(acc1.getName());
		acc1.setSsn("123456");
		System.out.println(acc1.getSsn());
		acc1.balance=10000;
		
		acc1.setRate();
		acc1.increaseRate();
		
		
		
		acc1.Deposit(1500);
		
		//polymorphism through overriding
		System.out.println(acc1.toString());
		
		//polymorphism through overloading
		BankAccount acc2=new BankAccount("Checking Account");
		
		BankAccount acc3=new BankAccount("Savings",5000);
		
		/*
		acc3.CheckBalance();
		
		//Demo for inheritance
		CDAccount cd1=new CDAccount();
		cd1.name="ciccia";
		cd1.interestRate="4.5";
		cd1.balance=3000;
		cd1.accountType="CD Account";
		cd1.compount();
		System.out.println(cd1.toString());
*/
	}

}

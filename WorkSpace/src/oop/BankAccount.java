package oop;

public class BankAccount implements IRate {
	//Define variables
	String accountNumber;
	
	//static>> belong to the class not the object instance
	//final>> constant
	private static final String routingNumber="0123456";
	
	//Instance variables
	String accountType;
	private String name;
	private String ssn;
	double balance;
	
	//Constructor definition: unique methods
		//1. Used to define / setup / initialize properties of an object
		//2. Constructors are IMPLICITY  called upon INSTANTIATION
		//3. The same name as the class itself
		//4. Constructors have NO return type at all
	BankAccount(){
		System.out.println("NEW ACCOUNT CREATED");
	}
	//Overloading: call same method name with different arguments
	BankAccount(String accountType){
		System.out.println("NEW ACCOUNT: "+ accountType);
	}
	BankAccount(String accountType,double initDeposit){
		//initDeposit, accountType, Msg are local variables
		System.out.println("NEW ACCOUNT: "+ accountType);
		System.out.println("Initial deposit of: "+ initDeposit);
		String Msg=null;
		if(initDeposit <1000) {
			Msg ="ERROR Minimum deposit must be at least $1.000";
		}else {
			Msg="Thanks for your intial deposit of $"+initDeposit;
		}
		System.out.println(Msg);
		balance=initDeposit;
	}
	//Getters and Setters 
	
	// Allow the user to define the name
	public void setName(String name) {
		this.name="Mr. "+name;
	}
	public String getName() {
		return name;
	}
	
	//Allow the user to define the ssn
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = "Client Social Security Number: "+ssn;
	}
	
	public void setRate() {
		
	}
	public void increaseRate() {
		
	}
	
	//Define method
	public void Deposit(double amount) {
		balance=balance+amount;
		ShowActivity("DEPOSIT");
	}
	void Withdraw(double withdraw) {
		balance= balance-withdraw;
		ShowActivity("WITHDRAW");

	}
	//private>> can only be called from within the class
	private void ShowActivity(String activity) {
		System.out.println("Your recent transaction "+activity);
		System.out.println("YOUR NEW BALANCE IS: $"+balance);
	}
	void CheckBalance() {
		System.out.println("balance is: "+balance);
	}
	void GetStatus() {
		
	}
	@Override
	public String toString() {
		return "[ NAME: " + name +". ACCOUNT#: "+accountNumber+". ROUTING#: "+routingNumber+". BALANCE: $"+balance +" ]";
	}
}

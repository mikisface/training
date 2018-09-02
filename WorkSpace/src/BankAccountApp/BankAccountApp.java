package BankAccountApp;

public class BankAccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount acc1=new BankAccount("12345",1000);
		BankAccount acc2=new BankAccount("12345",2000);
		BankAccount acc3=new BankAccount("12345",5000);
		
		acc1.setName("Michele");
		System.out.println(acc1.getName());
		
		acc1.makeDeposit(1000);
		acc1.payBill(500);
		acc1.accrue();
		System.out.println(acc1.toString());
	}




}
class BankAccount implements IInterest {
	//Properties of bank account
	private static int ID=1000;		//Internal ID
	private String accountNumber;	//ID + 2-digit random number + first 2 of SSN
	private static final String routingNumber="2580258";	
	private String name;
	private String SSN;
	private double balance;
	
	//Constructor
	public BankAccount(String SSN,double initDeposit) {
		balance = initDeposit;
		System.out.println("New Account Created");
		this.SSN= SSN;
		ID++;
		setAccountNumber();
	}
	private void setAccountNumber() {
		int random= (int) (Math.random()*100);
		accountNumber= ID + ""+random+""+SSN.substring(0,2);
		System.out.println("Your account number: "+accountNumber);
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void payBill(double amount) {
		balance = balance - amount;
		System.out.println("Paying bill: " + amount);
		showBalance();
	}
	public void makeDeposit(double amount) {
		balance = balance + amount;
		System.out.println("Deposit of: " + amount);
		showBalance();
	}
	public void showBalance() {
		System.out.println("Balance: " + balance);
	}
	
	@Override
	public void accrue() {
		// TODO Auto-generated method stub
		balance= balance * (1+rate/100);
		showBalance();
	}
	@Override
	public String toString() {
		return "[ Name: " + name+" ]\n[ Account Number: " + accountNumber + " ]\n[ Routing Number: " + routingNumber + " ]\n[ Balance: " + balance + " ]";
	}
	
}

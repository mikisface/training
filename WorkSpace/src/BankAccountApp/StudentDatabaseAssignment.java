package BankAccountApp;

public class StudentDatabaseAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name= "Michele";
		StudentDatabase acc1=new StudentDatabase(name,"123456");
		acc1.setEmail(name);
		acc1.enroll(name);
		acc1.setState("UK");
		acc1.getState();
		acc1.setCity("London");
		acc1.getCity();
		acc1.setPhone("3423628457");
		acc1.getPhone();
		
		acc1.pay(500);
		acc1.showCourse();
		
		System.out.println(acc1.toString());
		
	}
	
}
class StudentDatabase{
	private String name;
	private String SSN;
	private static int StaticID=100;
	private String phone;
	private String city;
	private String state;
	private String email="@gmail.com";
	private String UserID;
	private double balance=1000;
	private String [] courses= {"Math","Informatic","English"};
	
	public StudentDatabase(String name, String SSN) {
		this.SSN=SSN;
		setID();
	}
	
	public void setID() {
		int random = (int) (Math.floor(Math.random()*9000)+1000);
		UserID=StaticID+""+random+""+SSN.substring(2,6);
		System.out.println("Your User ID is: " + UserID);
	}
	
	public void setEmail(String name) {
		email=name+email;
		System.out.println(email);
		
	}
	
	public void enroll(String name) {
		this.UserID=UserID;
		this.name=name;
		System.out.println("Student "+name+" with UserID: " + UserID + " just enrolled for math test.");
	}
	
	public void pay(double amount) {
		checkBalance();
		balance=balance-amount;
		System.out.println("Your receipt of: "+amount);
		checkBalance();
	}
	
	private void checkBalance() {
		
		System.out.println("Your balance is " + balance);
	}

	public void showCourse() {
		for(int i=0;i<courses.length;i++) {
			System.out.println("You are enrolled in the course of " + courses[i]);
		}
	}
	public void setPhone(String phone) {
		this.phone=phone;
	}
	public String getPhone() {
		return phone;
	}
	public void setCity(String city) {
		this.city=city;
	}
	public String getCity() {
		return city;
	}
	public void setState(String state) {
		this.state=state;
	}
	public String getState() {
		return state;
	}
	@Override
	public String toString() {
		return "[Name: " + name + "]\n[Your SSN is: " + SSN +"]\n[State: " + state + "]\n[City: " + city + "]\n[Phone: " + phone + "]\n[UserID is: " + UserID + "]\n[Your email is: " + email +"]\n[Your balance is: " + balance + "]";
	}
}

package oop;

class Person{
	String name;
	String email;
	String phone;
	
	void walk(){
		System.out.println(name +" is walking.");
	}
	void eat() {
		System.out.println(email);
	}
	void sleep() {
		System.out.println(name+" is sleeping.");
	}
	
}

public class Demo {
	
	public static void main(String[] args) {
	//Instantiating an object
	Person person1= new Person();
	//define some properties
	person1.name="Michele";
	person1.email="michele@test.com";
	person1.phone="125456";
	
	//abstraction
	person1.walk();
	person1.sleep();
	person1.eat();
	}
}


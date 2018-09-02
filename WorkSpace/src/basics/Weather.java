package basics;

public class Weather {
	public static void main (String[] args) {
		// this program will give suggestions of what to wear based on weather (temperature) and sun condition
		
		int temperature= 20;
		String sunCondition = "Sunny";
		
		if(temperature >80) {
			System.out.print("it's pleasant, wear shorts and t-shirt");
		}
		else if(temperature> 60 && sunCondition =="Sunny") {
			System.out.print("it's a bit cooler, wear jeans and long sleeve shirt");
			System.out.println("wear a hat to keep the sun out of your eyes");
		}
		else {
			System.out.println("Looks like a cold day, bring a sweater");
		}
	}
}

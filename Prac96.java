import java.util.*;
public class Prac96 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Distance conversion
		
		System.out.println("Enter the distance in km: ");
		double distance = sc.nextDouble();
		
		double meters = distance * 1000;
		double feet = distance * 3280.3899;
		double inch = distance * 39370.8399;
		double cent = distance * 100000;
		
		System.out.println(distance + "km" + " is " + meters + " meters");
		System.out.println(distance + "km" + " is " + feet + " feet");
		System.out.println(distance + "km" + " is " + inch + " inch");
		System.out.println(distance + "km" + " is " + cent + " centimeters");
		
		
	}

}

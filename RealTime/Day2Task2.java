package RealTime;

public class Day2Task2 {

	//.WAP to take the age from user and print whether he is eligible for vote or not.
	
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("Enter your age: ");
		int age = sc.nextInt();
		if (age >= 18) {
			System.out.println("You are eligible to vote.");
		} else {
			System.out.println("You are not eligible to vote.");
		}
		sc.close();
	}

}
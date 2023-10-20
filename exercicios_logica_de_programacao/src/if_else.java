import java.util.Scanner;

public class if_else {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double num;
		System.out.print("I gonna tell you if your number is positive or negative, give me your number: ");
		num = sc.nextDouble();
		
		if (num > 0){
			System.out.println("The number " + num + " is positive");
		}
		else {
			System.out.println("The number " + num + " is negative");
			
			sc.close();
		}
	}
}

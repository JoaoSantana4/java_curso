import java.util.Scanner;

public class par_impar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double num;
		
		System.out.print("I'm gonna tell you if your number is odd ou even, give me your number: ");
		num = sc.nextDouble();
		
		if (num%2 != 0)
		System.out.println("the number " + num + " is even");
		else {
		System.out.println("the number " + num + " is odd");
		}
		
		
		sc.close();
	}

}

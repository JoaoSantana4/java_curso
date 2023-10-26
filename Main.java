import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		System.out.println("VOU SOMAR DOIS NÚMEROS QUE VOCÊ ME DER");
		
		System.out.print("Digite o primeiro número: ");
		x = sc.nextInt();
		sc.nextLine();
		System.out.print("Digite o segundo número: ");
		y = sc.nextInt();
		sc.nextLine();
		System.out.println("A soma de " + x + " + " + y + " é igual à = " + (x + y) );
		
		sc.close();

	}

}

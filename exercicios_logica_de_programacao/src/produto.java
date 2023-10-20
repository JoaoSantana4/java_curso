import java.util.Scanner;

public class produto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, d;
		System.out.println("Vou ler quatro valores inteiros A, B, C e D. A seguir, calcular e mostrar a diferença do produto\r\n"
				+ "de A e B pelo produto de C e D ");
		
		System.out.print("Digite o produto A: ");
		a = sc.nextInt();
		sc.nextLine();
		System.out.print("Digite o produto B: ");
		b = sc.nextInt();
		sc.nextLine();
		System.out.println("Digite o produto C: ");
		c = sc.nextInt();
		sc.nextLine();
		System.out.println("Digite o produto D: ");
		d = sc.nextInt();
		sc.nextLine();
		System.out.println(" diferença é de " + (a*b - c*d));
		
		
		sc.close();
	}

}

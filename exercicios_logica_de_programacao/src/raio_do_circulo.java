import java.util.Scanner;

public class raio_do_circulo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double r, a;
		System.out.println("VOU CALCULAR A ÁREA DE UM CIRCULO, ME DE O RAIO DELE");
		System.out.print("Digite o raio: ");
		r = sc.nextInt();
		sc.nextLine();
		a = 3.14159 * Math.pow(r, 2);
		System.out.printf("O valor da área do raio de " + r + " equivale à àrea de " + a);
		
		sc.close();

	}

}

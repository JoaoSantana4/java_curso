import java.util.Scanner;

public class funcionario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num, horas;
		double salario_por_hora, salario_por_mes;
		
		System.out.println("Digite seu EDV: ");
		num = sc.nextInt();
		sc.nextLine();
		System.out.println("Digite quantas horas você trabalhou: ");
		horas = sc.nextInt();
		sc.nextLine();
		System.out.println("Digite seu sálario por hora: ");
		salario_por_hora = sc.nextDouble();
		sc.nextLine();
		
		salario_por_mes = salario_por_hora * horas;
		
		System.out.println("Seu EDV é: " + num);
		System.out.printf("Seu sálario mensal é R$ %.2f%n", salario_por_mes);
		
		
		
		
		
		sc.close();
	}

}

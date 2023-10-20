import java.util.Scanner;

public class posto_de_gasolina {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("BEM VINDO AO POSTO DE GASOLINA");
		System.out.print("ESCOLHA UMA DAS OPCÇÕES: 1.ÁLCOOL - 2.GASOLINA - 3.DIESEL - 4.SAIR");
		int opcao = sc.nextInt();
		int gasolina = 0;
		int alcool = 0;
		int diesel = 0;
		
		
		
		while (opcao != 4) {
			if (opcao == 1) {
				alcool += 1;}
			else if (opcao == 2) {
				gasolina += 1;}
			else if (opcao == 3) {
				diesel += 1;}
			
			opcao = sc.nextInt();
			}
				
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		sc.close();
	}
}
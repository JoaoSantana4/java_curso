import java.util.Scanner;

public class duracao_jogo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hora_inicial, hora_final, hora_completa;
		
		System.out.print("Give the hour that the game begin: ");
		hora_inicial = sc.nextInt();
		sc.nextLine();
		System.out.print("Now give the hour that the game ended: ");
		hora_final = sc.nextInt();
		sc.nextLine();
		
		if(hora_inicial > hora_final) {
			hora_completa = 24 - hora_inicial + hora_final;
			System.out.println("The game lasted " + hora_completa + "H");
			}
			
		else {
				hora_completa = hora_final - hora_inicial;
				System.out.println("The game lasted " + hora_completa + "H");
			}
			
		
		
		
		
		
		sc.close();
	}

}

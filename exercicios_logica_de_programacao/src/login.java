import java.util.Scanner;

public class login {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("MENU DE LOGIN!");
		System.out.print("DIGITE A SUA SENHA: ");
		int senha = sc.nextInt();
		
		while (senha != 2002) {
			System.out.println("Senha Invalida");
			senha = sc.nextInt();
		}
		
		System.out.println("Acesso Permitido");
		
		sc.close();
	}
}
package problems;

import java.util.Locale;
import java.util.Scanner;
//Link da questao:
//https://www.beecrowd.com.br/judge/pt/problems/view/1114
public class SenhaFixa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		
		
		int senha = sc.nextInt();
				
		while(senha != 2002){
			System.out.println("Senha Invalida");
			senha = sc.nextInt();
		}
		System.out.println("Acesso Permitido");
		
		sc.close();
	}

}

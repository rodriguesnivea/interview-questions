package problems;

import java.util.Locale;
import java.util.Scanner;
//Link da questao:
//https://www.beecrowd.com.br/judge/pt/problems/view/1144
public class SequênciaLógica {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int cont = 1;
		for(int i = 0; i<n; i++ ){
			System.out.printf("%d %d %d%n" , cont,(cont*cont),(cont*cont*cont));
			System.out.printf("%d %d %d%n" , cont,(cont*cont)+1,(cont*cont*cont)+1);
			cont++;
		}

	}

}

package problems;

import java.util.Locale;
import java.util.Scanner;
//Link da questao:
//https://www.beecrowd.com.br/judge/pt/problems/view/1142

public class PUM {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int contador = 1;
		
		for(int i = 1; i<= n; i++){
			System.out.printf("%d %d %d PUM%n" , contador, contador+1, contador+2);
			contador += 4;
		}
		sc.close();

	}

}

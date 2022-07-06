package problems;

import java.util.Locale;
import java.util.Scanner;
//Link da questao:
//https://www.beecrowd.com.br/judge/pt/problems/view/1143
public class QuadradoeaoCubo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int contador = 1;
		
		for(int i = 1;i<=n; i++ ){
			System.out.printf("%d %d %d%n", i, i*i, i*i*i);
			contador +=1; 		
		}
		sc.close();
	}

}

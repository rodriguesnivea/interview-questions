package problems;

import java.util.Locale;
import java.util.Scanner;
//Link da questao:
//https://www.beecrowd.com.br/judge/pt/problems/view/1153

public class FatorialSimples {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		
		int fatorial = sc.nextInt();
		int result = 1;
		
		for(;fatorial>=1; --fatorial){
			result*=fatorial;
		}
		
		System.out.println(result);
		
		
		
		
		
		sc.close();
	}

}

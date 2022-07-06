package problems;

import java.util.Locale;
import java.util.Scanner;
//Link da questao:
//https://www.beecrowd.com.br/judge/pt/problems/view/1149

public class SomandoInteirosConsecutivos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		
		int n, a = sc.nextInt();
		int soma = 0;
		while(true){
			n = sc.nextInt();
			if(n>0) break;
		}
		
		for(int i = 0; i<n; i++ ){
			soma += a+i;
			
		}
		System.out.println(soma);
		sc.close();
	}

}

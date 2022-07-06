package problems;

import java.util.Locale;
import java.util.Scanner;
//Link da questao:
//https://www.beecrowd.com.br/judge/pt/problems/view/1150

public class UltrapassandoZ {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		
		int z;
		int x = sc.nextInt();
		int cont = 1;
		int soma = x;
		
		while(true){
			z = sc.nextInt();
			if(z>x) break;
		}
		while(true){
			if(soma>z) break;
			soma+= x=+ 1;
			cont++;
			
		}
		
		System.out.println(cont);
		sc.close();
		

	}

}

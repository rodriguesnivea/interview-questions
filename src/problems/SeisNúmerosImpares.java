package problems;

import java.util.Locale;
import java.util.Scanner;
//Link da questao:
//https://www.beecrowd.com.br/judge/pt/problems/view/1070
public class SeisNúmerosImpares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		
		int valor = sc.nextInt(); 
		for(int i = 0; i<6; i++){
			if(valor%2==1) {
				System.out.println(valor);
			} else {
				valor+=1;
				System.out.println(valor);
			}
			valor+=2; 
		}
		
		
		sc.close();
	}
	
	
}

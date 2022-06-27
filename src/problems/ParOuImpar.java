package problems;

import java.util.Locale;
import java.util.Scanner;
//Link da questao:
//https://www.beecrowd.com.br/judge/pt/problems/view/1074

public class ParOuImpar {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 0; i<n; i++){
			
			int valor = sc.nextInt();
			
			
			if(valor>0 && valor%2==0 ){
				System.out.println("EVEN POSITIVE");
			}
			if(valor<0&&valor%2==0){
				System.out.println("EVEN NEGATIVE");
			}
			if(valor>0 && valor%2==1){
				System.out.println("ODD POSITIVE");
			}
			if(valor<0 && valor%2==-1){
				System.out.println("ODD NEGATIVE");
			}
			if(valor == 0){
				System.out.println("NULL");
			}
			
			
		}
		sc.close();
	}
}

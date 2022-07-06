package problems;

import java.util.Locale;
import java.util.Scanner;
//Link da questao:
//https://www.beecrowd.com.br/judge/pt/problems/view/1165
public class NúmeroPrimo1165 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 0; i<n; i++){
			boolean ehPrimo = true;
			
			int num = sc.nextInt();
			for(int j = 2; j<num; j++){
				if((num%j)==0){
					ehPrimo = false;
					break;
				}
				
			}
			if(ehPrimo){ // if(ehPrimo == true)
				System.out.println(num+" eh primo");
			} else {
				System.out.println(num+" nao eh primo");
			}
			
		}
	}

}

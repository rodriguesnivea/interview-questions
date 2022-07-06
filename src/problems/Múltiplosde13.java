package problems;

import java.util.Locale;
import java.util.Scanner;

public class Múltiplosde13 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int maior = 0;
		int menor = 0;
		
		if(x > y){
			maior = x;
			menor = y;
		}else{
			maior = y;
			menor = x;
		}
		
		int soma = 0;
		
		for(int i = menor; i<=maior; i++){
			
			if(i%13!=0){
				soma += i;
			}
		}
		
		System.out.println(soma);
		
		sc.close();
		
		

	}

}

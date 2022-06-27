package problems;

import java.util.Locale;
import java.util.Scanner;

public class SomadeImparesConsecutivosI {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.close();
		
		int maior = 0;
		int menor = 0;
		int somaImpares = 0;
		
		if(x>y){
			maior = x;
			menor = y;
		}else{
			maior = y;
			menor = x;
		}
		
		for(menor+=1; menor<maior; menor++){
			
			if(menor%2==1 || menor%2==-1){
				 somaImpares += menor;
			}	
		}
		System.out.println(somaImpares);
		
	}
	
			
	
}

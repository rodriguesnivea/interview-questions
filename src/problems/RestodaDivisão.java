package problems;

import java.util.Locale;
import java.util.Scanner;

public class RestodaDivisão {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int maior = 0;
		int menor = 0;
		
		if(x>y){
			maior = x;
			menor = y;
		}else{
			maior = y;
			menor = x;
		}
		
		
		for(menor++; menor<maior; menor++){
			
			if(menor%5==2 || menor%5==3){
				System.out.println(menor);
			}
		}
		sc.close();

	}

}

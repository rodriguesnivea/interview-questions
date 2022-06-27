package problems;

import java.util.Locale;
import java.util.Scanner;
//Link da questao:
//https://www.beecrowd.com.br/judge/pt/problems/view/1099
public class SomadeÍmparesConsecutivosII {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int maior = 0;
		int menor = 0;
		for(int i = 0; i<n; i++){
			int soma = 0;
			int x = sc.nextInt();
			int y = sc.nextInt();
			if(x>y){
				maior = x;
				menor = y;
			}else{
				maior = y;
				menor = x;
			}
			
			for(menor = menor+1;menor< maior; menor++){
				if(menor%2==1 || menor%2==-1){
					soma+=menor;
				}
			}
			System.out.println(soma);
		}		
	}		
		
}



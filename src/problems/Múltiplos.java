package problems;

import java.util.Locale;
import java.util.Scanner;
//link da quetsao:
//https://www.beecrowd.com.br/judge/pt/problems/view/1044
public class Múltiplos {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a%b==0 || b%a==0){
			System.out.println("Sao Multiplos");
		}else{
			System.out.println("Nao sao Multiplos");
		}
		
		sc.close();
	}
	
	

}

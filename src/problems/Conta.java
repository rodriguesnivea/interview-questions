package problems;

import java.util.Locale;
import java.util.Scanner;
//Link da questao:
//https://www.beecrowd.com.br/judge/pt/problems/view/1866
public class Conta {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		
		int c = sc.nextInt();
		
		
		for(int i = 0; i<c; i++){
			int s = sc.nextInt();
			if(s%2==1){
				System.out.println("1");
			}else{
				System.out.println("0");
			}
		}
		
	}

}

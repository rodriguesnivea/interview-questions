package problems;

import java.util.Locale;
import java.util.Scanner;
//Link da questao:
//https://www.beecrowd.com.br/judge/pt/problems/view/1589

public class BobConduite {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int i = 0; i<t; i++){
			int r1 = sc.nextInt();
			int r2 = sc.nextInt();
			
			System.out.println(r1+r2);
		}
		
		sc.close();
	}

}

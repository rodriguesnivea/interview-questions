package problems;

import java.util.Locale;
import java.util.Scanner;
//Link da questao:
//https://www.beecrowd.com.br/judge/pt/problems/view/1078

public class Tabuada {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.close();
		for(int i = 1; i<=10; i++){
			System.out.println(i+" x "+n+" = "+(i*n));
		}

	}

}

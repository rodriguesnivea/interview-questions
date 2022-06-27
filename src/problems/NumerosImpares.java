package problems;

import java.util.Locale;
import java.util.Scanner;
//Link da questao:
//https://www.beecrowd.com.br/judge/pt/problems/view/1067
public class NumerosImpares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		sc.close();
		
		for(int i = 1; i<=x; i++){
			if(i%2==1){
				System.out.println(i);
			}
		}
	}

}

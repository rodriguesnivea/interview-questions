package problems;

import java.util.Locale;
import java.util.Scanner;
//Link da questao
//https://www.beecrowd.com.br/judge/pt/problems/view/1075
public class Resto2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		for(int i = 1; i<=10000; i++){
			if(i%n == 2){
				System.out.println(i);
			}
		}

	}

}

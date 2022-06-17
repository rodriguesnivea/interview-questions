package problems;

import java.util.Locale; 
import java.util.Scanner;
//Link da questao:
//https://www.beecrowd.com.br/judge/pt/problems/view/1059

public class NúmerosPares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		
		for(int i = 1; i<=100; i++){
			if(i%2==0){
				System.out.println(i);
			}
		}
		
		
		sc.close();
		

	}

}

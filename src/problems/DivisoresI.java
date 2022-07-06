package problems;

import java.util.Locale;
import java.util.Scanner;

//Link da questao:
//https://www.beecrowd.com.br/judge/pt/problems/view/1157

public class DivisoresI {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++){
			if(n%i==0){
				System.out.println(i);
			}
		}

	}

}

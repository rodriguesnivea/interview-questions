package problems;

import java.util.Locale;
import java.util.Scanner;
//Link da questao:
//https://www.beecrowd.com.br/judge/pt/runs/code/28776244

public class Tomadas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		
		int numReguas = 4;
		int numTomadas;
		int somaTomadas = 0;
		
		for(int i = 0; i<numReguas; i++){
			numTomadas = sc.nextInt();
			somaTomadas+=numTomadas;
		}
		
		int numAparelhos = somaTomadas - 3;
		
		System.out.println(numAparelhos);
		
		
		sc.close();
	}

}

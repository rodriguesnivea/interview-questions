package problems;

import java.util.Locale;
import java.util.Scanner;
//link da questao:
//https://www.beecrowd.com.br/judge/pt/problems/view/1160

public class CrescimentoPopulacional {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		for(int i = 0; i<t; i++) {
			
			int anos = 0;
			
			int populacaoA = sc.nextInt();
			int populacaoB = sc.nextInt();
			
			double percentA = sc.nextDouble();
			double percentB = sc.nextDouble();
			
			for(;populacaoA<=populacaoB;){
				populacaoA = (int) taxaCrescimentoPopulacional(populacaoA, percentA);
				populacaoB = (int) taxaCrescimentoPopulacional(populacaoB, percentB);
				anos += 1; 
				if(anos>100) break;
			}
			
			if(anos>100){
				System.out.println("Mais de 1 seculo.");
			}else{
				System.out.println(anos+" anos.");
			}
			
		}
		sc.close();
		
	}
	
	public static double taxaCrescimentoPopulacional(int populacao, double taxa){
		return (populacao*taxa/100)+(populacao);
	}

}

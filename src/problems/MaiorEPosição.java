package problems;

import java.util.Locale;
import java.util.Scanner;
//Link da questao:
//https://www.beecrowd.com.br/judge/pt/problems/view/1080
public class MaiorEPosição {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		int [] vetor = new int[100];
		int maior = 0;
		int posicao = 0;
		
		for(int i = 0; i<100; i++) {
			int valor = sc.nextInt();
			vetor[i] = valor;
			if(vetor[i]>maior){
				maior = vetor[i];
				posicao = i + 1;
				
			}
		}
		sc.close();
		System.out.println(maior);
		System.out.println(posicao);
		

	}

}

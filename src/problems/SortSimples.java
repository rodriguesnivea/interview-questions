package problems;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
//Link da questao:
//https://www.beecrowd.com.br/judge/pt/problems/view/1042
public class SortSimples {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		
		int []vect = new int[3];
		int []ordenado = new int[3];
		
		for(int i = 0; i < 3; i++){
			int valor = sc.nextInt();
			vect[i] = valor;
			ordenado[i] = valor;
		}
		
		Arrays.sort(ordenado);
		
		for(int i = 0; i < 3; i++){
			System.out.println(ordenado[i]);
		}
		
		System.out.println();
		
		for(int i = 0; i < 3; i++){
			System.out.println(vect[i]);
		}
		
		sc.close();
		
	}

}



package problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

//Link da questao:
//https://www.beecrowd.com.br/judge/pt/problems/view/1858

public class ARespostadeTheon {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);


		List<Integer> list = new ArrayList<>();
		int menor = 99999;
		int n = sc.nextInt();
		
		for( int i = 0; i<n; i++){
			int algoz = sc.nextInt();
			list.add(algoz);
			
			if(list.get(i)<menor){
				menor = list.get(i);
			}
			
		}
		System.out.println(list.indexOf(menor)+ 1);
		sc.close();
	}

}

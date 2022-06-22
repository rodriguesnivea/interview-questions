package problems;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;
//Link da questao:
//https://www.beecrowd.com.br/judge/pt/problems/view/1154

public class Idades1154 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		
		int valor = sc.nextInt();
		int cont = 0;
		double soma = 0;
		double media = 0;
		
		while(valor>=0){
			
			soma+=valor;
			cont++;
			
			valor = sc.nextInt();
		}
		
		media = soma/cont;
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println(df.format(media));
		
		
		
	
		sc.close();
	}

}

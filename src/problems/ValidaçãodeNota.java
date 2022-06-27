package problems;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;
//Link da questao:
//https://www.beecrowd.com.br/judge/pt/problems/view/1117

public class ValidaçãodeNota {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		double nota1 = sc.nextDouble();
		while(nota1<0 || nota1>10){
			System.out.println("nota invalida");
			nota1 = sc.nextDouble();
		}
		double nota2 = sc.nextDouble();
		while(nota2<0 || nota2>10){
			System.out.println("nota invalida");
			nota2 = sc.nextDouble();
		}
		
		double media = (nota1+nota2)/2;
		System.out.println("media = "+ df.format(media));
		
		
		sc.close();
	}

}

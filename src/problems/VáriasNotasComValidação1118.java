package problems;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

//Link da questao:
//https://www.beecrowd.com.br/judge/pt/problems/view/1118

public class VáriasNotasComValidação1118 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		int resposta = 0;
		double nota1 = 0;
		double nota2 = 0;
		double media = 0;
		
		nota1 = sc.nextDouble();
		
		while(nota1<0 || nota1>10){
			 System.out.println("nota invalida");
			 nota1 = sc.nextDouble();
			
		}
		
		nota2 = sc.nextDouble();
		
		while(nota2<0 || nota2>10){
			 System.out.println("nota invalida");
			 nota2 = sc.nextDouble();
			
		}
		
		media = (nota1+nota2)/2;
		System.out.println("media = "+ df.format(media));
		
		while(true){
			System.out.println("novo calculo (1-sim 2-nao)");
			resposta = sc.nextInt();
			if(resposta == 2) break;
			if(resposta == 1) {				
				nota1 = sc.nextDouble();
				
				while(nota1<0 || nota1>10){
					System.out.println("nota invalida");
					nota1 = sc.nextDouble();
					
				}
				
				nota2 = sc.nextDouble();
				
				while(nota2<0 || nota2>10){
					System.out.println("nota invalida");
					nota2 = sc.nextDouble();
					
				}
				
				media = (nota1+nota2)/2;
				
				System.out.println("media = "+ df.format(media));
			}
			sc.close();
		}

		
	}

}

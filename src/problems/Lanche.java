package problems;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

//Link da questão:
//https://www.beecrowd.com.br/judge/pt/problems/view/1038

public class Lanche {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		
		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();
		double preco = 0;
		
		switch(codigo){
			case 1:
				preco = 4.00;
				break;
			case 2:
				preco = 4.50;
				break;
			case 3:
				preco = 5.00;
				break;
			case 4:
				preco = 2.00;
				break;
			case 5:
				preco = 1.50;
				break;
				
			default:
				break;
		
		
		}
		
		valorTotal(preco,quantidade);
		
		sc.close();
	}
	
	public static void valorTotal(double preco,int quantidade){
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println("Total: R$ "+ df.format(quantidade*preco));

	}
	
	
	

}

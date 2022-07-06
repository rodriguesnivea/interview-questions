package problems;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

//Link da questao:
//https://www.beecrowd.com.br/judge/pt/problems/view/1985

public class MacPRONALTS {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); 
		DecimalFormat df = new DecimalFormat("0.00");
		Scanner sc = new Scanner(System.in);
		
		int qtdProdutos = sc.nextInt();
		double valor = 0;
		double result = 0;
		
		for(int i = 0; i<qtdProdutos; i++){
			
			int codigo = sc.nextInt();
			int qtd = sc.nextInt();

			switch (codigo) {
				case 1001 : 
					valor = (1.50*qtd);
					break;
				case 1002 : 
					valor = (2.50*qtd);
					break;
				case 1003 : 
					valor = (3.50*qtd);
					break;	
				case 1004 : 
					valor = (4.50*qtd);
					break;
				case 1005 : 
					valor = (5.50*qtd);
					break;
				default:
					break;
			
			}
			result+=valor;
			
		}
		System.out.println(df.format(result));
		
		
	}

}

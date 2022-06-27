package problems;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;
//Link da questao:
//https://www.beecrowd.com.br/judge/pt/problems/view/1064

public class PositivoseMedia {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.0");
		int quantidadeP = 0;
		double somaPositivos = 0;
		
		for(int i = 0; i<6; i++){
			double valor = sc.nextDouble();
			if(valor>0){
				somaPositivos += valor;
				quantidadeP+=1;
			}
		}
		
		
		System.out.println(quantidadeP+" valores positivos ");
		System.out.println(df.format(somaPositivos/quantidadeP));
		sc.close();

	}

}

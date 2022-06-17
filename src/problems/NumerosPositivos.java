package problems;

import java.util.Locale;
import java.util.Scanner;
//Link daa questão:
//https://www.beecrowd.com.br/judge/pt/problems/view/1060
public class NumerosPositivos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		
		double[]vect = new double[6];
		int quantidadePositivo = 0;
		for(int i = 0; i<6; i++){
			
			double valor = sc.nextDouble();
			vect[i] =  valor;
			
			quantidadePositivo = valoresPositivo(valor,quantidadePositivo);
		}
		System.out.println(quantidadePositivo+" valores positivos");
		sc.close();
	}
	
	public static int valoresPositivo(double valor , int quantidadePositivo ){
		if(valor>0){
			quantidadePositivo ++;
				
		}
		return quantidadePositivo;
	}
}

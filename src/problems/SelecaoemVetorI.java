package problems;

import java.util.Locale;
import java.util.Scanner;
//Link da questao:
//https://www.beecrowd.com.br/judge/pt/problems/view/1174

public class SelecaoemVetorI {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		
		double [] A = new double[100];
		
		for(int i = 0; i<100; i++){
			
			double elemento = sc.nextDouble();
			
			A[i] =  elemento;
			
			if(elemento<=10){
				System.out.println("A["+i+"]"+ " = " + A[i]);
			}
			
		}
		
		sc.close();
	}

}

package problems;

import java.util.Locale;
import java.util.Scanner;
//Link da questao:
//https://www.beecrowd.com.br/judge/pt/problems/view/1041
public class CoordenadasdeumPonto {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		sc.close();
		if(x>0 && y>0){
			System.out.println("Q1");	
		}
		if(x<0 && y<0){
			System.out.println("Q3");
		}
		if(y>0 && x<0){
			System.out.println("Q2");
		}
		if(x>0 && y<0){
			System.out.println("Q4");
		}
		if(x==0 && y==0){
			System.out.println("Origem");
		}
		if(y==0 && (x>0 ||  x<0)) {
			System.out.println("Eixo X");
		}
		if(x==0 && (y>0 ||  y<0)){
			System.out.println("Eixo Y");
		}
		
		
	}

}

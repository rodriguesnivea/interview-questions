package problems;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Triângulo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		
		double ladoA = sc.nextDouble();
		double ladoB = sc.nextDouble();
		double ladoC = sc.nextDouble();
		double ladoMaior = 0;
		double ladoMenor1 = 0;
		double ladoMenor2 = 0;
		
		if(ladoA>ladoB && ladoA>ladoC){
			ladoMaior = ladoA;
			ladoMenor1 = ladoB;
			ladoMenor2 = ladoC ;
		}else if(ladoB>ladoA && ladoB>ladoC){
			ladoMaior = ladoB;
			ladoMenor1 = ladoA;
			ladoMenor2 = ladoC ;
		}else{
			ladoMaior = ladoC;
			ladoMenor1 = ladoA;
			ladoMenor2 = ladoB ;
		} 
		
		if((ladoMenor1 + ladoMenor2)> ladoMaior && (ladoMenor1 + ladoMaior)>ladoMenor2 && (ladoMenor2+ ladoMaior)>ladoMenor1  ){
			DecimalFormat df = new DecimalFormat("0.0");
			System.out.println("Perimetro = " + df.format(ladoMenor1 + ladoMenor2 + ladoMaior));
		}else{
			DecimalFormat df = new DecimalFormat("0.0");
			System.out.println("Area = " + df.format(((ladoA+ladoB)*ladoC)/2));
			
		}
		
		sc.close();
	}
	
	

}

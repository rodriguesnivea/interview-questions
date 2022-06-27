package problems;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;
//Link da questao:
//https://www.beecrowd.com.br/judge/pt/problems/view/1079

public class MédiasPonderadas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.0"); 
		int n = sc.nextInt();
		double  media = 0;
		sc.close();
		for(int i = 0; i<n; i++){
			double valor1 = sc.nextDouble();
			double valor2 = sc.nextDouble();
			double valor3 = sc.nextDouble();
			
			media = ((valor1*2)+(valor2*3)+(valor3*5))/10;
			System.out.println(df.format(media));
		}
	}

}

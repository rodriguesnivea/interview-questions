package problems;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

//link do problema:
//https://www.beecrowd.com.br/judge/pt/problems/view/1015

public class DistanciaEntreDoisPontos1015 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		
		distanciaEntreDoispontos(x1,y1,x2,y2);
		
		sc.close();
	}
	public static void distanciaEntreDoispontos(double x1,double y1, double x2,double y2){
		double distancia = Math.sqrt(((x2-x1)*(x2-x1)) + ((y2-y1)*(y2-y1)));
		DecimalFormat df = new DecimalFormat("0.0000"); 
		System.out.println(df.format(distancia));
		
	} 
	

}

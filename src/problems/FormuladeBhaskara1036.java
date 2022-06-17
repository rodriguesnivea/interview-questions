package problems;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;
//Link da questao
//https://www.beecrowd.com.br/judge/pt/problems/view/1036

public class FormuladeBhaskara1036 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		double delta = calculaDelta(a,b,c);
		if(delta<0 || a == 0){
			System.out.println("Impossivel calcular");
		}else {
			double x = calculaXlinha(a,b,c,delta);
			double x2 = calculaX2linha(a,b,c,delta);
			DecimalFormat df = new DecimalFormat("0.00000");
			System.out.println("R1 = " + df.format(x));
			System.out.println("R2 = " + df.format(x2));
		}
		sc.close();
	}
	
	public static double calculaDelta(double a, double b,double c){
		return (b*b)-(4* a* c);
	}
	public static double calculaXlinha(double a,double b,double c,double delta){
		return (-b+Math.sqrt(delta))/(2*a);
	}
	public static double calculaX2linha(double a,double b,double c,double delta){
		return (-b-Math.sqrt(delta))/(2*a);
	}
	

}

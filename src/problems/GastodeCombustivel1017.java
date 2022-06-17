package problems;
import java.text.DecimalFormat; 
import java.util.Locale;
import java.util.Scanner;
//Link da questao:
//https://www.beecrowd.com.br/judge/pt/problems/view/1017

public class GastodeCombustivel1017 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		
		int horas = sc.nextInt();
		int velocidadeMedia = sc.nextInt();
		
		int distanciaTotal = distancia(horas,velocidadeMedia);
		LitroPorDistancia(distanciaTotal);
		
		sc.close();	
	}
	public static int distancia(int horas,int velocidade ){
		return velocidade*horas;
	}
	public static void LitroPorDistancia(int distancia ){
		DecimalFormat df = new DecimalFormat("0.000");
		System.out.println(df.format(distancia/12));	
	}

}

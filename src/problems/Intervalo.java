package problems;
//Link da questao:
//https://www.beecrowd.com.br/judge/pt/problems/view/1037

import java.util.Locale;
import java.util.Scanner;

public class Intervalo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		
		double valor = sc.nextDouble();
		
		if(valor>=0.00 && valor<=25.00){
			intervaloUm();
			
		}else if(valor>0.00 && valor<=50.00){
			intervaloDois();
			
		}else if(valor>0.00 && valor<=75.00){
			intervaloTres();
			
		}else if(valor>0.00 && valor<=100.00){
			intervaloQuatro();
		}else{
			System.out.println("Fora de intervalo");
		}
		
		
		sc.close();
	}
	public static void intervaloUm(){
		System.out.println("Intervalo [0,25]");
	}
	public static void intervaloDois(){
		System.out.println("Intervalo (25,50]");
	}
	public static void intervaloTres(){
		System.out.println("Intervalo (50,75]");
	}
	public static void intervaloQuatro(){
		System.out.println("Intervalo (75,100])");
	}
}

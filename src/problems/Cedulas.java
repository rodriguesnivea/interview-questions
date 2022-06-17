package problems;
import java.util.Locale;
import java.util.Scanner;
// Link da questão
// https://www.beecrowd.com.br/judge/pt/problems/view/1018

public class Cedulas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		
		int valor = sc.nextInt();
		System.out.println(valor);

		int nota100 = valorDecompostoEmCedulas(valor, 100);
		valor = valor%100;
		int nota50 = valorDecompostoEmCedulas(valor, 50);
		valor = valor%50;
		int nota20 = valorDecompostoEmCedulas(valor, 20);
		valor = valor%20;
		int nota10 = valorDecompostoEmCedulas(valor, 10);
		valor = valor%10;
		int nota05 = valorDecompostoEmCedulas(valor, 5);
		valor = valor%5;
		int nota02 = valorDecompostoEmCedulas(valor, 2);
		valor = valor%2;
		int nota01 = valorDecompostoEmCedulas(valor, 1);
		
		mostraValorDecompostoEmNotas( nota100, nota50,  nota20, nota10,nota05,nota02,nota01 );
		
		
		sc.close();
	}
	
	public static int valorDecompostoEmCedulas(int valor, int cedula){
		return valor/cedula;
	}
	public static void mostraValorDecompostoEmNotas(int nota100, int nota50, int nota20, int nota10,int nota05, int nota02, int nota01 ){
		System.out.println(nota100+" nota(s) de R$ 100,00");
		System.out.println(nota50+" nota(s) de R$ 50,00");
		System.out.println(nota20+" nota(s) de R$ 20,00");
		System.out.println(nota10+" nota(s) de R$ 10,00");
		System.out.println(nota05+" nota(s) de R$ 5,00");
		System.out.println(nota02+" nota(s) de R$ 2,00");
		System.out.println(nota01+" nota(s) de R$ 1,00");
	}

}

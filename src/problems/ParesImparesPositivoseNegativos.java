package problems;
import java.util.Locale;
import java.util.Scanner;
//Link da questao:
//https://www.beecrowd.com.br/judge/pt/problems/view/1066

public class ParesImparesPositivoseNegativos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		
		int quantidadePar = 0;
		int quantidadeImpar = 0;
		int quantidadePositivo = 0;
		int quantidadeNegativo = 0;
		
		quantidadePar = valoresPares(a,quantidadePar);
		quantidadePar = valoresPares(b,quantidadePar);
		quantidadePar = valoresPares(c,quantidadePar);
		quantidadePar = valoresPares(d,quantidadePar);
		quantidadePar = valoresPares(e,quantidadePar);
		
		quantidadeImpar = valoresImpares(a,quantidadeImpar);
		quantidadeImpar = valoresImpares(b,quantidadeImpar);
		quantidadeImpar = valoresImpares(c,quantidadeImpar);
		quantidadeImpar = valoresImpares(d,quantidadeImpar);
		quantidadeImpar = valoresImpares(e,quantidadeImpar);
		
		quantidadePositivo = valoresPositivo(a,quantidadePositivo );
		quantidadePositivo = valoresPositivo(b,quantidadePositivo );
		quantidadePositivo = valoresPositivo(c,quantidadePositivo );
		quantidadePositivo = valoresPositivo(d,quantidadePositivo );
		quantidadePositivo = valoresPositivo(e,quantidadePositivo );
		
		quantidadeNegativo = valoresNegativo(a,quantidadeNegativo );
		quantidadeNegativo = valoresNegativo(b,quantidadeNegativo );
		quantidadeNegativo = valoresNegativo(c,quantidadeNegativo );
		quantidadeNegativo = valoresNegativo(d,quantidadeNegativo );
		quantidadeNegativo = valoresNegativo(e,quantidadeNegativo );
		
		System.out.println(quantidadePar+ " valor(es) par(es)");
		System.out.println(quantidadeImpar+" valor(es) impar(es)");
		System.out.println(quantidadePositivo+" valor(es) positivo(s)");
		System.out.println(quantidadeNegativo+" valor(es) negativo(s)");
		
		
		sc.close();
	}
	
	public static int valoresPares(int valor , int quantidadePar ){
		if(valor%2==0){
			quantidadePar ++;
				
		}
		return quantidadePar;
	}
	
	public static int valoresImpares(int valor , int quantidadeImpar ){
		if(valor%2==1 || valor%2==-1){
			quantidadeImpar ++;
				
		}
		return quantidadeImpar;
	}
	
	public static int valoresPositivo(int valor , int quantidadePositivo ){
		if(valor>0){
			quantidadePositivo ++;
				
		}
		return quantidadePositivo;
	}
	
	public static int valoresNegativo(int valor , int quantidadeNegativo ){
		if(valor<0){
			quantidadeNegativo ++;
				
		}
		return quantidadeNegativo;
	}

	
	
	
	

}

package problems;
import java.util.Locale;
import java.util.Scanner;
//Link da questao:
//https://www.beecrowd.com.br/judge/pt/problems/view/1066
public class ParesImparesPositivoseNegativosUsandofor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
	
		int quantidadePar = 0;
		int quantidadeImpar = 0;
		int quantidadePositivo = 0;
		int quantidadeNegativo = 0;
		
		for(int i = 0; i<5 ; i++){
			
			int valor = sc.nextInt();
			sc.close();
			
			if(valor%2==0){
				quantidadePar ++;
			}
			if(valor%2==1 || valor%2==-1){
				quantidadeImpar ++;
			}
			if(valor>0){
				quantidadePositivo ++;
			}
			if(valor<0){
				quantidadeNegativo ++;	
			}		
			
		}
		
		System.out.println(quantidadePar+ " valor(es) par(es)");
		System.out.println(quantidadeImpar+" valor(es) impar(es)");
		System.out.println(quantidadePositivo+" valor(es) positivo(s)");
		System.out.println(quantidadeNegativo+" valor(es) negativo(s)");
		
		

	}

}

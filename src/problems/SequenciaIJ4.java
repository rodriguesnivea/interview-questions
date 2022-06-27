package problems;

import java.util.Locale;

public class SequenciaIJ4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		int cont=0;
		double valorDoJQuandoEleEraUm = 1.2;
		for(int i=0, j=1; j<=3; j++) {
			System.out.printf("I=%d J=%d%n", i, j);
		}
		for(double i = 0.2, j=1.2; i<=2; ){
			System.out.printf("I=%.1f J=%.1f%n", i, j);
			cont++;
			j++;
			if(cont == 3){
				cont = 0;
				i+= 0.2;
				j = valorDoJQuandoEleEraUm + 0.2;
				valorDoJQuandoEleEraUm = j;
				
				
			}

		}
		
	}	

}



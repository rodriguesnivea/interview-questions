package problems;
import java.util.Locale;
import java.util.Scanner;
//Link da questao:
//https://www.beecrowd.com.br/judge/pt/problems/view/1172

public class SubstituiçãoemVetorI {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		
		int[] x = new int[10];
		for(int i = 0; i<10; i++){
			int elemento = sc.nextInt();
			if(elemento<=0){
				elemento  = 1;
			}
			x[i] = elemento;
			
			System.out.println("X"+"["+i+"]"+ " = "+x[i]);
		}
		
		
		
		sc.close();
	}

}

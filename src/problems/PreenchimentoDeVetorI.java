package problems;
// Link da questão:
// https://www.beecrowd.com.br/judge/pt/problems/view/1173
import java.util.Locale;
import java.util.Scanner;

public class PreenchimentoDeVetorI {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		
		int valor = sc.nextInt();
		int [] n = new int[10];
		
		n[0] = valor;
		System.out.println("N["+0+"]"+ " = " + n[0]);
		
		for(int i = 1; i<10; i++) {
			n[i] = n[i-1]*2;
			
			System.out.println("N["+i+"]"+ " = " + n[i]);
			
			
		}
		sc.close();

	}

}

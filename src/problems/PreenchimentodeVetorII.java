package problems;
import java.util.Locale;
import java.util.Scanner;
//Link da questao:
//https://www.beecrowd.com.br/judge/pt/problems/view/1177

public class PreenchimentodeVetorII {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		
		int [] n = new int[1000];
		
		int t = sc.nextInt();
		
		for(int i = 0; i<1000; i++){
			n[i] = i%t;
			System.out.println("N["+i+"] = "+n[i]);

		}
		
		
		
		sc.close();
	}

}

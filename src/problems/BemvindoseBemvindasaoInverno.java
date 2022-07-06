package problems;
import java.util.Locale;
import java.util.Scanner;
//Link da questao:
//https://www.beecrowd.com.br/judge/pt/problems/view/1847

public class BemvindoseBemvindasaoInverno {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		
		int t1 = sc.nextInt();
		int t2 = sc.nextInt();
		int t3 = sc.nextInt();
		
		int pontoMedio = (t1+t3)/2;
		
		if(t2<pontoMedio){
			System.out.println(":)");
		} else {
			System.out.println(":(");
		}
		
		sc.close();
	}

}

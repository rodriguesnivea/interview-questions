package problems;
import java.util.Locale;
import java.util.Scanner;
// Link da questão:
// https://www.beecrowd.com.br/judge/pt/problems/view/1019

public class ConversaodeTempo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		
		int segundos = sc.nextInt();
		
		sc.close();
		
		coversaoDeSegundo(segundos);
	}
	
	public static void coversaoDeSegundo(int segundos ){
		int hora = segundos/3600;
		int min = segundos%3600/60;
		int seg = segundos%60;
		
		System.out.println(hora+":"+min+":"+seg);
		
	}
	

}

package problems;

import java.util.Locale;
import java.util.Scanner;
//Link da questao:
//https://www.beecrowd.com.br/judge/pt/problems/view/1046
public class TempodeJogo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		
		int horaincial = sc.nextInt();
		int horafinal = sc.nextInt();
		
		int duracao = 0 ;
		
		if(horafinal<= horaincial){
			horafinal+=24;
			for(;horaincial<horafinal; horaincial++){
				duracao+=1;
			}
		}else{
			for(;horaincial<horafinal; horaincial++){
				duracao+=1;
			}
		}
		System.out.println("O JOGO DUROU "+duracao+" HORA(S)");
		sc.close();
	}

}

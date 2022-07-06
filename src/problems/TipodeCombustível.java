package problems;

import java.util.Locale;
import java.util.Scanner;
//Link da questao:
//https://www.beecrowd.com.br/judge/pt/problems/view/1134

public class TipodeCombustível {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		
		int codigo = sc.nextInt();
		int alcool = 0;
		int gasolina = 0;
		int disel = 0;
		
		while(codigo != 4){
		 codigo = sc.nextInt();
		 switch(codigo){
		 	case 1:
		 		alcool+=1;
		 			break;
		 	case 2:
		 		gasolina+=1;
		 			break;
		 	case 3:
		 		disel+=1;
		 			break;
		 	default:
		 		break;
		 		
		 	
		}
	}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: "+ gasolina);
		System.out.println("Diesel: " + disel);
		
		sc.close();
	}
	
		

}

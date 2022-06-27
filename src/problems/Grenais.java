package problems;

import java.util.Locale;
import java.util.Scanner;

public class Grenais {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		
		int golInter = sc.nextInt();
		int golGremio= sc.nextInt();
		
		int grenais = 1;
		int vitInter = 0;
		int vitGremio = 0;
		int empates = 0;
		
		System.out.println("Novo grenal (1-sim 2-nao)");
		int resposta = sc.nextInt();
		
		if(golInter>golGremio){
			vitInter +=1;
		}
		if(golInter<golGremio){
			vitGremio +=1;
		}
		if(golInter==golGremio){
			empates = 0;
		}
		
		while(resposta!=2){
			golInter = sc.nextInt();
			golGremio= sc.nextInt();
			
			if(golInter>golGremio){
				vitInter +=1;
			}
			
			if(golInter<golGremio){
				vitGremio +=1;
			}
			
			if(golInter==golGremio){
				empates = 0;
			}
			System.out.println("Novo grenal (1-sim 2-nao)");
			resposta = sc.nextInt();
			grenais += 1;
		}
		
		
		System.out.println(grenais + " grenais");
		System.out.println("Inter:"+vitInter);
		System.out.println("Gremio:"+vitGremio);
		System.out.println("Empates:"+empates);
		
		if(vitInter>vitGremio){
			System.out.println("Inter venceu mais");
		}else if (vitInter<vitGremio){
			System.out.println("Gremio venceu mais");
		}else if(vitInter==vitGremio){
			System.out.println("Nao houve vencedor");
		}
	}

}

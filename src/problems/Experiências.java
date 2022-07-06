package problems;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;
//Link da questao:
//https://www.beecrowd.com.br/judge/pt/problems/view/1094

public class Experiências {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		int n = sc.nextInt();
		int quantidadeCobais = 0;
		int total = 0;
		int totalC = 0;
		int totalR = 0;
		int totalS = 0;
		sc.nextLine();
		
		for(int i = 1; i<=n; i++){
			String temp = sc.nextLine();
			String[] dados = temp.split(" ");
			
			quantidadeCobais = Integer.parseInt(dados[0]);
			String tipo = dados[1];
			
			total += quantidadeCobais;
			
			if(tipo.equals("C")){
				totalC += quantidadeCobais;
			}
			if(tipo.equals("R")){
				totalR += quantidadeCobais;
			}
			if(tipo.equals("S")){
				totalS += quantidadeCobais;
			}
		}
		double percentualC = percentualDopTipoCobaia(total ,totalC);
		double percentualR = percentualDopTipoCobaia(total ,totalR);
		double percentualS = percentualDopTipoCobaia(total,totalS);
		
		
		System.out.println("Total: "+total+" cobaias");
		System.out.println("Total de coelhos: "+totalC);
		System.out.println("Total de ratos: "+totalR);
		System.out.println("Total de sapos: "+totalS);
		System.out.println("Percentual de coelhos: "+df.format(percentualC)+" %");
		System.out.println("Percentual de ratos: "+df.format(percentualR)+" %");
		System.out.println("Percentual de sapos: "+df.format(percentualS)+" %");
		sc.close();
		
	}
	
	public static double percentualDopTipoCobaia(int quantidaTotaldeCobaias,double totaltipo){
		return (totaltipo*100)/quantidaTotaldeCobaias;
	}

}

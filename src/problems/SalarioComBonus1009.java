package problems;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;
// link do problema:
// https://www.beecrowd.com.br/judge/pt/problems/view/1009

public class SalarioComBonus1009 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		String nome = sc.nextLine();
		double salarioFixo = sc.nextDouble();
		double totalDeVendasNoMes$ = sc.nextDouble();
		
		double comissao = comissaoPorVendas(totalDeVendasNoMes$);
		total(salarioFixo, comissao);
		
		sc.close();
	}
	
	public static double comissaoPorVendas(double totalDeVendasNoMes$){
		return totalDeVendasNoMes$*0.15;
	}
	
	public static void total(double salarioFixo , double comissaoPorVendas){
		DecimalFormat df = new DecimalFormat("0.00");  
		System.out.println("TOTAL = R$ " + df.format(salarioFixo + comissaoPorVendas) );
	}
	

}

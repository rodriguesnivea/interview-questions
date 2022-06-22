package problems;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;
//Link da questao:
//https://www.beecrowd.com.br/judge/pt/problems/view/1048

public class AumentodeSalário1048 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		
		double salario = sc.nextDouble();
		double  NovoSalario = 0; 
		double reajuste = 0;
		int percentual = 0;
		
		if(salario>=0 && salario<=400.00 ){
			NovoSalario = NovoReajusteDoSalario( salario ,15);
			reajuste = reajusteGanho(salario , 15);
			percentual = 15;
			DecimalFormat df = new DecimalFormat("0.00");
			System.out.println("Novo salario: "+ df.format(NovoSalario));
			System.out.println("Reajuste ganho: "+ df.format(reajuste));
			System.out.println("Em percentual: "+ percentual+" % ");
			
		}else if(salario>0 && salario<=800.00){
			
			NovoSalario = NovoReajusteDoSalario( salario ,12);
			reajuste = reajusteGanho(salario , 12);
			percentual = 12;
			
			DecimalFormat df = new DecimalFormat("0.00");
			System.out.println("Novo salario: "+ df.format(NovoSalario));
			System.out.println("Reajuste ganho: "+ df.format(reajuste));
			System.out.println("Em percentual: "+ percentual+" % ");
			
		}else if(salario>0 && salario<=1200.00){

			NovoSalario = NovoReajusteDoSalario( salario ,10);
			reajuste = reajusteGanho(salario , 10);
			percentual = 10;
			
			DecimalFormat df = new DecimalFormat("0.00");
			System.out.println("Novo salario: "+ df.format(NovoSalario));
			System.out.println("Reajuste ganho: "+ df.format(reajuste));
			System.out.println("Em percentual: "+ percentual+" % ");
			
		}else if(salario>0 && salario<=2000.00){
			
			NovoSalario = NovoReajusteDoSalario( salario ,7);
			reajuste = reajusteGanho(salario , 7);
			percentual = 7;
			
			DecimalFormat df = new DecimalFormat("0.00");
			System.out.println("Novo salario: "+ df.format(NovoSalario));
			System.out.println("Reajuste ganho: "+ df.format(reajuste));
			System.out.println("Em percentual: "+ percentual+" % ");
			
		} else if(salario>0 && salario>2000.00){
			
			NovoSalario = NovoReajusteDoSalario( salario ,4);
			reajuste = reajusteGanho(salario , 4);
			percentual = 4;
			
			DecimalFormat df = new DecimalFormat("0.00");
			System.out.println("Novo salario: "+df.format(NovoSalario));
			System.out.println("Reajuste ganho: "+ df.format(reajuste));
			System.out.println("Em percentual: "+ percentual+" % ");
			
		}
		sc.close();
	
	}
	
	public static double NovoReajusteDoSalario(double salario , int p){
		return (salario*p/100)+salario;
	}
	
	public static double reajusteGanho(double salario , int p){
		return (salario*p/100);
	}
	
	

}

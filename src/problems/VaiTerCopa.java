package problems;
import java.util.Scanner;
//Link da questao:
//https://www.beecrowd.com.br/judge/pt/runs/code/28775030

public class VaiTerCopa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int qtdReclamacoes;
			qtdReclamacoes = sc.nextInt();
			if(qtdReclamacoes==0){
				System.out.println("vai ter copa!");
			}else{
				System.out.println("vai ter duas!");
			}			
		}
		sc.close();
	}

}
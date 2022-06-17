package problems;
import java.util.Locale;
import java.util.Scanner;

//Link da questao:
//https://www.beecrowd.com.br/judge/pt/problems/view/1035

public class TestedeSeleção1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		
		condicaoParaAceitarValores(A,B,C,D);
		
		sc.close(); 
	}
	
	public static void condicaoParaAceitarValores(int A,int B,int C,int D){
		boolean valoresAceitos = false;
		if(B>C && D>A){
			if(C+D>A && C+D>A+B){
				if(C>0 && D>0) {
					if(A%2==0){
						valoresAceitos = true;
					}
				}
			}
		} 
		if(valoresAceitos == true){
			System.out.println("Valores aceitos");
		}else{
			System.out.println("Valores nao aceitos");
		}
		
	}

}

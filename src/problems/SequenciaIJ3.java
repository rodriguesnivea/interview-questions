package problems;
//Link da questao:
//https://www.beecrowd.com.br/judge/pt/problems/view/1097
public class SequenciaIJ3 {

	public static void main(String[] args) {
		int cont=0;
		for(int i = 1, j=7; i<=9; j--){
			System.out.println("I="+i + " J="+j);
			cont++;
			if(cont == 3){
				cont = 0;
				i+=2;
				j+=5;
				
			}
			
		}	

	}

}

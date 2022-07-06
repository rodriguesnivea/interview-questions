package problems;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
//Link da questao:
//https://www.beecrowd.com.br/judge/pt/problems/view/1924

public class VitóriaeaIndecisão {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();

		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 0; i<n; i++){
			String curso = sc.nextLine();
			list.add(curso);
			
		}
		System.out.println("Ciencia da Computacao");
		sc.close();

	}
		

}

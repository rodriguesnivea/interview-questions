package problems;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

//Link da questao:
//https://www.beecrowd.com.br/judge/pt/problems/view/1116
public class DividindoXporY {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.0");
		int n = sc.nextInt();
		
		for(int i = 0; i<n; i++){
			
			double x = sc.nextInt();
			double y = sc.nextInt();
			
			if(x<=0 && y == 0 || x>=0 && y == 0){
				System.out.println("divisao impossivel");
			}else{
				System.out.println(df.format(x/y));
			}	
		}
		
		sc.close();
	}

}

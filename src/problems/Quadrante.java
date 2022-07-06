package problems;

import java.util.Locale;
import java.util.Scanner;

public class Quadrante {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y= sc.nextInt();
		
		if(x>0 && y>0){
			System.out.println("primeiro");
		}else if(x>0 && y<0){
			System.out.println("quarto");
		}else if(x<0 && y<0){
			System.out.println("terceiro");
		}else if(x<0 && y>0){
			System.out.println("segundo");
		}
		
		while(x != 0 || y != 0){
			
			 x = sc.nextInt();
			 y= sc.nextInt();
			 
			if(x>0 && y>0){
				System.out.println("primeiro");
			}else if(x>0 && y<0){
				System.out.println("quarto");
			}else if(x<0 && y<0){
				System.out.println("terceiro");
			}else if(x<0 && y>0){
				System.out.println("segundo");
			}
			sc.close();
		}

	}

}

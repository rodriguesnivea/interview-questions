package problems;

import java.util.Scanner;

//Link da questao:
//https://www.beecrowd.com.br/judge/pt/problems/view/1759

public class HoHoHo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int i = 1; i<=num; i++){
			
			if(i==num){
				System.out.println("Ho!");
			}else{
				System.out.print("Ho ");
				}
		}
		
		
		
		sc.close();

	}

}

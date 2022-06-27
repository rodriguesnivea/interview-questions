package problems;
import java.util.Scanner;
//Link da questao:
//https://www.beecrowd.com.br/judge/pt/problems/view/1049
public class Animal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String tipo1 = sc.nextLine();
		String tipo2 = sc.nextLine();
		String tipo3 = sc.nextLine();
		sc.close();
		
		if(tipo1.equals("vertebrado")&& tipo2.equals("ave")&&tipo3.equals("carnivoro")){
			System.out.println("aguia");
		}else if(tipo1.equals("vertebrado")&& tipo2.equals("ave")&&tipo3.equals("onivoro")) {
			System.out.println("pomba");
		}else if(tipo1.equals("vertebrado") && tipo2.equals("mamifero")&& tipo3.equals("onivoro")){
			System.out.println("homem");
		}else if(tipo1.equals("vertebrado") && tipo2.equals("mamifero")&& tipo3.equals("herbivoro")){
			System.out.println("vaca");
		}else if(tipo1.equals("invertebrado") && tipo2.equals("inseto")&& tipo3.equals("hematofago")){
			System.out.println("pulga");
		}else if(tipo1.equals("invertebrado") && tipo2.equals("inseto")&& tipo3.equals("herbivoro")){
			System.out.println("largata");
		}else if(tipo1.equals("invertebrado") && tipo2.equals("anelideo")&& tipo3.equals("hematofago")){
			System.out.println("sanguessuga");
		}else if(tipo1.equals("invertebrado") && tipo2.equals("anelideo")&& tipo3.equals("onivoro")){
			System.out.println("minhoca");	
		}	
		
		sc.close();
		
                                                                                              
	}		
}


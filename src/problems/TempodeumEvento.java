package problems;
import java.util.Locale;
import java.util.Scanner;
//Link da questao:
//https://www.beecrowd.com.br/judge/pt/problems/view/1061

public class TempodeumEvento {
		
	public static void main(String[] args){
		Locale.setDefault(Locale.US); 
		Scanner leitor = new Scanner(System.in);
        int totalDias = 0, totalHoras = 0, totalMinutos = 0, totalSegundos = 0;
        String[] SdiaInicial = leitor.nextLine().split(" ");
        String[] ShoraInicial = leitor.nextLine().replaceAll(" ", "").split(":");
        String[] SdiaFinal = leitor.nextLine().split(" ");
        String[] ShoraFinal = leitor.nextLine().replaceAll(" ", "").split(":");
        int diaInicial = Integer.parseInt(SdiaInicial[1]);
        int horaInicial = Integer.parseInt(ShoraInicial[0]);
        int minutoInicial = Integer.parseInt(ShoraInicial[1]);
        int segundoInicial = Integer.parseInt(ShoraInicial[2]);
        int diaFinal = Integer.parseInt(SdiaFinal[1]);
        int horaFinal = Integer.parseInt(ShoraFinal[0]);
        int minutoFinal = Integer.parseInt(ShoraFinal[1]);
        int segundoFinal = Integer.parseInt(ShoraFinal[2]);
		leitor.close();
		
		int  conversaoSegI = 0;
		int  conversaoSegF = 0;
	
		conversaoSegI =(segundoInicial + minutoInicial*60 + horaInicial*60*60 + diaInicial*24*60*60);
		conversaoSegF =(segundoFinal + minutoFinal*60 + horaFinal*60*60 + diaFinal*24*60*60);
		
		int tempoDuracaoEmSeg = 0;
		tempoDuracaoEmSeg = (conversaoSegF-conversaoSegI);
	 
		System.out.println(tempoDuracaoEmSeg/(60*60*24)+" dia(s)");
		tempoDuracaoEmSeg%=(60*60*24);
		System.out.println(tempoDuracaoEmSeg/(60*60)+" hora(s)");
		tempoDuracaoEmSeg%=(60*60);
		System.out.println(tempoDuracaoEmSeg/(60)+" minuto(s)");
		tempoDuracaoEmSeg%=(60);
		System.out.println(tempoDuracaoEmSeg+" segundo(s)");
		
	}	
	
}
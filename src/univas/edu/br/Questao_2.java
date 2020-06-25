package univas.edu.br;
import java.util.Scanner;

public class Questao_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a =0 ;
		int b=0 ;
		int aux1 = 0;
		int aux2 = 0;
		int sul, sud, ce, No, nor;
		int i  =0;
		sul=0;
		sud=0;
		ce=0;
		No=0;
		nor=0;
		for(i =0; i<=100; i++) {
			System.out.println("Você acredita que a vacina contra o COVID-19 fique pronta ainda em 2020?");
			System.out.println("1 – Sim\r\n" + 
					"2 – Não\r\n");
			a = scanner.nextInt();
			if(a == 1) {
				aux1 ++;
			}
			if(a == 2) {
				aux2 ++; 
			}
			
			System.out.println("Em que região voce mora ?\n"
					+ "1 – Sul\r\n" + 
					"2 – Sudeste\r\n" + 
					"3 – Centro-Oeste\r\n" + 
					"4 – Norte\r\n" + 
					"5 – Nordeste\r\n" );
			b = scanner.nextInt();
			if(b == 1) {
				sul++;
			}
			if(b == 2) {
				sud++;
			}
			if(b == 3) {
				ce++;
			}
			if(b == 4) {
				No++;
			}
			if(b == 5) {
				nor++;
			}
		}
		
		System.out.println(aux1 + "Votaram Sim\n"
				+aux2 +"Votaram Não\n\n");
		System.out.println(sul + " Mora no sul\n"
				+sud + " Mora no sudeste\n"
				+ce + " Mora no centro oeste\n"
				+No + " Mora no norte\n"
				+nor + " Mora no Nordeste\n");
	}
}
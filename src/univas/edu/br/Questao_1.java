package univas.edu.br;
import java.util.Scanner;
public class Questao_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int ler = 0;
		int aux = 0;
		
	do {
		ler = input.nextInt();
		if(ler < 0) {
			aux++;
		}
	}while(ler != 0);
	System.out.println(aux);
	}
}

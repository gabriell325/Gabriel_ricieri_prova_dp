package univas.edu.br;
import java.util.Scanner;
public class Questao_3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um numero:");
		
		int num = input.nextInt();
		
		if (num % 5 == 3) {
			
			num = num + 2;
			
		}else if (num % 5 == 4) {
			
			num = num + 1;
			
		}
		System.out.println(num);
		
	}

}

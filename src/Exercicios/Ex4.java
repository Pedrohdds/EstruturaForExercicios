package Exercicios;
import java.util.Scanner;
import java.util.Locale;

public class Ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double numero = sc.nextDouble();
		
		for (int i = 0; i < numero; i++) {
			double n1 = sc.nextDouble();
			double n2 = sc.nextDouble();
			
			double divisao = n1 / n2;
			
			if(n2 == 0 ) {
				System.out.println("Não é possível dividir por zero");
			} else {
				System.out.println(divisao);
			}
			
		}
		sc.close();
	}

}

package Exercicios;

import java.util.Scanner;
import java.util.Locale;

/* Online Java Compiler and Editor */
public class Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Locale.setDefault(Locale.US);
		sc.useLocale(Locale.US);

		// System.out.print("Digite um número decimal: ");
		// double numero = sc.nextDouble();
		// System.out.println("Você digitou: " + numero);

		System.out.print("Digite a quantidade: ");
		int qtd = sc.nextInt();

		for (int i = 0; i < qtd; i++) {
			double media = 0;
			System.out.print("Digite o valor 1: ");
			double n1 = sc.nextDouble();
			System.out.print("Digite o valor 2: ");
			double n2 = sc.nextDouble();
			System.out.print("Digite o valor 3: ");
			double n3 = sc.nextDouble();

			media = (n1 * 2.0 + n2 * 3.0 + n3 * 5.0) / 10.0;

			System.out.printf("%.2f%n", media);
			System.out.printf("n");
		}

		sc.close();
	}
}

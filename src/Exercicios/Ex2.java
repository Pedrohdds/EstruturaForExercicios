package Exercicios;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int contagemDentro = 0;
		int contagemFora = 0;

		for (int i = 0; i < n; i++) {
			
			int valores = sc.nextInt();
			
			if (valores >= 10 && valores <= 20) {
				
				contagemDentro++;
				
			} else {
				
				contagemFora++;
			}
		}
System.out.println(contagemDentro + " In");
System.out.println(contagemFora + " out");
sc.close();
	}

}

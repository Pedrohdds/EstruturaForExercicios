package Exercicios;
import java.util.Locale;
import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int numero = sc.nextInt();
		//int div = 0;
		
		for (int i = 1; i <= numero; i++) {
			
			if (numero % i == 0){
				System.out.println(i);
			}
		}
sc.close();
	}

}

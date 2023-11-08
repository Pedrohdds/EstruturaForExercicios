package Exercicios;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//int i = sc.nextInt();
		int n = sc.nextInt();
		int fat = 1;

		for (int i=1; i<=n; i++) {

			fat = fat * i;
			
			if(n == 1 || n == 0){
				fat = 1;
			}
		}
		System.out.println(fat);
		sc.close();
	}

}

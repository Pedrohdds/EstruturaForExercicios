package Exercicios;
import java.util.Scanner;
public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		//int rep;
		
	//	rep = 0;

		for(int i = 0; i < x ; i++) {
			if(i % 2 == 1) {
				System.out.println(i);
			}
		}
		sc.close();
	}

}

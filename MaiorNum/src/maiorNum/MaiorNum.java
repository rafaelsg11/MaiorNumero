package maiorNum;

import java.util.Scanner;

public class MaiorNum {

	public static void main(String[] args) {
		int num[] = new int[5];
		int maior = 0;
		
		Scanner read = new Scanner(System.in);
		
		for(int i = 0; i < num.length; i++) {
			System.out.print("Digite o " +(i+1) + "o valor: ");
			num[i] = read.nextInt();
			if(num[i] > maior) {
				maior = num[i];
			}
		}
		System.out.println("Maior valor: " + maior);
	}
}
package br.edu.principal;

import java.util.Scanner;

public class maior_menor {
	public static void maior_menor() {
		Scanner sc = new Scanner(System.in);
		double i , num, maior = 0, menor = 0;
		for (i = 1; i <= 5; i++) {
			System.out.println("Digite o " + i + " número:");
			num = sc.nextDouble();
			
			if (i == 1) {
				maior = num;
				menor = num;
			}
			if (num > maior) {
				maior = num;
			}
			else if (num < menor) {
				menor = num;
			}
			
		}
		System.out.println("O maior número digitado foi: " + maior);
		System.out.println("O menor número digitado foi: " + menor);

	}

}

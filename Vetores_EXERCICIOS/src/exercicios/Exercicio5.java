package exercicios;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos numeros vc vai digitar?: ");
		int n = sc.nextInt();
		double vect[] = new double [n];
		for (int i=0; i<vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		double maiorvalor = 0.0;
		int posicaovect = 0;
		for (int i=0; i<vect.length; i++) {
			if (vect[i]>maiorvalor) {
				maiorvalor = vect[i];
				posicaovect = i;
			}
		}
		System.out.printf("MAIOR VALOR: %.2f%n", maiorvalor);
		System.out.print("POSICAO DO MAIOR VALOR: " + posicaovect);
		sc.close();
	}

}

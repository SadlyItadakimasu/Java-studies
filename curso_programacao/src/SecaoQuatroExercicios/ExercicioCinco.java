package SecaoQuatroExercicios;

import java.util.Scanner;

public class ExercicioCinco {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Codigo da primeira peca: ");
		int codigo1 = sc.nextInt();
		System.out.print("Quantidade:");
		int quantia1 = sc.nextInt();
		System.out.print("Valor da unidade: ");
		double valor1 = sc.nextDouble();
		System.out.printf("%nCodigo da segunda peca: ");
		int codigo2 = sc.nextInt();
		System.out.print("Quantidade: ");
		int quantia2 = sc.nextInt();
		System.out.print("Valor da unidade: ");
		double valor2 = sc.nextDouble();
		double preco = (valor1*quantia1)+(valor2*quantia2);
		System.out.printf("Valor a ser pago: R$%.2f", preco);	
		sc.close();

	}

}

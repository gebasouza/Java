/*
 * Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
bem como os nomes dessas pessoas caso houver.
 * 
 */

import java.util.Locale;
import java.util.Scanner;

public class Alturas {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas pessoas serão digitadas???");
		int n = sc.nextInt();

		String[] nomes = new String[n];
		int[] idades = new int[n];
		double[] alturas = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Dados da " + (i + 1) + "º a pessoa:: ");
			System.out.print("Nome: ");
			nomes[i] = sc.next();

			System.out.print("Idades: ");
			idades[i] = sc.nextInt();

			System.out.print("alturas: ");
			alturas[i] = sc.nextDouble();

		}

		double soma = 0.0;
		for (int i = 0; i < n; i++) {
			soma = soma + alturas[i];
		}

		double mediaalturas = soma / n;

		System.out.println();
		System.out.printf("Altura média: %.2f%n", mediaalturas);

		int cont = 0;
		for (int i = 0; i < n; i++) {
			if (idades[i] < 16) {
				cont = cont + 1;
			}
		}

		double porcentagem = cont * 100 / n;
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", porcentagem);

		for (int i = 0; i < n; i++) {
			if (idades[i] < 16) {
				System.out.println(nomes[i]);
			}
		} 
		sc.close();

		
	}

}

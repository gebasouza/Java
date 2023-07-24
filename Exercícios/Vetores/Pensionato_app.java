package Exercicios_vetores;

import java.util.Locale;
import java.util.Scanner;

public class Pensionato_app {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Pensionato_ent[] vect = new Pensionato_ent[10];

		System.out.print("Quantas pessoas serão digitadas?");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Aluguel #" + i + ":");
			System.out.println("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println("Email: ");
			String email = sc.next();
			System.out.println("Quarto: ");
			int numeroquarto = sc.nextInt();

			vect[numeroquarto] = new Pensionato_ent(nome, email);
		}

		System.out.println();
		System.out.println("Quartos Ocupados: ");
		for (int i = 0; i < 10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ":" + vect[i]);
			}
		}

		sc.close();
	}

}

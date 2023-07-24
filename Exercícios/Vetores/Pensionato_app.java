/*
 * A dona de um pensionato possui dez quartos para alugar para estudantes, sendo esses 
 quartos identificados pelos números 0 a 9.
Fazer um programa que inicie com todos os dez quartos vazios, 
e depois leia uma quantidade N representado o número de estudantes que
vão alugar quartos (N pode ser de 1 a 10). Em seguida, registre o aluguel dos N estudantes.
Para cada registro de aluguel, informar o nome e email do estudante, bem com qual dos quartos vago. 
Ao final, seu programa deve imprimir um relatório de todas ocupações do pensionato, por ordem de quarto, conforme exemplo.

 * 
 */

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

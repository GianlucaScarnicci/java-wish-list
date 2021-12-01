package org.generation.italy.christmas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> wishList = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		String risposta = "";

		do {
			System.out.print("Aggiungi elemento alla lista dei desideri: ");

			wishList.add(scan.nextLine());
			System.out.println("la tua lista contiene " + wishList.size() + " desideri");
			System.out.print(" Continuare? (s/n) ");
			risposta = scan.nextLine();

		} while (risposta.equals("s"));
		Collections.sort(wishList);
		System.out.println("ecco la tua lista " + wishList);

		System.out.print("Inserisci il nome ");
		String nome = scan.nextLine();
		System.out.println("Inserici l'indirizzo ");
		String indirizzo = scan.nextLine();
		LetteraBabboNatale letterina = new LetteraBabboNatale(nome, indirizzo, wishList);
		try {
			System.out.println(letterina.invia());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		scan.close();
	}

}

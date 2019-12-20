package Calculation;

import java.util.Scanner;

public class MainFib {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		Calculator cal = new Calculator();
		boolean ergebnis = false;
		int szenario = 0;
		int stelle = 0;
		
		System.out.println("Willkommen zu unserem Fibonacci-Lernspiel!");
		System.out.println("Wenn Du Hilfe brauchst, wende dich an dein_e Lehrer_in oder besuche die Website \nhttp://members.chello.at/gut.jutta.gerhard/fibonacci.htm");
		System.out.println("Wollen Sie Szenario 1 oder Szenario 2 auswählen? (Geben Sie 1 oder 2 ein)");
		szenario = s.nextInt();
		if(szenario != 1 || szenario != 2) {
			System.out.println("Das ist kein gültiger Wert!");
			System.exit(1);
		}
		
		System.out.println("Bitte geben Sie eine Zahl zwischen 1 und 40 ein.");
		stelle = s.nextInt();

		if (szenario == 1) {
			ergebnis = cal.giveStelle(stelle);
		} else if (szenario == 2) {
			ergebnis = cal.giveSummand(stelle);
		} else {
			System.out.println("Keine gültige Eingabe");
			main(args);
		}
		
		if (ergebnis == true) {
			System.out.println("\n Sie haben gewonnen! Glückwunsch! :)");
		} else {
			System.out.println("Das war leider falsch.");
			if (szenario == 1) {
				ergebnis = cal.giveStelle(stelle);
			} else
				ergebnis = cal.giveSummand(stelle);
		}
	}
}
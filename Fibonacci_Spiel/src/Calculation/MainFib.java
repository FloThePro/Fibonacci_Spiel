package Calculation;

import java.util.Scanner;

public class MainFib {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Calculator cal = new Calculator();
		boolean ergebnis = false;
		int szenario = 0;
		int stelle = 0;
		
		System.out.println("Willkommen zu unserem Fibonacci-Lernspiel!");
		System.out.println("Wollen Sie Szenario 1 oder Szenario 2 auswählen? (Geben Sie 1 oder 2 ein)");
		szenario = s.nextInt();
		
		System.out.println("Bitte geben Sie eine Zahl zwischen 1 und 100 ein.");
		stelle = s.nextInt();

		if (szenario == 1) {
			ergebnis = cal.stelleAngeben(stelle);
		} else if (szenario == 2) {
			ergebnis = cal.summandenAngeben(stelle);
		} else {
			System.out.println("Keine gültige Eingabe");
			main(args);
		}
		
		if (ergebnis == true) {
			System.out.println("Sie haben gewonnen! Glückwunsch! :)");
		} else {
			System.out.println("Das war leider falsch.");
		}
	}
}
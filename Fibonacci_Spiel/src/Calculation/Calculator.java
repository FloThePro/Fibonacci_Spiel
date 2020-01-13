/**
 * 
 * @author Florian
 * @version 0.1
 * 
 */
package Calculation;

import java.util.Scanner;

public class Calculator {

	int [] fibonacciNumbers = new int [100];
	Scanner s= new Scanner(System.in);
	
	
	/**
	* This method fills the array fibonacciNumbers with ascending fibonacci numbers. 
	* If the array is empty, the first two spaces will be filled with the value 1. 
	*/
	public void fillArray() {
		for (int i = 0; i < 40; i++) {
			if (i < 2) {
				fibonacciNumbers[i] = 1;
			}else {
				fibonacciNumbers[i] = fibonacciNumbers[i-1] + fibonacciNumbers[i-2];
			}
		}
	}
	
	/** 
	 * @param stelle
	 * This method will print all the existing fibonacciNumbers in the array until the selected value.
	 */
	public void printArray(int stelle) {
		for (int i = 0; i < stelle; i++) {
			System.out.print("     " + fibonacciNumbers[i] + "     ");
		}
	}

	/**
	 * This is the code for scenario 1. The user will be asked to give the number at the selected value. 
	 * @param stelle
	 * @return
	 */
	public boolean giveStelle(int stelle) {
		fillArray();
		int eingabe;
		System.out.println("Du hast die " + stelle + " ausgewählt.");
		System.out.println("Gib bitte die korrekte Zahl an dieser Stelle an.");
		eingabe = s.nextInt();
		
		if (eingabe == fibonacciNumbers[stelle - 1]) {
			printArray(stelle);
			return true; 
		}else
			return false;
	}
	
	/**
	 * This is the code for scenario 2. The user will be asked to give the two numbers before the selected value. 
	 * @param stelle
	 * @return
	 */
	public boolean giveSummand(int stelle) {
		fillArray();
		System.out.println("Sie haben die " + stelle + " ausgewählt.");
		System.out.println("Die " + stelle + ". Stelle der Fibonacci-Zahlen ist: " + fibonacciNumbers[stelle]);
		int zahlStelleMinusEins, zahlStelleMinusZwei;
		System.out.println("Geben Sie bitte die Zahl zwei Stellen vor dieser an.");
		zahlStelleMinusZwei = s.nextInt();
		System.out.println("Geben Sie nun bitte die Zahl eine Stelle danach an.");
		zahlStelleMinusEins = s.nextInt();
		
		if (zahlStelleMinusEins == fibonacciNumbers[stelle - 1] && zahlStelleMinusZwei == fibonacciNumbers[stelle - 2]) {
			printArray(stelle);
			return true;
		}else
			return false;
	}
	
	
}

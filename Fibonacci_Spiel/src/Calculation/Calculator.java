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
	
	
	//This Method fills the array fibonacciNumbers.
	public void fillArray() {
		for (int i = 0; i < 100; i++) {
			if (i < 2) {
				fibonacciNumbers[i] = 1;
			}else {
				fibonacciNumbers[i] = fibonacciNumbers[i-1] + fibonacciNumbers[i-2];
			}
		}
	}
	
	public void printArray() {
		fillArray();
		for (int i = 0; i < 100; i++) {
			System.out.println(fibonacciNumbers[i]);
		}
	}

	public boolean stelleAngeben(int stelle) {
		fillArray();
		int eingabe;
		System.out.println("Sie haben die " + stelle + " ausgewählt.");
		System.out.println("Geben Sie bitte die korrekte Zahl an dieser Stelle an.");
		eingabe = s.nextInt();
		
		if (eingabe == fibonacciNumbers[stelle - 1]) {
			return true; 
		}else {
			return false;
		}
	}
	
	public boolean summandenAngeben(int stelle) {
		fillArray();
		System.out.println("Sie haben die " + stelle + " ausgewählt.");
		System.out.println("Die " + stelle + ". Stelle der Fibonacci-Zahlen ist: " + fibonacciNumbers[stelle]);
		int zahlStelleMinusEins, zahlStelleMinusZwei;
		System.out.println("Geben Sie bitte die Zahl zwei Stellen vor dieser an.");
		zahlStelleMinusZwei = s.nextInt();
		System.out.println("Geben Sie nun bitte die Zahl eine Stelle danach an.");
		zahlStelleMinusEins = s.nextInt();
		
		if (zahlStelleMinusEins == fibonacciNumbers[stelle - 1] && zahlStelleMinusZwei == fibonacciNumbers[stelle - 2]) {
			return true;
		}else
			return false;
	}
	
	
}

/**
 * 
 * @author Florian
 * @version 0.1
 * 
 */
package Calculation;

public class Calculator {

	int [] fibunacciNumbers;
	
	public void fillArray() {
		for (int i = 0; i < 101; i++) {
			if (i < 2) {
				fibunacciNumbers[i] = 1;
			}else {
				fibunacciNumbers[i] = fibunacciNumbers[i-1] + fibunacciNumbers[i-2];
			}
		}
	}
	
	
}

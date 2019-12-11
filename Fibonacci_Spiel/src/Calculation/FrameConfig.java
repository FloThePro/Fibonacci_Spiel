package Calculation;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FrameConfig {

	public static void main(String[] args) {
		JLabel scenarioSelect = new JLabel("Wollen Sie Szenario 1 oder Szenario 2 auswählen? (Geben Sie 1 oder 2 ein)");
		JFrame gameEnv = new JFrame("Fibonacci-Spiel");
		gameEnv.setExtendedState(JFrame.MAXIMIZED_BOTH);
		gameEnv.setUndecorated(true);
		
		scenarioSelect.setLocation(0, 0);
		gameEnv.add(scenarioSelect);
		gameEnv.setVisible(true);
		gameEnv.getContentPane().setLayout(null);
		scenarioSelect.setVisible(true);
	}
}

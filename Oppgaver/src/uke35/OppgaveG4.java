package uke35;

import static javax.swing.JOptionPane.showInputDialog;
import static java.lang.Integer.*;

public class OppgaveG4 {

	public static void main(String[] args) {
		final int REP = 5;
		int ANTALL = 0;
		while (ANTALL < REP) {
			String tallTxt = showInputDialog("Gi et tall:");
			ANTALL++;
			int tall = parseInt(tallTxt);

			System.out.println("Sum: " + tall);
		}
	}
}
package uke35;

import static javax.swing.JOptionPane.showInputDialog;

public class OppgaveB5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int STUDENTER = 10;
		int ANTALL = 0;
		while (ANTALL < STUDENTER)

		{
			int poeng = Integer.parseInt(showInputDialog("Poengsum?"));
			String karakter = "ugyldig";
			if (poeng < 0) {
				karakter = "UGYLDIG";
				ANTALL--;
			} else if (poeng <= 39) {
				karakter = "F";
			} else if (poeng <= 49) {
				karakter = "E";
			} else if (poeng <= 59) {
				karakter = "D";
			} else if (poeng <= 79) {
				karakter = "C";
			} else if (poeng <= 89) {
				karakter = "B";
			} else if (poeng <= 100) {
				karakter = "A";
			} else if (poeng > 100) {
				karakter = "UGYLDIG";
				ANTALL--;
			}
			ANTALL++;
			System.out.println("Student " + ANTALL + " sin karakter er: " + karakter);
		}
	}
}
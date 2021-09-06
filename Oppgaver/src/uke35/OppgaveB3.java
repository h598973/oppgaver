package uke35;

import static javax.swing.JOptionPane.*;

public class OppgaveB3 {

	public static void main(String[] args) {

		String brukernavn = showInputDialog("Brukernavn :");
		String passord = showInputDialog("Passord :");
		String brukernavn2 = "admin";
		String passord2 = "admin";

		if (brukernavn.equals(brukernavn2) && passord.equals(passord2)) {
			;
			System.out.println("Innlogging lykkes!");
		} else {
			System.out.println("Innlogging feilet!");
		}
	}

}

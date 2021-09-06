package uke35;

import static javax.swing.JOptionPane.*;

public class OppgaveB2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pris = Integer.parseInt(showInputDialog("Pris?"));

		int betalt = Integer.parseInt(showInputDialog("Betalt?"));

		String utTekst = "Tiere tilbake: " + ((betalt - pris) / 10) + "\n" + "Enere tilbake: " + (betalt - pris) % 10;

		showMessageDialog(null, utTekst);
	}

}

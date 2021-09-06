package uke35;

import static javax.swing.JOptionPane.showInputDialog;

public class OppgaveB4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sats = 0.0;
		int bruttolønn = Integer.parseInt(showInputDialog("Bruttolønn?"));

		if (bruttolønn < 164100) {
			sats = 0.0;
		} else if (bruttolønn < 230950) {
			sats = 0.93;
		} else if (bruttolønn < 580650) {
			sats = 2.41;
		} else if (bruttolønn < 934050) {
			sats = 11.52;
		} else if (bruttolønn > 934051) {
			sats = 14.52;
		}
		double trinnskatt = bruttolønn *(sats/100);
		System.out.println("Trinnskatt "+trinnskatt);
	}
}
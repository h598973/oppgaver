package uke35;

import static javax.swing.JOptionPane.showInputDialog;

public class OppgaveG3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = Integer.parseInt(showInputDialog("Tall A"));
		int b = Integer.parseInt(showInputDialog("Tall B"));
		if ( b != 0) {

			int c = a / b;

			System.out.println("Sum: " + c);
		} else {
			System.out.println("Kan ikke deles på 0");
		}
	}

}
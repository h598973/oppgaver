package uke35;

import static javax.swing.JOptionPane.showInputDialog;

public class OppgaveB1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int radius = Integer.parseInt(showInputDialog("Radius"));
		double omkrets = ((4.0/3)*Math.PI*Math.pow(radius,3));
		System.out.println("Volum " + omkrets);
	}

}

package ma.emi.ginf.ihm;
import java.awt.Dimension;

import javax.swing.*;

import ma.emi.ginf.control.ControlCommande;
public class CommandeFrame extends JFrame{
	
	private ControlCommande controleur;
	
	
	public CommandeFrame() {
		this.setTitle("Fenetre Commande");
		this.setSize(new Dimension(520,600));
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	
		
	}
	
	
  public static void main(String[] args) {
	 CommandeFrame mafentre = new CommandeFrame();
		mafentre.setVisible(true);
}
}

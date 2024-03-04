package jeu;

import javax.swing.*;


public class Main {
	//**** VARIABLES ****//
	public static jeu.Scene scene; // Toutes les classes ont acc�s � l'objet scene (static)

	public static void main(String[] args) {
		// Cr�ation de la fenetre de l'application
		JFrame fenetre = new JFrame("Jeu style Mario");
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setSize(700, 360);
		fenetre.setLocationRelativeTo(null);
		fenetre.setResizable(false);
		fenetre.setAlwaysOnTop(true);
		// Instanciation de l'objet scene
		scene = new jeu.Scene();
		fenetre.setContentPane(scene); // On associe la scene � la fen�tre de l'application
		fenetre.setVisible(true);
	}
}
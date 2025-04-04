package devoir4;

import java.util.Scanner;

public class GestionnaireChaletsEtEmployés {
	private static final String MDPPROPRIO = "chaletsTR25";
	private static int option;
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		CentreDeLocation entreprise = new CentreDeLocation(new Chalet[], new Employé[], MDPPROPRIO);
		boolean arrêtMenuPrincipal = false;
		boolean arrêtMenuPropriétaire = false;

		while (!arrêtMenuPrincipal) {
			afficherMenuPrincipal();
			option = scan.nextInt();
			
			switch (option) {
			case 0: {
				arrêtMenuPrincipal = true;
				break;
			}
			case 1: {
				// Menu Employé
				break;
			}
			case 2: {
				// Menu Propriétaire
				break;
			}
			}
			System.out.println();
		}
		System.out.println("\nAu revoir !");
		scan.close();
	}

	private static void afficherMenuPrincipal() {
		System.out.println("==========MENU PRINCIPAL==========\n");
		System.out.println("Option 1 : Menu Employé");
		System.out.println("Option 2 : Menu Propriétaire");
		System.out.println("Appuyez sur 0 pour quitter.\n");
		System.out.println("Veuillez choisir une option.");
	}
	
	private static void afficherMenuEmployé() {
		System.out.println("==========MENU EMPLOYÉ==========\n");
		System.out.println("Option 1 : Consulter vos disponibilités");
		System.out.println("Option 2 : Modifier une disponibilité");
		System.out.println("Option 3 : Consulter la liste des chalets vous étant assignés");
		System.out.println("Option 4 : Consulter votre salaire");
		System.out.println("Appuyez sur 0 pour quitter.\n");
		System.out.println("Veuillez choisir une option.");
	}
	
	private static void afficherMenuPropriétaire() {}
	
	private static void menuEmployé() {
		boolean arrêtMenuEmployé = false;
		Employé employéConnecté;
		
		while (!arrêtMenuEmployé) {
			afficherMenuEmployé();
			option = scan.nextInt();
			//Switch case
		}
	}

}

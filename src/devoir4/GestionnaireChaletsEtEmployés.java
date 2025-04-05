package devoir4;

import java.util.Scanner;

public class GestionnaireChaletsEtEmployés {
	private static final String MDPPROPRIO = "chaletsTR25";
	private static int option;
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		CentreDeLocation entreprise = new CentreDeLocation(new Chalet[], new Employé[], MDPPROPRIO);
		boolean arrêtMenuPrincipal = false;

		while (!arrêtMenuPrincipal) {
			afficherMenuPrincipal();
			option = scan.nextInt();
			
			switch (option) {
			case 0: {
				arrêtMenuPrincipal = true;
				break;
			}
			case 1: {
				menuEmployé();
				break;
			}
			case 2: {
				// Menu Propriétaire
				break;
			}
			}
			System.out.println();
		}
		System.out.println("Au revoir !");
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
		System.out.println("\n==========MENU EMPLOYÉ==========\n");
		System.out.println("Option 1 : Afficher vos disponibilités");
		System.out.println("Option 2 : Modifier une disponibilité");
		System.out.println("Option 3 : Consulter la liste des chalets vous étant assignés");
		System.out.println("Option 4 : Afficher votre salaire");
		System.out.println("Appuyez sur 0 pour retourner au menu principal.\n");
		System.out.println("Veuillez choisir une option.");
	}
	
	private static void afficherMenuPropriétaire() {
		System.out.println("\n==========MENU PROPRIÉTAIRE==========\n");
		System.out.println("Option 1 : Consulter la liste de vos employés et leurs caractéristiques");
		System.out.println("Option 2 : ");
		System.out.println("Option 3 : ");
		System.out.println("Option 4 : ");
		System.out.println("Appuyez sur 0 pour retourner au menu principal.\n");
		System.out.println("Veuillez choisir une option.");
	}
	
	private static void menuEmployé() {
		boolean arrêtMenuEmployé = false;
		Employé employéConnecté;
		
		while (!arrêtMenuEmployé) {
			afficherMenuEmployé();
			option = scan.nextInt();
			
			switch (option) {
			case 0: {
				arrêtMenuEmployé = true;
				break;
			}
			case 1: {
				break;
			}
			case 2: {
				break;
			}
			case 3: {
				break;
			}
			case 4: {
				break;
			}
			}
		}
		System.out.println("\nRetour au menu principal");
	}
	
	private static void menuPropriétaire() {
		boolean arrêtMenuPropriétaire = false;
		
		while (!arrêtMenuPropriétaire) {
			afficherMenuEmployé();
			option = scan.nextInt();
			
			switch (option) {
			case 0: {
				arrêtMenuEmployé = true;
				break;
			}
			case 1: {
				break;
			}
			case 2: {
				break;
			}
			case 3: {
				break;
			}
			case 4: {
				break;
			}
			}
			System.out.print("\n");
		}
		System.out.println("Retour au menu principal");
	}

}

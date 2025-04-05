package devoir4;

import java.util.Scanner;

public class GestionnaireChaletsEtEmployés {
	private static final String MDPPROPRIO = "chaletsTR25";
	private static int option;
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		CentreDeLocation entreprise = new CentreDeLocation(new Chalet[] {}, new Employé[] {}, MDPPROPRIO);
		boolean arrêtMenuPrincipal = false;

		while (!arrêtMenuPrincipal) {
			afficherMenuPrincipal();
			option = traiterChoix(0, 2);

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
				menuPropriétaire();
				break;
			}
			}
			System.out.print("\n");
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
		System.out.println("Option 2 : Consulter la liste de vos chalets et leurs caractéristiques");
		System.out.println("Option 3 : Afficher le nombre d'employés");
		System.out.println("Option 4 : Afficher le nombre de chalets");
		System.out.println("Option 5 : Ajouter un employé");
		System.out.println("Option 6 : Supprimer un employé");
		System.out.println("Option 7 : Ajouter un chalet");
		System.out.println("Option 8 : Supprimer un chalet");
		System.out.println("Option 9 : Modifier le salaire d'un employé");
		System.out.println("Option 10 : Comparer deux employés selon leurs salaires");
		System.out.println("Option 11 : Afficher les disponibilités d'un employé");
		System.out.println("Option 12 : Afficher les chalets associés à un employé");
		System.out.println("Option 13 : Ajouter un chalet à ceux associés à un employé");
		System.out.println("Option 14 : Supprimer un chalet à ceux associés à un employé");
		System.out.println("Option 15 : Modifier la disponibilité à la location d'un chalet");
		System.out.println("Appuyez sur 0 pour retourner au menu principal.\n");
		System.out.println("Veuillez choisir une option.");
	}

	private static int traiterChoix(int limiteMinimum, int limiteMaximum) {
		int choix = -1;
		boolean valide = false;

		while (!valide) {
			try {
				choix = Integer.parseInt(scan.nextLine().trim());
				if (choix >= limiteMinimum && choix <= limiteMaximum) {
					valide = true;
				} else {
					System.out.println("Votre choix ne fait pas partie des options valides. Réessayez.\n");
				}
			} catch (Exception e) {
				System.out.println("Ceci est une entrée invalide. Recommencez.\n");
			}
		}
		return choix;
	}

	private static void menuEmployé() {
		boolean arrêtMenuEmployé = false;
		Employé employéConnecté;

		while (!arrêtMenuEmployé) {
			afficherMenuEmployé();
			option = traiterChoix(0, 4);

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
				employéConnecté.afficherChaletsEntretenus();
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
			afficherMenuPropriétaire();
			option = traiterChoix(0, 15);

			switch (option) {
			case 0: {
				arrêtMenuPropriétaire = true;
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
			case 5: {
				break;
			}
			case 6: {
				break;
			}
			case 7: {
				break;
			}
			case 8: {
				break;
			}
			case 9: {
				break;
			}
			case 10: {
				break;
			}
			case 11: {
				break;
			}
			case 12: {
				break;
			}
			case 13: {
				break;
			}
			case 14: {
				break;
			}
			case 15: {
				break;
			}
			}
		}
		System.out.println("\nRetour au menu principal");
	}

}

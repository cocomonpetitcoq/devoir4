package devoir4;

import java.util.Scanner;

public class GestionnaireChaletsEtEmployés {
	private static final String MDPPROPRIO="chaletsTR25";

	public static void main(String[] args) {
		CentreDeLocation entreprise = new CentreDeLocation(new Chalet[], new Employé[], MDPPROPRIO);
		int option;
		boolean arrêtMenuPrincipal = false;
		boolean arrêtMenuEmployé = false;
		boolean arrêtMenuPropriétaire = false;
		Scanner scan = new Scanner(System.in);
		Employé employéConnecté;
	}

}

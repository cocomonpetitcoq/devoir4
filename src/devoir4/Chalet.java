package devoir4;

public class Chalet {
	private String Nom;
	private String ville;
	private int nb_chambres;
	private boolean loué;
	private Employé employéEntretien;
	
	public Chalet(String nom, String ville, int nb_chambres, boolean loué, Employé employéEntretien) {
		super();
		Nom = nom;
		this.ville = ville;
		this.nb_chambres = nb_chambres;
		this.loué = false;
		this.employéEntretien = null;
	}
	
}

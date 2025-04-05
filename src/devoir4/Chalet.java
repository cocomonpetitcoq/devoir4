package devoir4;

public class Chalet {
	private String nom;
	private String ville;
	private String adresse;
	private int nbchambres;
	private boolean loué;
	private Boolean employéEntretien;
	
	public Chalet(String nom, String ville, int nbchambres, boolean loué, Boolean employéEntretien,String adresse) {
		this.nom = nom;
		this.adresse=adresse;
		this.ville = ville;
		this.nbchambres = nbchambres;
		this.loué = false;
		this.employéEntretien = false;	}


	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getNbchambres() {
		return nbchambres;
	}

	public void setNbchambres(int nbchambres) {
		this.nbchambres = nbchambres;
	}

	public boolean getLoué() {
		return loué;
	}

	public void setLoué(boolean loué) {
		this.loué = loué;
	}

	public Boolean getEmployéEntretien() {
		return employéEntretien;
	}

	public void setEmployéEntretien(Boolean employéEntretien) {
		this.employéEntretien = employéEntretien;
	}
	public String toString() {
		return "Le Chalet [" + nom + ", dans la ville=" + ville + ", a l'adresse=" + adresse + ", ayant pour quantité de chambre" + nbchambres
				 + loué + ", avec pour employé en Entretien:" + employéEntretien + "]";
	}
	
}

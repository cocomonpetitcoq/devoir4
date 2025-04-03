package devoir4;

import java.util.Arrays;

public class Employé {
	private String Nom;
	private String Prenom;
	private int id;
	private String ville;
	private boolean[]disponibilités;
	private Chalet [] chaletEntretenu;
	
	public Employé(String nom, String prenom, int id, String ville, boolean[] disponibilités,
			Chalet[] chaletEntretenu) {
		Nom = nom;
		Prenom = prenom;
		this.id = id;
		this.ville = ville;
		this.disponibilités = new boolean[7];
		this.chaletEntretenu = new Chalet[5];
	}

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public String getPrenom() {
		return Prenom;
	}

	public void setPrenom(String prenom) {
		Prenom = prenom;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public boolean[] getDisponibilités() {
		return disponibilités;
	}

	public void setDisponibilités(boolean[] disponibilités) {
		this.disponibilités = disponibilités;
	}

	public Chalet[] getChaletEntretenu() {
		return chaletEntretenu;
	}

	public void setChaletEntretenu(Chalet[] chaletEntretenu) {
		this.chaletEntretenu = chaletEntretenu;
	}
	@Override
	public String toString() {
		return "Employé [Nom=" + Nom + ", Prenom=" + Prenom + ", id=" + id + ", ville=" + ville + ", disponibilités="
				+ Arrays.toString(disponibilités) + ", chaletEntretenu=" + Arrays.toString(chaletEntretenu) + "]";
	}

}

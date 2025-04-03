package devoir4;

import java.util.Arrays;

public class Employé {
	private String nom;
	private String prénom;
	private double salaire;
	private static int C;
	private int id;
	private String ville;
	private boolean[]disponibilités;
	private Chalet [] chaletEntretenus;
	
public Employé() {
		nom="arnold";
		prénom="ulrich";
		id=100000;
		ville="montreal";
	}
	public Employé(String nom, String prénom, String ville, boolean[] disponibilités,
			Chalet[] chaletEntretenu) {
		this.nom = nom;
		this.prénom = prénom;
		this.id = ++C;
		this.ville = ville;
		this.disponibilités = new boolean[7];
		this.chaletEntretenus = new Chalet[5];
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		nom = nom;
	}

	public String getPrenom() {
		return prénom;
	}

	public void setPrenom(String prénom) {
		prénom = prénom;
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
	public double getSalaire() {
		return salaire;
	}
	
	public void setSalaire(double salaire) {
		this.salaire=salaire;
	}

	public boolean[] getDisponibilités() {
		return disponibilités;
	}

	public void setDisponibilités(boolean[] disponibilités) {
		this.disponibilités = disponibilités;
	}

	public Chalet[] getChaletEntretenu() {
		return chaletEntretenus;
	}

	public void setChaletEntretenu(Chalet[] chaletEntretenu) {
		this.chaletEntretenus = chaletEntretenu;
	}
	public String toString() {
		return "Employé ["+ id +"," + nom + "," + prénom + "son salaire=" + salaire+ ", ville:" + ville + ", les disponibilités sont :"
				+ Arrays.toString(disponibilités) + ", chaletEntretenu=" + Arrays.toString(chaletEntretenus) + "]";
	}

}

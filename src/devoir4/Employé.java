package devoir4;

import java.util.Arrays;

public class Employé {
	private String nom;
	private String prénom;
	private double salaire;
	private static int auto = 100000;
	private int id;
	private String ville;
	private boolean[] disponibilités;
	private Chalet[] chaletsEntretenus;

	public Employé(String nom, String prénom, String ville, boolean[] disponibilités, Chalet[] chaletsEntretenus) {
		this.nom = nom;
		this.prénom = prénom;
		this.id = ++auto;
		this.ville = ville;
		this.disponibilités = disponibilités;
		this.chaletsEntretenus = chaletsEntretenus;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrénom() {
		return prénom;
	}

	public void setPrénom(String prénom) {

		this.prénom = prénom;
	}

	public int getId() {
		return id;
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
		this.salaire = salaire;
	}

	public boolean[] getDisponibilités() {
		return disponibilités;
	}

	public void setDisponibilités(boolean[] disponibilités) {
		this.disponibilités = disponibilités;
	}

	public Chalet[] getChaletsEntretenus() {
		return chaletsEntretenus;
	}

	public void setChaletsEntretenus(Chalet[] chaletsEntretenus) {
		this.chaletsEntretenus = chaletsEntretenus;
	}
	
	public void afficherChaletsEntretenus() {
		System.out.println("\nChalets entretenus par " + getPrénom() + " " + getNom() + " (" + getId() + ")\n");
		for (int i = 0; i < getChaletsEntretenus().length; i++) {
			System.out.println((i + 1) + ". " + getChaletsEntretenus()[i].toString());
		}
	}

	public String toString() {
		return "Employé [" + id + "," + nom + "," + prénom + "son salaire=" + salaire + ", ville:" + ville
				+ ", les disponibilités sont :" + Arrays.toString(disponibilités) + ", chaletEntretenu="
				+ Arrays.toString(chaletsEntretenus) + "]";
	}

}

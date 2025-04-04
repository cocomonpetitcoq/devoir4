package devoir4;

public class CentreDeLocation {
	private Chalet[] chalets;
	private Employé[] employés;
	private String motDePasse;

	public CentreDeLocation(Chalet[] chalets, Employé[] employés, String motDePasse) {
		this.chalets = chalets;
		this.employés = employés;
		this.motDePasse = motDePasse;
	}

	public Chalet[] getChalets() {
		return chalets;
	}

	public Employé[] getEmployés() {
		return employés;
	}

	private String getMotDePasse() {
		return motDePasse;
	}
}

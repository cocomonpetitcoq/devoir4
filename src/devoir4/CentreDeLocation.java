package devoir4;

public class CentreDeLocation {
	private Chalet[] chalets;
	private Employé[] employés;
	private String motDePasse;
	private static final String MDPPROPRIO="chaletsTR25";
	private Employé employéconnectés;
	

	public CentreDeLocation(Chalet[] chalets, Employé[] employés, String motDePasse,Employé employéconnectés) {
		this.chalets = chalets;
		this.employés = employés;
		this.motDePasse = motDePasse;
		this.employéconnectés=employéconnectés;
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

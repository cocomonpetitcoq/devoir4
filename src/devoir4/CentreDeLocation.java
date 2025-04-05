/*Références
 * https://stackoverflow.com/a/24112752*/

package devoir4;

import java.util.Arrays;

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

	public Employé getEmployéParId(int id) {
		return Arrays.stream(getEmployés()).filter(employé -> employé.getId() == id).toArray(Employé[]::new)[0];
	}
}

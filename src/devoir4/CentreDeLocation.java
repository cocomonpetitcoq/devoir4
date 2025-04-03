package devoir4;

public class CentreDeLocation {
	private Chalet[] chalets;
	private Employé[] employés;
	
	public CentreDeLocation(Chalet[] chalets, Employé[] employés) {
		this.chalets = chalets;
		this.employés = employés;
	}
	
	public Chalet[] getChalets() {
		return chalets;
	}
	
	private void setChalets(Chalet[] chalets) {
		this.chalets = chalets;
	}
	
	public Employé[] getEmployés() {
		return employés;
	}
	
	private void setEmployés(Employé[] employés) {
		this.employés = employés;
	}
}

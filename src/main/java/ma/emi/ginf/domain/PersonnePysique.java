package ma.emi.ginf.domain;

public class PersonnePysique extends Client {
	private String nom,prenom;
	public PersonnePysique(String nom,String prenom, int numero, String adresseFacturation, String email) {
		super(numero, adresseFacturation, email);
		this.nom=nom;
		this.prenom= prenom;
	}

}

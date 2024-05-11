package ma.emi.ginf.domain;

import java.util.HashMap;
import java.util.Map;

public abstract class Client {
	protected int numero;
	protected String adresseFacturation;
	protected String email;
	private Map<Integer,Commande> mesCommandes;
	

	public Client(int numero, String adresseFacturation, String email) {
		super();
		this.numero = numero;
		this.adresseFacturation = adresseFacturation;
		this.email = email;
		this.mesCommandes = new HashMap<Integer,Commande>();
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getAdresseFacturation() {
		return adresseFacturation;
	}
	public void setAdresseFacturation(String adresseFacturation) {
		this.adresseFacturation = adresseFacturation;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
}

package ma.emi.ginf.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import ma.emi.ginf.poo.helper.KeyGenerator;

public class Commande {
	private int numero;
	private LocalDate dateCommande;
	private Client owner;
	private List<DetailCommande> dts ;
	
	public List<DetailCommande> getDts() {
		return dts;
	}
	public void setDts(List<DetailCommande> dts) {
		this.dts = dts;
	}

	public double calculerMontantTotal(){
		 double total=0;
		  for(DetailCommande dt : this.dts)
			    total+=dt.getPrixVenteReel()*dt.getQte();
		return total;
	 }
	
	
	

	
	public Commande(Client client) {
		this.numero = KeyGenerator.getKey();
		this.dateCommande = LocalDate.now();
		this.owner= client;
		this.dts = new ArrayList<DetailCommande>();
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public LocalDate getDateCommande() {
		return dateCommande;
	}


	public void setDateCommande(LocalDate dateCommande) {
		this.dateCommande = dateCommande;
	}


	public Client getOwner() {
		return owner;
	}


	public void setOwner(Client owner) {
		this.owner = owner;
	}

}

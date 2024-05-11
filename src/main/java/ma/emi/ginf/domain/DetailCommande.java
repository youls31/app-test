package ma.emi.ginf.domain;

public class DetailCommande {
	private int qte;
	private Produit produit;
	private double prixVenteReel;
	public DetailCommande(int qte, Produit produit, double prixVenteReel) {
		super();
		this.qte = qte;
		this.produit = produit;
		this.prixVenteReel = prixVenteReel;
	}
	public int getQte() {
		return qte;
	}
	public void setQte(int qte) {
		this.qte = qte;
	}
	public Produit getProduit() {
		return produit;
	}
	public void setProduit(Produit produit) {
		this.produit = produit;
	}
	public double getPrixVenteReel() {
		return prixVenteReel;
	}
	public void setPrixVenteReel(double prixVenteReel) {
		this.prixVenteReel = prixVenteReel;
	}
	
	
}

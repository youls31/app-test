package ma.emi.ginf.domain;

public class Produit {
  private int code;
  private String libelle;
  private double prixHt;
  private int stock;
public Produit(int code, String libelle, double prixHt, int stock) {
	super();
	this.code = code;
	this.libelle = libelle;
	this.prixHt = prixHt;
	this.stock = stock;
}
public int getCode() {
	return code;
}
public void setCode(int code) {
	this.code = code;
}
public String getLibelle() {
	return libelle;
}
public void setLibelle(String libelle) {
	this.libelle = libelle;
}
public double getPrixHt() {
	return prixHt;
}
public void setPrixHt(double prixHt) {
	this.prixHt = prixHt;
}
public int getStock() {
	return stock;
}
public void setStock(int stock) {
	this.stock = stock;
}
  
  
}

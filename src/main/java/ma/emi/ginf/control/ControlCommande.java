package ma.emi.ginf.control;

import java.util.ArrayList;
import java.util.List;

import ma.emi.ginf.domain.Catalogue;
import ma.emi.ginf.domain.Produit;

public class ControlCommande {
    private Catalogue catalogue;
	
	 public ControlCommande(Catalogue c) {
		 this.catalogue =c;
	 }
	 
	 List<Produit> getAllProducts(){
		 List<Produit> result = new ArrayList<Produit>();
		   for(Produit p : this.catalogue.afficherListProduit())
			   	result.add(p);
		 
		 return  result;
	 }
}

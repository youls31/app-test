package ma.emi.ginf.domain;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Catalogue {
	
	private Map<Integer, Produit> mesProduits= new HashMap<Integer,Produit>();
	
	public Collection<Produit> afficherListProduit() {
		
		return this.mesProduits.values();
	}

}

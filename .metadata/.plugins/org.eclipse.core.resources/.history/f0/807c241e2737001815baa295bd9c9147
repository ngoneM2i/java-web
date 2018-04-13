package hello;

public class Commande {
		
	//private Article[] panier = new Article[5];
	private Article[] panier;
	
	//Constructeurs
	public Commande(int nbMaxArticlesdansPanier) {
		this.panier = panier[nbMaxArticlesdansPanier];
	}
	
	public Article[] getPanier() {
		return panier;
	}

	public void setPanier(Article[] panier) {
		this.panier = panier;
	}

	public void add(Article article) {
		for (int i = 0; i < panier.length; i++) {
			if(panier[i] == null) {
				panier[i] = article;
				break; // permet de sortir da la boucle ou return qui permet de sortir de la methode
				//return;
			}
		}
				
	}

	public double computeTotal() {
		double total = 0;
		for (int i = 0; i < panier.length; i++) {
		if(panier[i] != null)
			total += panier[i].getPrix();	
		}
		return total;
	} 

}

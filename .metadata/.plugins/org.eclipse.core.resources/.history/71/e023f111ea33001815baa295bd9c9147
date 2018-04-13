package hello;

public class ArticleCommandeMain {

	public static void main(String[] args) {
				
		Commande commande = new Commande();
		
		Article a1 = new Article();
		a1.titre = "livre" ;
		a1.prix = 40;
		
		Article a2 = new Article();
		a2.titre = "cd" ;
		a2.prix = 10;
				
		Article a3 = new Article();
		a3.titre = "sac";
		a3.prix = 100;
		
		commande.ajouter(a1);
		System.out.println(commande.panier[0].titre + " " + commande.panier[0].prix);
		
		commande.ajouter(a2);
		System.out.println(commande.panier[1].titre + " " + commande.panier[1].prix);
		
		commande.ajouter(a3);
		System.out.println(commande.panier[2].titre + " " + commande.panier[2].prix);		

		System.out.println(commande.demanderMontantTotal());
	}

}

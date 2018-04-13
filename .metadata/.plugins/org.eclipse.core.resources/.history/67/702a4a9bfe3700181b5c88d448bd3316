package hello;

public class Ecommerce {

	public static void main(String[] args) {
				
		Commande commande = new Commande();
		
		Article article1 = new Article("livre", 40);
		//article1.setTitre("livre");
		//article1.setPrix(40);
		
		Article article2 = new Article("cd", 10);
		//article2.setTitre("cd");
		//article2.setPrix(10);
				
		Article article3 = new Article("sac", 100);
		//article3.setTitre("sac");
		//article3.setPrix(100);
		
		commande.add(article1);
		commande.add(article1);
		commande.add(article2);
		commande.add(article2);
		commande.add(article3);
		
		System.out.println(commande.getPanier()[0].getPrix());
		System.out.println(commande.getPanier()[1].getPrix());
		System.out.println(commande.getPanier()[2].getPrix());
		System.out.println(commande.getPanier()[3].getPrix());
		System.out.println(commande.getPanier()[4].getPrix());
				
		System.out.println(commande.getPanier()[0].getTitre());
		
		double total = commande.computeTotal();

		System.out.println("Le total commandé est: "+ total);
	}

}


class Attractie {
	String naam;
	double prijs;
	int oppervlakte;
	double omzet;
	double omzetDirectNaBelasting;
	int aantalVerkochteKaartjes;
	
	public Attractie(String naam, double prijs, int oppervlakte) {
		this.naam = naam;
		this.prijs = prijs;
		this.oppervlakte = oppervlakte;
	}
	
	double draaien(Kermis kermis) {
		if(this instanceof RisicoRijkeAttractie)
		{
			if(((RisicoRijkeAttractie) this).controleerDraaiLimiet()) {
				try {
					kermis.attractieAanDraaiLimiet = (RisicoRijkeAttractie) this;
					throw new DraaiLimietBereiktException();
				}
				catch (DraaiLimietBereiktException e) {
					System.out.println("Het draailimiet van de attractie is bereikt.");
					System.out.println("Om een monteur te roepen kies 'm', vervolgens zal de attractie worden gekeurd en gereset.");
				}
			}
			else{
				((RisicoRijkeAttractie) this).draai();
			}
		}
		System.out.println("De attractie '" + this.toString() + "' draait");
		omzet += prijs;
		aantalVerkochteKaartjes++;
		return prijs;
	}
}

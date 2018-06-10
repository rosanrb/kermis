import java.util.Random;

class Kermis {
	Attractie[] attracties = {new Botsauto("botsauto", 2.50, 0), new Spin("spin", 2.25, 0), new Spiegelpaleis("spiegelpaleis", 2.75, 0), new Spookhuis("spookhuis", 3.20, 0), new Hawaii("hawaii", 2.90, 0), new Ladderklimmen("ladderklimmen", 5.00, 0)};
	Kassa kassa = new Kassa();
	int Ibezoek = ietsRandom();
	int kaartjesVbezoek = 0;
	BelastingInspecteur binspecteur = new BelastingInspecteur();
	RisicoRijkeAttractie attractieAanDraaiLimiet;
	
	void draaiAttractie(String nattractie) {
		if(kaartjesVbezoek == Ibezoek)
		{
			betaalBelasting();
			Ibezoek = ietsRandom();
			kaartjesVbezoek = 0;
		}
		int nummer = Integer.parseInt(nattractie);
		nummer--;
		Attractie gekozenAttractie = attracties[nummer];
		double omzetRitje = gekozenAttractie.draaien(this);
		updateKassaTotaal(omzetRitje);
		kaartjesVbezoek++;
	}
	
	void updateKassaTotaal(double ticketprijs)
	{
		kassa.omzetGeheleKermis += ticketprijs;
		kassa.verkochteKaartjes++;
	}
	
	void getOmzet()
	{
		System.out.println("De totaal omzet is: " + kassa.omzetGeheleKermis);
	}
	
	void getAantalKaartjes()
	{
		System.out.println("Het totaal aantal verkochte kaartjes: " + kassa.verkochteKaartjes);
	}
	
	void betaalBelasting()
	{
		for(Attractie a: attracties)
		{
			if(a instanceof GokAttractie)
			{
				double belasting = ((GokAttractie) a).KansSpelBelastingBetalen(); 
				binspecteur.inBelasting(belasting);
				kassa.omzetGeheleKermis -= belasting;
				a.omzetDirectNaBelasting = a.omzet;
			}
		}
	}
	
	static int ietsRandom() {
		Random random = new Random();
		int uitkomst = random.nextInt(15) + 1;
		return uitkomst;
	}
}

class DraaiLimietBereiktException extends Exception{
	
}




abstract class GokAttractie extends Attractie{

	public GokAttractie(String naam, double prijs, int oppervlakte) {
		super(naam, prijs, oppervlakte);
	}

	public double KansSpelBelastingBetalen() {
		double belastingBedrag = (((super.omzet - super.omzetDirectNaBelasting) * 30) / 100); 
		super.omzet -= belastingBedrag;
		return belastingBedrag;
	}
}

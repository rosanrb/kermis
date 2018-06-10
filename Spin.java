
class Spin extends Attractie implements RisicoRijkeAttractie{
	int draaiLimiet = 5;
	int gedraaidNaControle = 0;
	public Spin(String naam, double prijs, int oppervlakte) {
		super(naam, prijs, oppervlakte);
	}

	@Override
	public boolean opstellingsKeuring() {
		return false;
	}
	
	@Override
	public boolean controleerDraaiLimiet() {
		return (draaiLimiet == gedraaidNaControle);
	}
	
	@Override
	public void stuurMonteur() {
		gedraaidNaControle = 0;
	}
	
	@Override
	public void draai(){
		gedraaidNaControle++;
	}
}


class Hawaii extends Attractie implements RisicoRijkeAttractie{
	int draaiLimiet = 10;
	int gedraaidNaControle = 0;
	
	public Hawaii(String naam, double prijs, int oppervlakte) {
		super(naam, prijs, oppervlakte);
	}
	
	@Override
	public boolean opstellingsKeuring() {
		return false;
	}

	@Override
	public boolean controleerDraaiLimiet() {
		if(draaiLimiet != gedraaidNaControle)
		{
			gedraaidNaControle++;
		}
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

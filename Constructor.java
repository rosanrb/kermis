import java.util.Random;
import java.util.Scanner;

public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kermis kermis = new Kermis();
		System.out.println("Welkom bij mijn kermisspel");
		boolean doorspelen = true;
		while(doorspelen) {
			String input = toonMenu();
			switch(input) {
				case "1":
					kermis.draaiAttractie(input);
					break;
				case "2":
					kermis.draaiAttractie(input);
					break;
				case "3":
					kermis.draaiAttractie(input);
					break;
				case "4":
					kermis.draaiAttractie(input);
					break;
				case "5":
					kermis.draaiAttractie(input);
					break;
				case "6":
					kermis.draaiAttractie(input);
					break;
				case "o":
					kermis.getOmzet();
					break;
				case "k":
					kermis.getAantalKaartjes();
					break;
				case "m":
					kermis.attractieAanDraaiLimiet.stuurMonteur();
					break;
				case "q":
					doorspelen = false;
			}
			
		}
		System.out.println("Bedankt voor het spelen");
	}
	static String toonMenu() {
		System.out.println("Kies een attractie:");
		System.out.println("1 voor botsauto's");
		System.out.println("2 voor spin");
		System.out.println("3 voor spiegelpaleis");
		System.out.println("4 voor spookhuis");
		System.out.println("5 voor hawaii");
		System.out.println("6 voor ladderklimmen");
		Scanner scanner = new Scanner(System.in);
		return scanner.next();
	}
}

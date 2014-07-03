import java.util.Scanner;

public class HogerLagerSpel {

	public static void main(String[] args) {
		System.out.println("Welkom bij het spel Hoger / Lager");
		System.out.println("De bedoeling is om een getal tussen de 0 en de 50 te raden.");

		int getal = (int) (Math.random() * 51);
		boolean geraden = false;
		int aantalgokken = 0;

		while (geraden == false) {
			System.out.print("Doe een gok: ");
			Scanner in = new Scanner(System.in);
			int gok = in.nextInt();
			aantalgokken++;
			
			if(gok == getal) {
                System.out.print("Je hebt het in " + aantalgokken + " beurten geraden");
                System.out.println("Ga nu maar koffie drinken");
                geraden = true;
			}
			else if (gok > getal) {
			    System.out.println("Lager!");
			}
			else if (gok < getal) {
                System.out.println("Hoger!");

			}
		}
	}
}

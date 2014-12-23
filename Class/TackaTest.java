import java.util.Scanner;

public class TackaTest {
	public static void main(String[] args) {
		int x, y;
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		Scanner input = new Scanner(System.in);
		y = in.nextInt();
		Tacka tackica = new Tacka();
		Tacka tacka1 = new Tacka(x, y);
		System.out.println(tacka1.toSting());
		System.out.println(tackica.toSting());
		System.out.println("Razmak izmedju dvije tacke je: "
				+ tacka1.udaljenost(tackica));
		Krug krug = new Krug(tackica, y);
		System.out.println("Unesite koordinatu tacke:");
		Scanner inputScanner = new Scanner(System.in);
		x = inputScanner.nextInt();
		Scanner inScanner = new Scanner(System.in);
		y = in.nextInt();
		Tacka tacka2 = new Tacka(x, y);
		if (krug.isInside(tacka2) == 1)
			System.out.println("Tacka je u krugu");
		if (krug.isInside(tacka2) == -1)
			System.out.println("Tacka je van kruga");
		else
			System.out.println("Tacka je na kruznici");

	}
}

import java.util.Scanner;

public class Krug {
	private Tacka centar;
	private double radius;

	public Krug(Tacka d, double radius) {
		this.centar = new Tacka();
		this.radius = radius;
	}

	public String toString() {
		String out = "";
		out = "Centar:" + centar + "radius" + radius;
		return out;
	}

	public int isInside(Tacka other) {
		if (centar.udaljenost(other) < radius)
			return 1;
		else if (centar.udaljenost(other) > radius)
			return -1;
		else
			return 0;
	}

	public boolean daLiSeSjeku(Krug other) {
		if ((this.radius + other.radius) > (this.centar
				.udaljenost(other.centar)))
			return false;

		return true;
	}
}







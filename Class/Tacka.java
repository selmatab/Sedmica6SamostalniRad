
public class Tacka {

	private int x;
	private int y;

	public Tacka() {
		this.x = 0;
		this.y = 0;
	}

	public Tacka(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Tacka(Tacka other) {
		this.x = other.x;
		this.y = other.y;
	}

	public String toSting() {
		String unos = "";
		unos = "Koordinate:\n" + "X:" + x + "\nY:" + y + "\n" + "x,y: (" + x
				+ "," + y + ")";
		return unos;

	}

	public float udaljenost(Tacka other) {
		double rastojanje = Math.sqrt(Math.pow(other.x - this.x, 2)
				+ Math.pow(other.y - this.y, 2));
		return (float) rastojanje;

	}

	public boolean equals(Tacka other) {
		if (this.x == other.x && this.y == other.y) {
			return true;
		}
		return false;
	}
	// public boolean equals(Object obj) {
	// if (this == obj)
	// return true;
	// if (obj == null)
	// return false;
	// if (getClass() != obj.getClass())
	// return false;
	// Tacka other = (Tacka) obj;
	// if (x != other.x)
	// return false;
	// if (y != other.y)
	// return false;
	// return true;
}






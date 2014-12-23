
public class Zivotinja {

	private String ime;
	private int brNogu;
	private String vrsta;

	public String getIme() {
		return ime;
	}

	public Zivotinja(String ime, int brNogu, String vrsta) {
		this.ime = ime;
		this.brNogu = brNogu;
		this.vrsta = vrsta;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public int getBrNogu() {
		return brNogu;
	}

	public void setBrNogu(int brNogu) {
		this.brNogu = brNogu;
	}

	public String getVrsta() {
		return vrsta;
	}

	public void setVrsta(String vrsta) {
		this.vrsta = vrsta;
	}

	public boolean equals(Zivotinja other) {

		if (this.brNogu != other.brNogu)
			return false;
		if (this.ime == null) {
			if (other.ime != null)
				return false;
		} else if (!this.ime.equals(other.ime))
			return false;
		if (this.vrsta == null) {
			if (other.vrsta != null)
				return false;
		} else if (!this.vrsta.equals(other.vrsta))
			return false;
		return true;
	}

	public String toString() {
		return "Zivotinja [ime=" + ime + ", brNogu=" + brNogu + ", vrsta="
				+ vrsta + "]";
	}

}
	
	


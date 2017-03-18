
public class Igracka {
	private String naziv;
	private int tezina;
	
	public Igracka(String naziv,int tezina){
		this.naziv = naziv;
		this.tezina = tezina;
	}
	
	public String getNaziv() {
		return naziv;
	}
	public int getTezina() {
		return tezina;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public void setTezina(int tezina) {
		this.tezina = tezina;
	}
	@Override
	public String toString() {
		return "Igracka [name=" + naziv + ", tezina=" + tezina + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Igracka other = (Igracka) obj;
		if (naziv == null) {
			if (other.naziv != null)
				return false;
		} else if (!naziv.equals(other.naziv))
			return false;
		if (tezina != other.tezina)
			return false;
		return true;
	}
	
}

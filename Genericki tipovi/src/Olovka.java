
public class Olovka {
	private String marka;
	private int duzina;
	public Olovka(String marka,int duzina){
		this.marka = marka;
		this.duzina = duzina;
	}
	public String getMarka(){
		return marka;
	}
	public int getDuzina(){
		return duzina;
	}
	public void setMarka(String marka){
		this.marka = marka;
	}
	public void setDuzina(int duzina){
		this.duzina = duzina;
	}
	public String toString(){
		return "Marka: " +marka+ " duzina: " + duzina;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Olovka other = (Olovka) obj;
		if (duzina != other.duzina)
			return false;
		if (marka == null) {
			if (other.marka != null)
				return false;
		} else if (!marka.equals(other.marka))
			return false;
		return true;
	}
	
	
}

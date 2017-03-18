
public class Auto extends Igracka {
	private String marka;
	private String boja;
	
	public Auto(String naziv, int tezina,String marka,String boja) {
		super(naziv, tezina);
		this.marka = marka;
		this.boja = boja;
	}
	
	public String getMarka() {
		return marka;
	}
	public String getBoja() {
		return boja;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	public void setBoja(String boja) {
		this.boja = boja;
	}
	@Override
	public String toString(){
		return super.toString() + " marka: "+marka+" boja: "+boja;
	}
	public boolean equals(Object obj){
		return super.equals(obj);
	}
	
}

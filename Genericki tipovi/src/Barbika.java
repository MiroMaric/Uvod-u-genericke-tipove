
public class Barbika extends Igracka {
	
	private String ime;
	private int godiste;
	
	public Barbika(String naziv, int tezina,String ime,int godiste) {
		super(naziv, tezina);
		this.ime = ime;
		this.godiste = godiste;
	}
	
	/*public Barbika(String naziv,int tezina,String ime,int godiste){
		super(naziv,tezina);
		this.ime = ime;
		this.godiste = godiste;
	}*/
	
	public String getIme(){
		return ime;
	}
	public int getGodiste(){
		return godiste;
	}
	public void setIme(String ime){
		this.ime = ime;
	}
	public void setGodiste(int godiste){
		this.godiste = godiste;
	}
	
}

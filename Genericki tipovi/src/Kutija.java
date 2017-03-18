import java.util.LinkedList;

public class Kutija <E>{
	private LinkedList<E> kutija = new LinkedList<>();
	public LinkedList<E> getKutija(){
		return kutija;
	}
	public void setKutija(LinkedList<E> kutija){
		this.kutija = kutija;
	}
	
}

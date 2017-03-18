
public class Test {

	public static void main(String[] args) {
		
		Kutija<Igracka> k = new Kutija<>();
		Auto a1 = new Auto("Autic", 300, "Audi", "Crna");
		Auto a2 = new Auto("Mikov autic", 1000, "tenk", "zelena");
		Barbika b1 = new Barbika("Anina barbika", 100, "Sofija", 2000);
		Barbika b2 = new Barbika("Barbika", 200, "Ina", 2005);
		k.getKutija().add(a1);
		k.getKutija().add(a2);
		k.getKutija().add(b1);
		k.getKutija().add(b2);
		Kutija<Olovka> ko = new Kutija<>();
		Olovka o = new Olovka("Adel", 10);
		ko.getKutija().add(o);
		obradaPodataka(k);
		obradaPodataka(ko);
		prebrojKutiju(k);
		//prebrojKutiju(ko); ne radi!!!
	}
	public static void obradaPodataka(Kutija<?> kutija){
		int n = kutija.getKutija().size();
		for(int i=0;i<n;i++){
			System.out.println(kutija.getKutija().get(i));
		}
	}
	public static void prebrojKutiju(Kutija<? extends Igracka> kutija){
		System.out.println("U kutiji ima: "+kutija.getKutija().size()+" elemenara");
	}
	public <T> T[] napraviNiz(T[] n){
		for(int i=0;i<n.length;i++){
			//Obrada
		}
		return n;
	}

}

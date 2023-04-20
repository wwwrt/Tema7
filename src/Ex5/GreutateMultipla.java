package Ex5;

import java.util.ArrayList;

public class GreutateMultipla extends Greutate {

	
	private ArrayList <Greutate> greutati;
	
	
	
	public GreutateMultipla(double capacitate, ArrayList<Greutate> greutati) {
		
		this.greutati = greutati;
	}

	public void insertGreutate(Greutate g) {
		greutati.add(g);
		
	}
	
	public void removeGreutate(Greutate g) {
		greutati.remove(g);
		
	}
	

	public int capacitate() {
		int capacitate = 0;
		for (Greutate g : greutati)
			capacitate += g.capacitate();
	return capacitate;	
	}

	
	public String toString() {
		return "GreutateMultipla[" + capacitate() + "]";
		
	}



}

package Ex5;


import java.util.ArrayList;

public class ColectieGreutati {

	private int limita;
	private ArrayList<Greutate> colectie;
	
	public ColectieGreutati (int limita) {
		
		if (limita <=0)
			limita = 1;
		this.limita = limita;
		colectie = new ArrayList<Greutate>();
		
	}
	
	
	public boolean adaugaGreutate(Greutate g) {
		if (colectie.size() == limita ) {
			System.out.println("S-a atins limita de greutati suportate!");
			return false;
		}
		
		return colectie.add(g);
		
	}
	
	public double medie() {
		double media = capacitateTotala() / colectie.size();
		return media;	
	}
	
	public double capacitateTotala() {
		int capacitate = 0;
		for (Greutate g : colectie)
			capacitate += g.capacitate();
		return capacitate;
	}
}

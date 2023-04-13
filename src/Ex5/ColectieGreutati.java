package Ex5;

public class ColectieGreutati {
    private Greutate[] colectie;
    private int numarGreutati;
    private int capacitateMaxima;

    public ColectieGreutati(int capacitateMaxima) {
        this.colectie = new Greutate[capacitateMaxima];
        this.numarGreutati = 0;
        this.capacitateMaxima = capacitateMaxima;
    }

    public void adaugaGreutate(Greutate g) {
        if (numarGreutati < capacitateMaxima) {
            colectie[numarGreutati] = g;
            numarGreutati++;
        }
    }

    public double getCapacitateTotala() {
        double capacitateTotala = 0;
        for (int i = 0; i < numarGreutati; i++) {
            capacitateTotala += colectie[i].capacitate();
        }
        return capacitateTotala;
    }
}

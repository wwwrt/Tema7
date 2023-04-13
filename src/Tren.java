public class Tren {
    private Vagon[] vagoane = new Vagon[15];
    private int nrVagoane = 0;
    public void addVagon(Vagon v) {
        if (nrVagoane == 15) {
            System.out.println("Nu se mai pot adauga vagoane! Trenul este plin.");
            return;
        }

        vagoane[nrVagoane] = v;
        nrVagoane++;
    }

    public int getNrVagoane() {
        return nrVagoane;
    }

    public int getCapacitateTotala() {
        int capacitate = 0;
        for (int i = 0; i < nrVagoane; i++) {
            capacitate += vagoane[i].getCapacitateColete();
        }
        return capacitate;
    }

    public boolean equals(Tren t) {
        return this.getCapacitateTotala() == t.getCapacitateTotala();
    }

    public void afisareTipuriVagoane() {
        System.out.println("Tipurile de vagoane din tren sunt:");
        for (int i = 0; i < nrVagoane; i++) {
            System.out.println((i + 1) + ". " + vagoane[i].getTip());
        }
    }
}
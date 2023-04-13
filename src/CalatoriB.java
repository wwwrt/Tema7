public class CalatoriB extends Vagon {
    private int capacitatePasageri;
    private int nrUsi = 2;
    private boolean geamuriBlocate;

    public CalatoriB(int capacitatePasageri, int capacitateColete) {
        super(capacitateColete);
        this.capacitatePasageri = capacitatePasageri;
        this.geamuriBlocate = false;
    }

    public int getCapacitatePasageri() {
        return capacitatePasageri;
    }

    public int getNrUsi() {
        return nrUsi;
    }

    public boolean geamuriBlocate() {
        return geamuriBlocate;
    }

    public void blocheazaGeamuri() {
        this.geamuriBlocate = true;
        System.out.println("Geamurile s-au blocat");
    }

    @Override
    public String getTip() {
        return "CalatoriB";
    }

    @Override
    public void deschideUsi() {
        System.out.println("Ușile s-au deschis automat");
    }

    @Override
    public void inchideUsi() {
        System.out.println("Ușile s-au închis automat");
    }
}

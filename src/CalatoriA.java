public class CalatoriA extends Vagon {
    private int capacitatePasageri;
    private int nrUsi = 2;

    public CalatoriA(int capacitatePasageri, int capacitateColete) {
        super(capacitateColete);
        this.capacitatePasageri = capacitatePasageri;
    }

    public int getCapacitatePasageri() {
        return capacitatePasageri;
    }

    public int getNrUsi() {
        return nrUsi;
    }

    @Override
    public String getTip() {
        return "CalatoriA";
    }

    @Override
    public void deschideUsi() {
        System.out.println("Usile s-au deschis automat");
    }

    @Override
    public void inchideUsi() {
        System.out.println("Usile s-au inchis automat");
    }
}

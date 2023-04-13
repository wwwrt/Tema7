public class Marfa extends Vagon {
    private int nrUsi = 1;

    public Marfa(int capacitateColete) {
        super(capacitateColete);
    }

    public int getNrUsi() {
        return nrUsi;
    }

    public String getTip() {
        return "Marfa";
    }

    public void deschideUsi() {
        System.out.println("Ușile se deschid manual");
    }

    public void inchideUsi() {
        System.out.println("Ușile se închid manual");
    }
}

public abstract class Vagon {
    protected int capacitateColete;

    public Vagon(int capacitateColete) {
        this.capacitateColete = capacitateColete;
    }

    public int getCapacitateColete() {
        return capacitateColete;
    }

    public abstract String getTip();
    public abstract void deschideUsi();
    public abstract void inchideUsi();
}

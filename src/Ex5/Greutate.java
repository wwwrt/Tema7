package Ex5;

public abstract class Greutate {
private double capacitate;

public Greutate(double capacitate) {
this.capacitate = capacitate;
}

public double getCapacitate() {
return capacitate;
}

public abstract double capacitate();
}


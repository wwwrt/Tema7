package Ex5;

public class GreutateMultipla extends Greutate {
private Greutate[] componente;

public GreutateMultipla(Greutate[] componente) {
super(calculeazaCapacitate(componente));
this.componente = componente;
}

private static double calculeazaCapacitate(Greutate[] componente) {
double capacitate = 0;
for (Greutate greutate : componente) {
capacitate += greutate.capacitate();
}
return capacitate;
}

public Greutate[] getComponente() {
return componente;
}

public double capacitate() {
return calculeazaCapacitate(componente);
}
}
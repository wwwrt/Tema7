package Ex5;

public class GreutateDubla extends Greutate {
private Greutate greutate1;
private Greutate greutate2;

public GreutateDubla(Greutate greutate1, Greutate greutate2) {
super(greutate1.getCapacitate() + greutate2.getCapacitate());
this.greutate1 = greutate1;
this.greutate2 = greutate2;
}

public void setGreutate1(Greutate greutate1) {
this.greutate1 = greutate1;
}

public void setGreutate2(Greutate greutate2) {
this.greutate2 = greutate2;
}

public Greutate getGreutate1() {
return greutate1;
}

public Greutate getGreutate2() {
return greutate2;
}

public double capacitate() {
return greutate1.capacitate() + greutate2.capacitate();
}
}
package Exercice1;

public class Cercle {

    private double rayon;

    public Cercle() {
        super();
        rayon = 0;
    }

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    public double airCercle(){
        return Math.PI * Math.pow(rayon, 2);
    }

    public double perimetreCercle(){
        return Math.PI * 2 * rayon;
    }
}

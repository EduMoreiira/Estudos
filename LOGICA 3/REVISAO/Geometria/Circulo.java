package REVISAO.Geometria;

public class Circulo extends Figura {
    private double raio;

    public Circulo(double raio, String cor) {
        this.raio = raio;
        super.setCor(cor);
    }

    double area() {
        return Math.PI * (raio * raio);
    }

    public double getRaio() {
        return raio;
    }

    public double getDiametro() {
        return raio * 2;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}

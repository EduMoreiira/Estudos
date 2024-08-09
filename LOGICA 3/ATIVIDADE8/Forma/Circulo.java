package ATIVIDADE8.Forma;

public class Circulo extends Forma {
    double raio;
    @Override
    void calcularArea() {
        System.out.println("Area do circulo: " + (Math.PI * (this.raio * this.raio)));
    }
}

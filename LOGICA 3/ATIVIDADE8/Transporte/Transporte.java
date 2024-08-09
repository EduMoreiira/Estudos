package ATIVIDADE8.Transporte;

public class Transporte {
    double velocidade;
    void calcularTempo(double distancia) {
        System.out.println("O tempo gasto foi de: " + (distancia / this.velocidade));
    }
}

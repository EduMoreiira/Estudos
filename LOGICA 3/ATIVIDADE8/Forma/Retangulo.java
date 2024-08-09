package ATIVIDADE8.Forma;

public class Retangulo extends Forma{
    double largura, altura;

    @Override
    void calcularArea() {
        System.out.println("Area do retangulo: " + this.largura * this.altura);
    }
}

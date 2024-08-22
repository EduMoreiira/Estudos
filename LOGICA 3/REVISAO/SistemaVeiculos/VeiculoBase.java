package REVISAO.SistemaVeiculos;

abstract public class VeiculoBase {
    private String modelo;
    private String cor;
    private int velocidadeMaxima;
    private int velocidadeAtual;



    public abstract void acelerar(int incremento);
    public abstract void desacelerar(int decremento);


    //GS
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    @Override
    public String toString() {
        return "VeiculoBase{" +
                "modelo='" + modelo + '\'' +
                ", cor='" + cor + '\'' +
                ", velocidadeMaxima=" + velocidadeMaxima +
                ", velocidadeAtual=" + velocidadeAtual +
                '}';
    }
}

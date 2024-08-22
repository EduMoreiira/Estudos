package REVISAO.Geometria;

public abstract class Figura {
    private String cor = "verde";

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Figura{" +
                "cor='" + cor + '\'' +
                '}';
    }
}

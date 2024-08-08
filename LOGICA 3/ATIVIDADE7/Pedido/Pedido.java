package ATIVIDADE7.Pedido;

public class Pedido {
    private int quantidade;
    private double precoUnitario;

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if(quantidade > 0) {
            this.quantidade = quantidade;
        }
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public double calcularValorTotal(){
        return quantidade * precoUnitario;
    }
}

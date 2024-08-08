package POLIMORFISMO.Pagamento.CartaoDeCredito;

import POLIMORFISMO.Pagamento.Pagamento;

public class PagamentoCartaoCredito extends Pagamento {

    private String numeroCartao;
    private double valor;


    public PagamentoCartaoCredito(String numeroCartao, double valor) {
        this.numeroCartao = numeroCartao;
        this.valor = valor;
    }

    @Override
    public void iniciar(){
        super.iniciar();
        System.out.println("CartaoCredito");
    }

    @Override
    public void finalizar() {
        super.finalizar();
        System.out.println("CartaoCredito");
    }
}

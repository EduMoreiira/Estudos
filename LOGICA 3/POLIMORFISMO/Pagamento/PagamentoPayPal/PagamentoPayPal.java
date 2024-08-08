package POLIMORFISMO.Pagamento.PagamentoPayPal;

import POLIMORFISMO.Pagamento.Pagamento;

public class PagamentoPayPal extends Pagamento {
    private String email;
    private double valor;

    public PagamentoPayPal(String email, double valor) {
        this.email = email;
        this.valor = valor;
    }

    @Override
    public void iniciar() {
        super.iniciar();
        System.out.println("PayPal");
    }

    @Override
    public void finalizar() {
        super.finalizar();
        System.out.println("PayPal");

    }


}

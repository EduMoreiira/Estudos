package POLIMORFISMO.Pagamento;

import POLIMORFISMO.Pagamento.CartaoDeCredito.PagamentoCartaoCredito;
import POLIMORFISMO.Pagamento.PagamentoPayPal.PagamentoPayPal;

public class main {
    public static void main(String[] args) {
        PagamentoCartaoCredito cliente1 = new PagamentoCartaoCredito("123456783218765", 100);
        PagamentoPayPal cliente2 = new PagamentoPayPal("maria@ifb.edu.br", 1000);

        cliente1.iniciar();
        cliente1.finalizar();

        cliente2.iniciar();
        cliente2.finalizar();

    }
}

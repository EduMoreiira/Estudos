package POLIMORFISMO.Pagamento.TransferenciaBancaria;

import POLIMORFISMO.Pagamento.Pagamento;

public class TransferenciaBancaria extends Pagamento {
    //    banco, conta, valor
    private String banco;
    private double valor;
    private String conta;


    public TransferenciaBancaria(String banco, double valor, String conta) {
        this.banco = banco;
        this.valor = valor;
        this.conta = conta;
    }

    @Override
    public void iniciar() {
        System.out.println("TransferenciaBancaria");

    }

    @Override
    public void finalizar() {
        System.out.println("TransferenciaBancaria");

    }
}

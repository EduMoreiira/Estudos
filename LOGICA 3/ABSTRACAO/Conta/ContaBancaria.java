package ABSTRACAO.Conta;

public abstract class ContaBancaria implements Conta {
    String numeroConta;
    float saldo;

    public float consultarSaldo() {
        return saldo;
    }


    abstract public void sacar(float valor);


    abstract public void depositar(float valor);
}

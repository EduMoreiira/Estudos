package ABSTRACAO.Conta;

public class ContaCorrente extends ContaBancaria{
    float limite;

    public float verificarLimite() {
        return limite;
    }

    @Override
    public void sacar(float valor) {

    }

    @Override
    public void depositar(float valor) {

    }
}

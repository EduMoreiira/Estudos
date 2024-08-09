package ATIVIDADE8.Conta;

public class ContaPoupanca extends Conta{
    @Override
    public void atualizarSaldo() {
        double saldo = super.getSaldo();
        super.setSaldo(saldo - (saldo * 0.05));
    }
}

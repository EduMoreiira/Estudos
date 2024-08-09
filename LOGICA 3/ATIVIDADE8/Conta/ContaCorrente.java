package ATIVIDADE8.Conta;

public class ContaCorrente extends Conta{
    @Override
    public void atualizarSaldo(){
        super.setSaldo(super.getSaldo() - 10);
        System.out.println("O saldo atual da conta corrente é de: " + super.getSaldo());
    }
}

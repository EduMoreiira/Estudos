package ATIVIDADE8.Conta;

public class Conta {
    private double saldo;

    public void atualizarSaldo() {
        System.out.println("Saldo atualizado: " + this.saldo);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}

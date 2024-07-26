package HERANCA.conta;

public class Conta {
    String numero;
    double saldo;

    void depositar(double valor){
        this.saldo += valor;
    }

    void sacar(double valor){
        if(valor > saldo) {
            System.out.println("Saldo insuficiente");
        }else{
        this.saldo -= valor;
        }
    }

    double getSaldo(){
        return this.saldo;
    }

    String getNumero(){
        return this.numero;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numero='" + numero + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}

package HERANCA.conta;

public class ContaCorrente extends Conta{
    double limite;

    @Override
    void sacar(double valor){
        if(valor > super.getSaldo() + limite) {
            System.out.println("Saldo e limite insuficientes");

        }else if(valor < super.getSaldo()){
            super.saldo -= valor;
        }
    }

    double getLimite(){
        return this.limite;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nContaCorrente{" +
                "limite=" + limite +
                '}';
    }
}

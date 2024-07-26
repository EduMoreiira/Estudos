package HERANCA.conta;

public class ContaPoupanca {
    double taxaJuros;
    void aplicarJuros(double valor){
        this.taxaJuros = valor;
    }
    double getTaxaJuros(){
        return taxaJuros;
    }

    @Override
    public String toString() {
        return super.toString() +
                "ContaPoupanca{" +
                "taxaJuros=" + taxaJuros +
                '}';
    }
}

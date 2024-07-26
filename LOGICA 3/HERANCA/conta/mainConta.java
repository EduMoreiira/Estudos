package HERANCA.conta;

public class mainConta {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();

        System.out.println("Seu saldo é de: " + contaCorrente.getSaldo());

        contaCorrente.depositar(1200);

        System.out.println("Seu saldo é de: " + contaCorrente.getSaldo());

        contaCorrente.sacar(1000);

        System.out.println("Seu saldo é de: " + contaCorrente.getSaldo());

        contaCorrente.numero = "2231a";

        contaCorrente.limite = 250;

        System.out.println(contaCorrente.toString());
    }
}

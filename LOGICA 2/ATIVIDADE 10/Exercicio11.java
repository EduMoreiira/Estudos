class Conta{
    int numero;
    String cliente;
    double saldo;
    double limite;
}

public class Exercicio11{
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        conta1.cliente = "Gustavo";
        conta1.saldo = 1500;
        conta1.limite = 7899;
        System.out.println(conta1.cliente);
        System.out.println(conta1.saldo);
        System.out.println(conta1.limite);
        System.out.println(conta1.numero);

        Conta conta2 = new Conta();
        conta2.cliente = "Maria";
        conta2.saldo = 11100;
        conta2.limite = 799;
        System.out.println(conta2.cliente);
        System.out.println(conta2.saldo);
        System.out.println(conta2.limite);
        System.out.println(conta2.numero);
    }
}

// 11 - 
// 1 - Criar uma classe Conta;
//     a) declarar os seguintes atributos nessa classe: numero, cliente, saldo e limite. 

// 2 - Criar uma classe TestarConta;
//    a) criar o método principal;
//    b) instanciar 2 objetos do tipo Conta;
//    c) modificar os valores dos atributos de cada objeto;
//    d) mostrar os valores dos atributos de cada objeto;
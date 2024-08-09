package ATIVIDADE8.Funcionario;

public class Funcionario {
    String nome;
    double salario;

    void calcularBonus(){
        System.out.println("O valor do bonus é de: " + this.salario * 0.1);
    }
}

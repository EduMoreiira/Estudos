package ATIVIDADE8.Funcionario;

public class Desenvolvedor extends Funcionario {
    @Override
    void calcularBonus() {
        System.out.println("O valor do bonus é de: " + super.salario * 0.15);
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<String> students = new ArrayList<String>();

        for(int i = 0; i < 5; i++){
            System.out.println("Insira o nome do aluno " + (i + 1));
            students.add(input.nextLine());
        }

        System.out.println("Os nomes dos alunos cadastrados sao: ");
        students.forEach((name) -> {
            System.out.print(name + ", ");
        });
    }
}
// Questão 3 - Usando vetores, faça um programa que peça o nome de 5 alunos
//  de uma turma armazenando-os em um vetor de String. Ao final os nomes devem ser mostrado ao usuário.
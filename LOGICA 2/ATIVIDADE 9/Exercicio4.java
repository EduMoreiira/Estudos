import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for(int i = 0; i < 3; i++){
            System.out.println("Insira o numero inteiro da posicao " + i);
            numbers.add(input.nextInt());
        }

        Collections.reverse(numbers);
        System.out.println("Lista de numeros invertida:");
        numbers.forEach((n) -> {
            System.out.print(n + " ");
        });
    }
}
//  Questão 4 - Criar uma programa que receba um vetor de números inteiros de 10 posições.
//  O programa deve inverter a ordem dos elementos do vetor de modo que o 1º vire o último e
//   o 2º vire o penúltimo e assim sucessivamente.
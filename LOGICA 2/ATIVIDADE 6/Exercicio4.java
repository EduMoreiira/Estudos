import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o primeiro numero:");
        int num1 = input.nextInt();
        System.out.println("Insira o segundo numero:");
        int num2 = input.nextInt();

        System.out.println("O menor numero é: " + Math.min(num1, num2) );
    }
}

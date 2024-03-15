import java.util.Scanner;
public class Exercicio7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o lado do quadrado:");
        double lado = input.nextDouble();

        System.out.println("A área do quadrado é igual a: " + Math.pow(lado, 2));
    }
}

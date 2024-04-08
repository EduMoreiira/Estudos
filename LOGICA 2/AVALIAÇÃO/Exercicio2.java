import java.util.Scanner;

public class Exercicio2 {
    static double celsiusToFahrenheit(double c){
        double fahrenheit = ((c * 9) / 5) + 32;

        return fahrenheit;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira uma temperatura em graus celsius:");
        double c = input.nextDouble();
        System.out.println("A temperatura " + c + " em fahrenheit é igual a: " + celsiusToFahrenheit(c));
    }
}
// Questão 2: Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit.
// A fórmula de conversão é: F = (C * 9 / 5) + 32
import java.util.Scanner;

public class Exercicio1{

    static double average(double num1, double num2){
        double calc = (num1 + num2) / 2;
        return calc;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira um número real:");
        double num1 = input.nextDouble();
        System.out.println("Insira outro número real:");
        double num2 = input.nextDouble();
        System.out.println("media: " + average(num1, num2));
    }
}
// Questão 1  - Entrar com dois números reais e imprimir a média aritmética com a mensagem
// media antes do resultado.
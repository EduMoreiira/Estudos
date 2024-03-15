import java.util.Scanner;
public class Exercicio3 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira o primeiro número:");
        int num1 = input.nextInt();
        System.out.println("Insira o segundo número:");
        int num2 = input.nextInt();

        System.out.println(num1 + " elevado a " + num2 + " é igual a " + Math.pow(num1, num2));
    }
}

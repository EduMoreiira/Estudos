import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira a medida do angulo em gráus:");
        int angle = input.nextInt();

        System.out.println("O seno do ângulo é: " + Math.sin(angle));
        System.out.println("O cosseno do ângulo é: " + Math.cos(angle));
    }
}

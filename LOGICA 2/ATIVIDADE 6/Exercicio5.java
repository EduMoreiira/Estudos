import java.util.Scanner;
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira um número: ");
        int num = input.nextInt();

        System.out.println(num + " elevado a 2 é igual a " + Math.pow(num, 2));
        System.out.println("A raiz quadrada de " + num + " é igual a " + Math.sqrt(num));
    }
}

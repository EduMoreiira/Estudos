
import java.util.Scanner;
public class Exercicio1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira um número inteiro:");
        int num = input.nextInt();

        for(int i = 1; i <= 10; i++){
            int calc = num * i;
            System.out.println(num + " x " + i + " = " + calc);
        }
    }
}

import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira um número inteiro");
        int num = input.nextInt();
        if((num % 2) == 0){
            System.out.println(num+" é par");
        }else{
            System.out.println(num+" é impar");
        }
    }
}

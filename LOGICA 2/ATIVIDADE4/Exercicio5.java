import java.util.Scanner;
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;

        System.out.println("Insira um número inteiro:");
        num1 = input.nextInt();

        System.out.println("Insira outro número inteiro:");
        num2 = input.nextInt();

        if(num1 > num2){
            System.out.println("O primeiro número é maior que o segundo");
        }else if(num1 < num2){
            System.out.println("O segundo número é maior que o primeiro");
        }else{
            System.out.println("Ambos números são idênticos");
        }
    }   
}

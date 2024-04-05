import java.util.Scanner;

public class Exercicio5 {
    static void mathChecker(int num){
        boolean isDivisible = false;
        if(num % 10 == 0){
            System.out.println("O número é divisivel por 10");
            isDivisible = true;
        }
        if(num % 5 == 0){
            System.out.println("O número é divisivel por 5");
            isDivisible = true;
        }
        if(num % 2 == 0){
            System.out.println("O número é divisivel por 2");
            isDivisible = true;
        }
        if(isDivisible == false){
            System.out.println("O número não é divisível por 2, nem por 5, nem por 10");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira um numero inteiro:");
        int num = input.nextInt();
        mathChecker(num);

    }
}

// 5) Entrar comum número e informar se ele é divisível por 10, por 5, por 2 ou se não é
// divisível por nenhum destes.

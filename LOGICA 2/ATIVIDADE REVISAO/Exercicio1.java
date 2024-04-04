import java.util.Scanner;

public class Exercicio1{
    static void math(int dividendo, int divisor){
        float quociente = dividendo / divisor;
        float resto = dividendo % divisor;
        System.out.println("O valor do dividendo é:" + dividendo);
        System.out.println("O valor do divisor é: " + divisor);
        System.out.println("O valor do quociente é: " + quociente);
        System.out.println("O valor do resto é: " + resto);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira um número inteiro:");
        int num1 = input.nextInt();
        System.out.println("Insira mais um número inteiro:");
        int num2 = input.nextInt();

        math(num1, num2);
    }
}
// 1) Entrar com dois números inteiros e imprimir a seguinte saída:
// dividendo
// divisor:
// quociente:
// resto
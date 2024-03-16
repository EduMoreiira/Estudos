import java.util.Scanner;
public class Exercicio4 {

    public static void fatorial(int num){
        long result = num;
        for(int i = num; i > 0; i--){
            //condicao para nao multiplicar por zero;
            if(i > 1 ){
                result = result * (i - 1);
                System.out.print(i + " * ");
            }
        }
        System.out.print("1 = " + result);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Insira um número inteiro que deseja realizar o fatorial: ");
        fatorial(input.nextInt());
        
    }
}

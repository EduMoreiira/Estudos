import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args) {

        for(String condition ; ; ){
            Scanner input = new Scanner(System.in);
            
            System.out.println("Escolha uma alternativa:\n1: soma\n2: raizquadrada\n3: finalizar\n");
            condition = input.nextLine();
            
            
            if(condition.equals("soma")){
                float num1, num2;

                System.out.println("Insira o primeiro número a ser somado:");
                num1 = input.nextFloat();
                System.out.println("Insira o segundo número a ser somado:");
                num2 = input.nextFloat();

                System.out.println("O resultado de: " + num1 + " + " + num2 + " = " + (num1 + num2) + "\n");

            }else if(condition.equals("raizquadrada")){
                int num;

                System.out.println("Insira o número a se descobrir a raiz quadrada:");
                num = input.nextInt();
                System.out.println("A raiz quadrada do número " + num + " é: " + Math.sqrt(num) + "\n");

            }else if(condition.equals("finalizar")){
                break;
            }
        }
    }
}

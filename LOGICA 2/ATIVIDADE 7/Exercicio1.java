import java.util.Scanner;
public class Exercicio1{

    static double _double( double num){
        return num*2;
        
    }
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Insira o primeiro numero:");
    double num1 = input.nextDouble();
    System.out.println("Insira o segundo numero:");
    double num2 = input.nextDouble();
    System.out.println("Insira o terceiro numero:");
    double num3 = input.nextDouble();

    System.out.println("O dobro dos números inseridos são: " + _double(num1) + " " + _double(num2) + " " + _double(num3));

    
    }
}
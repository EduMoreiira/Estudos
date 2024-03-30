import java.util.Scanner;
import java.util.ArrayList;
public class Exercicio1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira 5 valores inteiros:");
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        for(int i = 0 ; i < 5; i++){
            System.out.println("Valor número " + (i + 1));
            numbers.add(input.nextInt());
        }
        
        System.out.println("Os números inseridos foram:");
        numbers.forEach((num) -> {
            System.out.print(num + " ");
        });
    }
}
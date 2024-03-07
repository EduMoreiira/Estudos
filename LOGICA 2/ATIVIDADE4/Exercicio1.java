import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira sua idade:");
        int age = input.nextInt();
        
        if(age >= 18){
            System.out.println("Você tem "+ age + " anos, portanto é considerado maior de idade");
        }else{
            System.out.println("Você tem "+ age + " anos, portanto é considerado menor de idade");
        }


    }
}

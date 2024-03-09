import java.util.Scanner;
public class Exercicio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o código do produto:");
        int code = input.nextInt();
        System.out.println("Insira o valor do produto:");
        float price = input.nextFloat();

        switch (code){
            case 1:
                price+= price * 0.15;
                break;
            case 3: 
                price+= price * 0.2;
                break;
            case 4: 
                price+= price * 0.35;
                break;
            case 8: 
                price+= price * 0.4;
                break;
        }
        
        System.out.println("O preço do produto é: " + price);

    }
}

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o código de origem do produto:");
        int code = input.nextInt();
        System.out.println("Insira o valor do produto:");
        float price = input.nextFloat();

        String location = "";
        switch (code){
            case 1:
                location = "Sul";
                break;
            case 2:
                location = "Norte";
                break;
            case 3:
                location = "Leste";
                break;
            case 4:
                location = "Oeste";
                break;
            case 5:
                location = "Nordeste";
                break;
            case 6:
                location = "Sudeste";
                break;
            case 7:
                location = "Centro-Oeste";
                break;
            case 8:
                location = "Nordeste";
                break;
            default:
                location = "Procedência não identificada";
        }
        
        System.out.println("O preço do produto é: " + price);
        System.out.println("A procedência do produto é: " + location);
    }
}

import java.util.Scanner;
public class Exercicio8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner inputStr = new Scanner(System.in);

        System.out.println("Insira sua altura:");
        double height = input.nextDouble();
        System.out.println("Insira seu sexo:");
        System.out.println("M ou F");
        String gender = inputStr.nextLine();

        float weight = 0;
        switch(gender){
            case "F":
            case "f":
                weight = (62.1f * (float)height) - 44.7f;
                System.out.println("Seu peso ideal é: "+ weight+ " quilos");
                break;
            case "M":
            case "m":
                weight = (72.7f * (float)height) - 58;
                System.out.println("Seu peso ideal é: "+ weight+ " quilos");
                break;
            default:
            System.out.println("Não foi possível identificar o seu sexo, tente novamente.");
        }
        
    }
}

import java.util.Scanner;
public class Exercicio9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira a sigla do seu estado");
        System.out.println("Opções: RJ, SP e MG");

        String state = input.nextLine();

        switch (state){
            case "RJ":
            case "rj":
                System.out.println("Você escolheu Rio de Janeiro");
                break;
            case "SP":
            case "sp":
                System.out.println("Você escolheu São Paulo");
                break;
            case "MG":
            case "mg":
                System.out.println("Você escolheu Minas Gerais");
                break;
            default: 
                System.out.println("Você escolheu um estado diferente da lista");
        }
    }
}

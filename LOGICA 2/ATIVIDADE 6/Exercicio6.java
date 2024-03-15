import java.util.Scanner;
public class Exercicio6 {
    static long randomNum(double num){
        return Math.round(Math.random() * num);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int response;
        do {
            System.out.println("Insira 1 para gerar novos números da mega-sena.\nInsira 2 para encerrar.");
            response = input.nextInt();

            if(response == 1){
                System.out.println("Os números da mega-sena sorteados foram:\n"
                + randomNum(60) + "-"+ randomNum(60) + "-"+ randomNum(60) + "-"+ randomNum(60) + "-"+ randomNum(60) + "-"+ randomNum(60));
            }
        } while (response != 2);
    }
}

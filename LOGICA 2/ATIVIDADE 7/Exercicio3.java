import java.util.Scanner;
public class Exercicio3 {
    public static String getMonth(int num){
        if(num == 1){
            return "Você retornou o mês de Janeiro.";
        }else if(num == 2){
            return "Você retornou o mês de Fervereiro.";
        }else if(num == 3){
            return "Você retornou o mês de Março.";
        }else{
            return "Inválido";
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira um número de 1 a 3 para retornar um mês do primeiro trimestre: ");
        System.out.println(getMonth(input.nextInt()));
    }
}

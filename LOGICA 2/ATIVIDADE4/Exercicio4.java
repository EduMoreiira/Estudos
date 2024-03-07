import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira seu salário:");
        float salary = input.nextFloat();

        if(salary >= 850){
            System.out.println("Você não tem direito ao aumento, seu continua no valor de: "+ salary);
        }else{
            salary += salary * 0.3;
            System.out.println("Seu salário foi reajustado em 30%, totalizando: "+ salary);
        }
    }
}

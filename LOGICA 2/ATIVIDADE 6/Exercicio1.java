import java.util.Scanner;
public class Exercicio1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o ano de seu nascimento:");
        int birthYear = input.nextInt();
        System.out.println("Insira o ano atual:");
        int currentYear = input.nextInt();

        int age = currentYear - birthYear;
        long ageInWeeks = Math.round(age * 52.1429);

        System.out.println("Você tem " + age + " ano(s).");
        System.out.println("Sua idade convertida em semanas é igual a: " + ageInWeeks + " semanas.");
    }
}
import java.util.Scanner;
public class Exercicio2 {
    static double averageGrade(double grade1, double grade2, double grade3){
        return (grade1 + grade2 + grade3) / 3;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira a nota da primeira prova:");
        double prova1 = input.nextDouble();
        System.out.println("Insira a nota da segunda prova:");
        double prova2 = input.nextDouble();
        System.out.println("Insira a nota da terceira prova:");
        double prova3 = input.nextDouble();

        System.out.println("A media das tres notas inseridas é igual a : " + String.format("%.2f", averageGrade(prova1, prova2, prova3) ));
    }
}

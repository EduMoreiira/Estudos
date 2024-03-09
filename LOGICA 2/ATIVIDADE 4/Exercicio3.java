import java.util.ArrayList;
import java.util.Scanner;
public class Exercicio3 {

    static double averageGrade;

    public static void main(String[] args) {
        ArrayList<Double> grades = new ArrayList<Double>();
        Scanner input = new Scanner(System.in);

        System.out.println("Insira a nota da primeira prova:");
        grades.add(input.nextDouble());
        System.out.println("Insira a nota da segunda prova:");
        grades.add(input.nextDouble());
        System.out.println("Insira a nota da terceira prova:");
        grades.add(input.nextDouble());
        System.out.println("Insira a nota da quarta prova:");
        grades.add(input.nextDouble());

        for(int i = 0; i < grades.size(); i++){
            averageGrade += grades.get(i);
        }
        averageGrade = averageGrade / grades.size();

        if(averageGrade < 7.0){
            System.out.println("Sua média é: "+ averageGrade+", portanto está REPROVADO!");
        }else{
            System.out.println("Sua média é: "+ averageGrade+", portanto está APROVADO!");
        }
    }
}

import java.util.Scanner;
import java.util.ArrayList;
public class Exercicio5 {
    static void reajuste(ArrayList<String> names, ArrayList<Double> sallary){

        //array para os novos salarios
        ArrayList<Double> newSallary = new ArrayList<Double>();
        for(int i = 0; i < names.size(); i++){
            //armazena os novos salarios nesse array
            newSallary.add((sallary.get(i) + (sallary.get(i) * 0.08)));
            
            System.out.println((i+1) + " - " + names.get(i) + ": Salário reajustado para R$" + newSallary.get(i));
        }
    }
    public static void main(String[] args) {
        Scanner inputNames = new Scanner(System.in);
        Scanner inputSallary = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<String>();
        ArrayList<Double> sallary = new ArrayList<Double>();

        for(int i = 0; i < 3; i++){
            System.out.println((i+1) + " Insira seu nome:");
            names.add(inputNames.nextLine());
            System.out.println((i+1) + " Insira seu salário:");
            sallary.add(inputSallary.nextDouble());
        }

        reajuste(names, sallary);
    }
}
// Questão 5 - Usando vetor, armazene o nome e salário de 20 pessoas. Calcular e
//  armazenar o novo salário sabendo-se que o reajuste foi de 8%. Imprimir uma listagem
//   numerada com nome e novo salário.
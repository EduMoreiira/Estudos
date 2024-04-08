import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio6 {

    static void mathCalcs(ArrayList<Double> arr){
        double sumOfNums = 0;
        for(int i = 0; i < arr.size(); i++){
            sumOfNums += arr.get(i);
        }
        double average = sumOfNums / arr.size();

        int higherThanAverage = 0;
        int equalToAverage = 0;
        int equalTo30 = 0;
        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i) > average){
                higherThanAverage++;
            }else if( arr.get(i) == average){
                equalToAverage++;
            }

            if(arr.get(i) == 30){
                equalTo30++;
            }
        }
        
        System.out.println("Quantidade de números iguais a 30: " + equalTo30);
        System.out.println("Quantidade de números maior que a média: " + higherThanAverage);
        System.out.println("Quantidade de números iguais a média: " + equalToAverage);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Double> nums = new ArrayList<Double>();

        for(int i = 0; i < 5; i++){
            System.out.println("Insira um número real:");
            nums.add(input.nextDouble());
        }

        mathCalcs(nums);
    }
}
// Questão 6 - Fazer um algoritmo para ler e armazenar em uma lista de 100 números reais. Ao final deve ser mostrado ao usuário: 
// 1. quantos números lidos são iguais a 30
// 2. quantos são maior que a média
// 3. quantos são iguais a média
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio3 {

    static void sumAndProduct(ArrayList<Integer> arr){
        int product = 0;
        int sum = 0;
        
        for(int i = 0; i < arr.size(); i++){

            if(arr.get(i) % 2 != 0){
                if(product == 0) {
                    product = 1;
                }
                product *= arr.get(i);
            }else{
                sum += arr.get(i);
            }
        }

        System.out.println("Soma dos números pares: " + sum);
        System.out.println("Produto dos números ímpares: " + product);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        ArrayList<Integer> nums = new ArrayList<Integer>();
        for(int i = 0; i < 5; i++){
            System.out.println("Insira um número inteiro:");
            nums.add(input.nextInt());
        }

        sumAndProduct(nums);
    }
}
// Questão 3 - Criar um algoritmo que entre com vários números inteiros 
// positivos e imprima o produto dos números ímpares digitados e a soma dos pares.
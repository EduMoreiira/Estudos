import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<Integer>();

        for(int i = 0; i < 20; i++){
            System.out.println("[N" + (i+1) + "] Insira um numero:");
            nums.add(input.nextInt());
        }

        int sumOfHigherSquares = 0;
        for(int i = 0; i < nums.size(); i++){
            if(nums.get(i) * nums.get(i) < 225){
                sumOfHigherSquares += nums.get(i);
            }
        }
        System.out.println("Soma dos numeros cujos quadrados sao menores que 225: " + sumOfHigherSquares);
    }
}
// 7) Entrar com 20 números e imprimir a soma dos números cujos quadrados são menores do que 225.
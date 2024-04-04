import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Float> nums = new ArrayList<Float>();
        ArrayList<Integer> pesos = new ArrayList<Integer>(Arrays.asList(1,2,3,4));

        float calcOfValues = 0;
        int sumOfPesos = 0;
        for(int i = 0; i < 4; i++){
            System.out.println((i+1) + " Insira um número: ");
            nums.add(input.nextFloat());
            calcOfValues += nums.get(i) * pesos.get(i);
            sumOfPesos += pesos.get(i);
        }

        float averageValue = calcOfValues / sumOfPesos;

        System.out.println("O valor da média ponderada é igual a: " + averageValue);
    }
}

import java.util.Scanner;
import java.util.ArrayList;
public class Exercicio4 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> age = new ArrayList<Integer>();
        int legalAge = 0;
        for(int i = 1 ; i <= 10; i++){
            System.out.println("Insira a idade da pessoa número [" + i + "]");
            age.add(input.nextInt());

            if(age.get(i-1) >= 18){
                legalAge++;
            }
        }

        System.out.println("Total de pessoas maiores de idade:" + legalAge);
    }
}

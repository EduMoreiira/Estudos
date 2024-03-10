import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> num = new ArrayList<Integer>();
        int index = 0, highestNum = 0, lowestNum = 0, newNum;;
        
        do {
            System.out.println("Insira um número inteiro positivo, ou insira 0 para encerrar.");

            newNum = input.nextInt();
            
            if(newNum > 0){
                num.add(newNum);
                
                // This will switch the initial value to this two variables, 
                // so the next if statements will not compare with the initial value of 0
                if(highestNum == 0 && lowestNum == 0){
                    lowestNum = newNum;
                    highestNum = newNum;
                }

                if(num.get(index) < lowestNum){
                    lowestNum = num.get(index);
                }
                if(num.get(index) > highestNum){
                    highestNum = num.get(index);
                }
                index++;
                
            }else if(newNum < 0){
                System.out.println("Números negativos não são aceitos.");

            }else{

                System.out.println("O menor número inserido foi: [" + lowestNum + "]." );
                System.out.println("O maior número inserido foi: [" + highestNum + "]." );
            }
            
        } while (newNum != 0);
    }
}

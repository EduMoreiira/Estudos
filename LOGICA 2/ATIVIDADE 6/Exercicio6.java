import java.util.Scanner;
import java.util.ArrayList;
public class Exercicio6 {
    static ArrayList<Long> randomNum(double num, int length){
        ArrayList<Long> numbers = new ArrayList<Long>();

        for(int index = 0; index < length; index++){
            
            numbers.add(Math.round(Math.random() * num));



            if(numbers.size() > 1){
                boolean isRepeated = true;
                for(int i = index; isRepeated == false; i--){

                    if ( i < 1 ){
                        i = index;
                    }

                    if(numbers.get(index) == numbers.get(index-i)){
                        System.out.println(numbers.get(index) + " do index "+ index + " é igual a " + numbers.get(index-i) + "do index " + (index-i));
                        
                        numbers.set(index, Math.round(Math.random() * num));
                        if(numbers.get(index) != numbers.get(index-i)){
                            isRepeated = false;
                        }
                    }

                }
            }
        }
        return numbers;
        
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int response;
        do {
            System.out.println("Insira 1 para gerar novos números da mega-sena.\nInsira 2 para encerrar.");
            response = input.nextInt();

            if(response == 1){
                // System.out.println("Os números da mega-sena sorteados foram:\n"
                // + randomNum(6) + "-"+ randomNum(6) + "-"+ randomNum(6) + "-"+ randomNum(6) + "-"+ randomNum(6) + "-"+ randomNum(6));
                
                System.out.println(randomNum(6, 7));
            }
        } while (response != 2);
    }
}

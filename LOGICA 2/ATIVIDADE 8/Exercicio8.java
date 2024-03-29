import java.util.Scanner;
public class Exercicio8 {
    static String intToWord(int num){
        String strNum = Integer.toString(num);
        String[] arrOfStrNum = strNum.split("");

        String numbersInWords = "";

        String[] numbers = {"0","1","2","3","4","5","6","7","8","9"};
        String[] wordNumbers = {"zero", "um", "dois", "tres", "quatro", "cinco", "seis", "sete", "oito", "nove"};
        
        for(int i = 0; i < arrOfStrNum.length; i++){

            for(int numIndex = 0; numIndex < numbers.length; numIndex++){
                if(arrOfStrNum[i].equals(numbers[numIndex])){
                    numbersInWords += wordNumbers[numIndex] + ", ";
                }
            }
        }

        //this will switch the last comma for a dot.
        numbersInWords = numbersInWords.substring(0, numbersInWords.length() - 2) + ".";

        return numbersInWords;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira uma sequencia de números inteiros:");
        int numbers = input.nextInt();
        System.out.println(intToWord(numbers));
    }
}
// 8 -Escreva um programa que dado um valor numérico digitado pelo usuário (armazenado em  
// uma variável inteira), imprima cada um dos seus dígitos por extenso.  
// Exemplo:  
// Entre o número: 4571  
// Resultado: quatro, cinco, sete, um 
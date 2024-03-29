import java.util.Scanner;
public class Exercicio7 {
    static void strChecker(String str){
        // a) length of str
        int strLength = str.length();

        //b) upcase str
        String uppercaseStr = str.toUpperCase();

        // c) vocals counter
        char[] vocals = {'a','e','i','o','u'};
        int vocalCounter = 0;
        for(int i = 0; i < strLength; i++){

            for(int vcIndex = 0; vcIndex < vocals.length; vcIndex++){
                if(str.charAt(i) == vocals[vcIndex]){
                    vocalCounter++;
                }
            }
        }
        
        //d) if starts with "UNI"
        boolean startsWithUni = uppercaseStr.startsWith("UNI");

        //e) if ends with "RIO"
        boolean endsWithRio = uppercaseStr.endsWith("RIO");

        //outputs
        System.out.println("A string inserida contém " + strLength + " caracteres");
        System.out.println("A string inserida em maiúsculo: " + uppercaseStr);
        System.out.println("A string inserida em contém: " + vocalCounter + " vogais");
        if(startsWithUni){
            System.out.println("A string inserida começa com \"UNI\"");
        }else{
            System.out.println("A string inserida não começa com \"UNI\"");
        }

        if(endsWithRio){
            System.out.println("A string inserida termina com \"RIO\"");
        }else{
            System.out.println("A string inserida não termina com \"RIO\"");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira uma string: ");
        String str = input.nextLine();
        strChecker(str);
    }
}
// 7 - Faça um programa que, a partir de uma string digitada pelo usuário, imprima:  
// a) O número de caracteres da string.  
// b) A string com todas suas letras em maiúsculo.  
// c) O número de vogais da string.  
// d) Se a string digitada começa com “UNI” (ignorando maiúsculas/minúsculas).  
// e) Se a string digitada termina com “RIO” (ignorando maiúsculas/minúsculas).  
// f) O número de dígitos (0 a 9) da string.  
// g) Se a string é um palíndromo ou não.
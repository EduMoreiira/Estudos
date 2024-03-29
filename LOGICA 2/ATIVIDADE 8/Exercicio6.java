import java.util.Scanner;
public class Exercicio6{
    static void reversePhrases(String str){
        int length = str.length();
        String reversePhrase = "";

        for(int i = length - 1; i >= 0 ; i--){
            reversePhrase += str.charAt(i);
        }
        reversePhrase = reversePhrase.replace('a', '*');
        System.out.println("String modificada: " + reversePhrase);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira a primeira frase: ");
        String phrase1 = input.nextLine();
        reversePhrases(phrase1);
        System.out.println("Insira a segunda frase: ");
        String phrase2 = input.nextLine();
        reversePhrases(phrase2);
    }
}
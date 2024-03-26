import java.util.Scanner;
public class Exercicio5 {
    static void vocals(String str, char character){
        int vocalCounter = 0;
        char[] vocals = {'a','e','i','o','u'};
        String modified = str;
        for(int i = 0; i < str.length(); i++){

            for(int index = 0; index < vocals.length; index++){
                if(str.charAt(i) == vocals[index]){
                    vocalCounter++;
                    modified = modified.replace(str.charAt(i), character);
                }
            }
        }

        System.out.println("A palavra [" + str + "] contém " + vocalCounter + " vogais.");
        System.out.println("A palavra [" + str + "] modificada com o caráctere [" + character + "] ficou: [" + modified + "]");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira uma palavra:");
        String word = input.nextLine();
        System.out.println("Insira um caractere para substituir as vogais");
        char character = input.next().charAt(0);

        vocals(word, character);

    }
}

import java.util.Scanner;
public class Exercicio4 {
    static int charCounter(String str, char charToCount){
        int length = str.length();
        int counter = 0;

        for(int i = 0 ; i < length; i++){
            if(str.charAt(i) == charToCount){
                counter++;
            }
        }
        return counter;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira uma sequência de carácteres:");
        String chars = input.nextLine();
        System.out.println("Insira um caráctere que você deseja contar:");
        char charToCount = input.next().charAt(0);
        System.out.println("A quantidade de carácteres do tipo [" + charToCount + "] presentes em [" + chars + "] é igual a: " + charCounter(chars, charToCount));
    }
}

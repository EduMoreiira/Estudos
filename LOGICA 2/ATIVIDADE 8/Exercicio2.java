import java.util.Scanner;
public class Exercicio2 {
    static String stringCounter(String str, int num){
        return str.substring(0, num);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira uma string");
        String str = input.nextLine();
        System.out.println("Os primeiros 4 digitos da string [" + str + "] são: " + stringCounter(str, 4));
    }
}

import java.util.Scanner;
public class Exercicio1{
    static int charactersCounter(String str){
        return str.length();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira uma string");
        String str = input.nextLine();
        System.out.println("A quantidade de caracteres da string [" + str + "] é igual a " + charactersCounter(str));
    }
}
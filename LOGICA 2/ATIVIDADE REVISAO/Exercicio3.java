import java.util.Scanner;

public class Exercicio3 {

    static void nameFunc(String name){
        char firstChar = name.charAt(0);
        char lastChar = name.charAt(name.length()-1);
        String first3Chars = name.substring(0, 3);
        char fourthChar = name.charAt(3);
        String noFirstChar = name.substring(1, name.length());
        String twoLastChar = name.substring(name.length()-2, name.length());


        System.out.println("Nome completo: " + name);
        System.out.println("Primeiro caractere: " + firstChar);
        System.out.println("Último caractere: " + lastChar);
        System.out.println("Do primeiro caractere ao terceiro: " + first3Chars);
        System.out.println("Quarto caractere: " + fourthChar);
        System.out.println("Nome sem o primeiro caractere: " + noFirstChar);
        System.out.println("Dois últimos caracteres: " + twoLastChar);

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira um nome");

        String name = input.nextLine();
        nameFunc(name);

    }
}
// 3) Entrar com um nome e imprimir:
// todo nome:
// primeiro caractere:
// ultimo caractere:
// do primeiro ate o terceiro:
// quarto caractere:
// todos menos o primeiro:
// os dois últimos:
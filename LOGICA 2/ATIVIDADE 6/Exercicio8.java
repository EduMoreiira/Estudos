import java.util.Scanner;
public class Exercicio8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o valor do raio:");
        double raio = input.nextDouble();
        
        double area = Math.PI * Math.pow(raio, 2);
        System.out.println("A área do circulo é: " + area);
    }
}

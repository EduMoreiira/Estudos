import java.util.Scanner;

public class Exercicio4 {
    static void comapanyRevenues(int videoTapes, int price){
        double annualTurnover = ((videoTapes / 3) * price) * 12;
        double penalties = (price * 0.10) * (videoTapes * 0.10);
        double totalTapes = (videoTapes - (videoTapes * 0.02)) + (videoTapes * 0.1);

        System.out.println("Faturamento anual: R$" + String.format("%.2f", annualTurnover));
        System.out.println("Valor arrecadado com multas: " + penalties);
        System.out.println("Total de fitas ao final do ano: " + totalTapes);
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Insira a quantidade de fitas atual:");
        int videoTapes = input.nextInt();

        System.out.println("Insira o valor cobrado por cada fita:");
        int price = input.nextInt();

        comapanyRevenues(videoTapes, price);
    }
}
// 4) Criar um algoritmo que leia a quantidade de fitas que uma locadora de vídeo possui e o valor que ela cobra por cada aluguel, mostrando as informações pedidas a seguir:
// Sabendo que um terço das fitas são alugadas por mês, exiba o faturamento anual da locadora.
// Quando o cliente atrasa a entrega, é cobrada uma multa de 10% sobre o valor do aluguel. Sabendo que um décimo das fitas alugadas no mês são devolvidas com atraso, calcule o valor ganho com multas por mês.
// Sabendo ainda que 2% de fitas se estragam ao longo do ano, e um décimo do total é comprado para reposição, exiba a quantidade de fitas que a locadora terá no final do ano.
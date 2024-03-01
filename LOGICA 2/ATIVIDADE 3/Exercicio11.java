public class Exercicio11 {
    public static void main(String[] args){
        int salarioMinimo = 1400;
        int quillowatGastos = 60;

        double quilowatt = salarioMinimo * 0.02;
        double valorResidencia = quillowatGastos * quilowatt;
        double valorDesconto = valorResidencia - valorResidencia * 0.15;

        System.out.println(quilowatt);
        System.out.println(valorResidencia);
        System.out.println(valorDesconto);
    }

}
// 13 - Sabe-se que o quilowatt de energia custa 2% do salário mínimo. Faça
// um programa que receba o valor do salário mínimo e a quantidade de
// quilowatts gasta por uma residência. Calcule e imprima:

// - o valor, em reais, de cada quilowatt;

// - o valor, em reais, a ser pago por essa residência;

// - o novo valor à ser pago por essa residência, se for dado um desconto de
// 15%
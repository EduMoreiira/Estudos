package ATIVIDADE3;

public class Calculadora {

    double calcularMedia(double nota1, double nota2, double nota3){
        return (nota1 + nota2 + nota3) / 3;
    }

    boolean isPar(int num){
        return num % 2 == 0;
    }

    int soma(int num1, int num2){
        return num1 + num2;
    }

    void imprimirMensagem(String msg){
        System.out.println(msg);
    }
}

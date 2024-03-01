public class Exercicio6{
    public static void main(String[] args){

        int nota1 = 4;
        int peso1 = 2;

        int nota2 = 5;
        int peso2 = 3;
        
        int ponderada = (nota1 * peso1 + nota2 * peso2) / (peso1 + peso2);
        System.out.println(ponderada);
    }
}
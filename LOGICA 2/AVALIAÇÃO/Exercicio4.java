

public class Exercicio4 {
    static void polegadas(int quantity){
        double polegada = 2.54;
        for(int i = 1; i <= quantity; i++){
            System.out.println((i) + " Polegada(s) = " + polegada * i + " cm");
        }

    }
    public static void main(String[] args) {

        polegadas(20);

    }
}
// Questão 4 - Criar um algoritmo que imprima uma lista de conversão de polegadas 
// para centímetros. Deseja-se que na tabela conste valores desde 1 polegada até 20 polegadas
//  inteiras. 1 polegada é igual a 2.54 cm. 
// *
// 10 pontos

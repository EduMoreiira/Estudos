import java.util.Scanner;
import java.util.ArrayList;
public class Exercicio6 {
    static ArrayList<Long> randomNum(double num, int length){
        //cria um array de numeros
        ArrayList<Long> numbers = new ArrayList<Long>();
        //adiciona um primeiro numero fora do loop
        numbers.add(Math.round(Math.random() * num));

        for(int index = 1; index < length; index++){
            //gera um numero aleatorio
            long randomNum = Math.round(Math.random() * num);

            //inicia um contador em 0
            int counter = 0;
            //inicia um loop que lê todos os numeros do array, ele só é parado quando nosso contador alcança o numero de casas do array
            for(int i = index; counter != index; i--){

                //reseta o valor de i para o numero do index atual quando chega a zero (para evitar erro out of bound)
                if(i == 0){
                    i = index;
                }

                //condicao para validar se o numero aleatorio gerado é diferente de todos os outros indices do array
                //se sim, o contador é aumentado até que ele alcance o numero de indices do nosso array.
                if(randomNum != numbers.get(i - 1)){
                    counter++;
                }else{
                    //se for identificado que o numero é repitido, o contador reseta para zero e um novo numero aleatorio é gerado
                    //e a checagem irá reiniciar novamente, até um numero aleatorio ser diferente de todos os indices do array
                    counter = 0;
                    randomNum = Math.round(Math.random() * num);
                }
                
            }
            // se o contador conseguir alcancar o numero de casas do array, é porque o numero aleatorio gerado é diferente
            // de todos os outros indices do array, portanto, ele será adicionado no comando abaixo.
            numbers.add(randomNum);
            
        }
        return numbers;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int response;
        do {
            System.out.println("Insira 1 para gerar novos números da mega-sena.\nInsira 2 para encerrar.");
            response = input.nextInt();

            if(response == 1){
                ArrayList<Long> megasena = randomNum(60, 6);
                System.out.println("Os números da mega-sena sorteados foram:\n"
                + megasena.get(0) + "-"+ megasena.get(1) + "-"+ megasena.get(2) + "-"+ megasena.get(3) + "-"+ megasena.get(4) + "-"+ megasena.get(5));
                
            }
        } while (response != 2);
    }
}

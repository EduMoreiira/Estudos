import java.util.Scanner;
public class Exercicio7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int candidato1 = 0, candidato2 = 0, candidato3 = 0, candidato4 = 0, nulo = 0;
        
        for(;;){
            System.out.println("Insira um digito para confirmar seu voto:");
            System.out.println("1 -> para votar no Candidato 1");
            System.out.println("2 -> para votar no Candidato 2");
            System.out.println("3 -> para votar no Candidato 3");
            System.out.println("4 -> para votar no Candidato 4");
            System.out.println("5 -> para votar Em Branco");
            System.out.println("Outros -> para votar Nulo");
            System.out.println("0 -> Encerrar votações");

            int resposta = input.nextInt();

            if(resposta == 1){
                candidato1++;
            }else if(resposta == 2){
                candidato2++;
            
            }else if(resposta == 2){
                candidato2++;
            
            }else if(resposta == 3){
                candidato3++;
            
            }else if(resposta == 4){
                candidato4++;
            }
        }
    }
}
// 7 - Em uma eleição presidencial, existem quatro candidatos. Os votos são informados através de código. Os códigos utilizados são:

// 1,2,3,4 -> votos para os respectivos candidatos; 

// 5 -> voto em branco;

// outros -> voto.nulo.

// Escreva um programa que calcule e imprima:

// -total de votos para cada candidato;

// -total de votos nulos;

// -total de votos em branco;

// -porcentagem de votos nulos sobre o total de votos;

// -porcentagem de votos em branco sobre o total de votos.

// Para finalizar o conjunto de votos, tem-se o voto com valo zero 
import java.util.Scanner;
import java.util.ArrayList;
public class Exercicio5 {

    static int voteCounter(ArrayList<Boolean> voteArr, boolean reviewType){
        int voteCounter = 0;

        for(int i = 0; i < voteArr.size(); i++){
            if(voteArr.get(i) == reviewType){
                voteCounter++;
            }
        }
        return voteCounter;
    }

    static int genderVoteCounter(ArrayList<Character> genderArr, ArrayList<Boolean> voteArr, boolean reviewType, char genderType){
        int voteCounter = 0;

        for(int i = 0; i < genderArr.size(); i++){
            if(genderArr.get(i) == genderType && voteArr.get(i) == reviewType){
                voteCounter++;
            }
        }

        return voteCounter;
    }

    static String genderVotePercentage(ArrayList<Character> genderArr, ArrayList<Boolean> voteArr, boolean reviewType, char genderType){
        double genderCounter = 0;
        double voteCounter = 0;

        for(int i = 0; i < genderArr.size(); i++){
            if(genderArr.get(i) == genderType){
                genderCounter++;
            }

            if(genderArr.get(i) == genderType && voteArr.get(i) == reviewType){
                voteCounter++;
            }
        }
        double votePercentage = (voteCounter / genderCounter) * 100;
        return String.format("%.2f", votePercentage);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Character> gender = new ArrayList<Character>();
        ArrayList<Boolean> review = new ArrayList<Boolean>();

        for(int i = 0; i < 10; i++){
            System.out.println("Cadastro N[" + (i+1) + "] Insira o caractere que representa o seu sexo: \n [M] Masculino \n [F] Feminino");
            char genderInput = input.next().charAt(0);
            boolean validAnswer;
            switch (genderInput) {
                case 'm':
                case 'M':
                    gender.add('m');
                    System.out.println("Seu sexo foi computado como: Masculino");
                    validAnswer = true;
                    break;
            
                case 'f':
                case 'F':
                    gender.add('f');
                    System.out.println("Seu sexo foi computado como: Feminino");
                    validAnswer = true;
                    break;
                default:
                    System.out.println("\nSexo inválido, tente novamente inserindo os caracteres [M] ou [F]");
                    validAnswer = false;
                    i--;
                    break;
            }

            if(validAnswer == true){
                System.out.println("Cadastro N[" + (i+1) + "] Você gostou do produto?\n[S] Sim\n[N] Não");
                char reviewInput = input.next().charAt(0);
                switch (reviewInput) {
                    case 's':
                    case 'S':
                        System.out.println("Sua avaliação foi computada como: Positiva");
                        review.add(true);
                        break;

                    case 'n':
                    case 'N':
                        System.out.println("Sua avaliação foi computada como: Negativa");
                        review.add(false);
                        break;
                
                    default:
                        System.out.println("\nAvaliação inválida, tente novamento inserindo os caracteres [S] ou [N]");
                        gender.remove(i);
                        i--;
                        break;
                }

            }

        }

        System.out.println("Número de pessoas que responderam sim: " + voteCounter(review, true));
        System.out.println("Número de pessoas que responderam não: " + voteCounter(review, false));
        System.out.println("Número de mulheres que responderam sim: " + genderVoteCounter(gender, review, true, 'f'));
        System.out.println("Porcentagem de homens que responderam não entre os todos os homens analisados: " + genderVotePercentage(gender, review, false, 'm') + "%");

    }
}
// 5 - Uma certa firma fez uma pesquisa de mercado para saber se as pessoas gostaram ou não de um novo produto lançado. Para isso forneceu o sexo
// do entrevistado e sua resposta (sim ou não). Sabendo que foram entrevistadas 10 pessoas, faça um programa que calcule e imprima:
// • o número de pessoas que responderam sim;
// • o número de pessoas que responderam não;
// • o número de mulheres que responderam sim;
// • a porcentagem de homens que responderam não entre todos os
// homens analisados.
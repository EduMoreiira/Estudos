import java.util.ArrayList;
import java.util.Scanner;
public class Exercicio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<String>();
        for(int i = 0; i < 5; i++){
            System.out.println("[" + (i+1) + "] Insira o seu nome:");
            names.add(input.nextLine());
        }

        int answer;
        do {
            System.out.println("Digite o número correspondente a sua função:\n0- Encerrar programa\n1- Consultar um nome");
            answer = input.nextInt();
            
            if(answer == 1){
                Scanner input2 = new Scanner(System.in);

                System.out.println("Digite o nome que deseja consultar");
                String name = input2.nextLine();
                if(names.contains(name)){
                    System.out.println(name + " está cadastrado!\n");
                }else{
                    System.out.println("Não foi encontrado nenhum " + name + " cadastrado\n");
                }
            }
        } while (answer != 0);
    }
}
// Questão 6 - Elabore um programa que crie um vetor com 5 Strings para guardar os nomes de pessoas.
//  O vetor deve ser preenchido pelo usuário e ao final deve ser feita uma consulta com um novo nome para saber se ele está ou não cadastrado.
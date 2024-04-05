import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<String> name = new ArrayList<String>();
        ArrayList<Character> gender = new ArrayList<Character>();
        ArrayList<Integer> age = new ArrayList<Integer>();
        for(int i = 0; i < 20; i++){
            System.out.println("[Pessoa" + (i+1) + "] Insira seu nome:");
            name.add(input.nextLine());
            System.out.println("[Pessoa" + (i+1) + "] Insira seu sexo: m ou f");
            gender.add(input.next().charAt(0));
            System.out.println("[Pessoa" + (i+1) + "] Insira sua idade:");
            age.add(input.nextInt());
        }

        for(int i = 0; i < name.size(); i++){
            if(gender.get(i) == 'm' && age.get(i) > 21){
                System.out.println(name.get(i) + " tem mais de 21 anos e pertence ao sexo masculino");
            }
        }
    }
}
// 6) Entrar com um nome, idade e sexo de 20 pessoas. Imprimir o nome se a pessoa for
// do sexo masculino e tiver mais de 21 anos.
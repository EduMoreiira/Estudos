import java.util.Scanner;
public class Exercicio3 {

    static void reversalString(String str){
        int length = str.length();
        
        System.out.print("A string [" + str + "] invertida é = ");
        for(int i = length; i > 0; i--){
            System.out.print(str.substring(i-1, i));
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira uma string");
        String str = input.nextLine();
        // System.out.println(str.substring(4, 5));
        reversalString(str);
    }
}

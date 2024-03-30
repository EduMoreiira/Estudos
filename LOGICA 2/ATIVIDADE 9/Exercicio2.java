import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio2 {
    static void arrayConcat(ArrayList<Integer> arr, ArrayList<Integer> main){
        int arrLength = arr.size();

        for(int i = 0; i < arrLength; i++){
            main.add(arr.get(i));
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira 5 numeros inteiros:");
        ArrayList<Integer> nums1 = new ArrayList<Integer>();

        for(int i = 0 ; i < 5; i++){
            System.out.println("Numero " + (i+1));
            nums1.add(input.nextInt());
        }

        System.out.println("Insira mais 5 numeros inteiros:");
        ArrayList<Integer> nums2 = new ArrayList<Integer>();

        for(int i = 0 ; i < 5; i++){
            System.out.println("Numero " + (i+1));
            nums2.add(input.nextInt());
        }

        ArrayList<Integer> totalNums = new ArrayList<Integer>();
        arrayConcat(nums1, totalNums);
        arrayConcat(nums2, totalNums);

        System.out.println("Os valores das duas arrays são: ");
        totalNums.forEach((index) -> {
            System.out.print(index + " ");
        });
        
    }
}

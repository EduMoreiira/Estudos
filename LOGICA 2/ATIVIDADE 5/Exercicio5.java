import java.util.ArrayList;
import java.util.Scanner;
public class Exercicio5 {

    static String percentage(double group, double numberOfPeople){
        double calc = (group / numberOfPeople) * 100;
        return String.format("%.02f", calc);

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> ages = new ArrayList<Integer>();
        int ageGroup1 = 0, ageGroup2 = 0, ageGroup3 = 0, ageGroup4 = 0, ageGroup5 = 0;

        for(int i = 0 ; i < 15 ; i++){
            System.out.println("Insira a idade da pessoa número [" + (i+1) + "]");
            ages.add(input.nextInt());

            if(ages.get(i) <= 15){
                ageGroup1++;

            }else if(ages.get(i) <= 30){
                ageGroup2++;
            
            }else if(ages.get(i) <= 45){
                ageGroup3++;
            
            }else if(ages.get(i) <= 60){
                ageGroup4++;
            
            }else if(ages.get(i) > 60){
                ageGroup5++;
            }
        }

        System.out.println("A quantidade de pessoas no grupo de faixa etária [0-15]: " + ageGroup1 + " pessoas, com a porcentagem de: " + percentage(ageGroup1, ages.size()) + "%");
        System.out.println("A quantidade de pessoas no grupo de faixa etária [16-30]: " + ageGroup2 + " pessoas, com a porcentagem de: " + percentage(ageGroup2, ages.size()) + "%");
        System.out.println("A quantidade de pessoas no grupo de faixa etária [31-45]: " + ageGroup3 + " pessoas, com a porcentagem de: " + percentage(ageGroup3, ages.size()) + "%");
        System.out.println("A quantidade de pessoas no grupo de faixa etária [46-60]: " + ageGroup4 + " pessoas, com a porcentagem de: " + percentage(ageGroup4, ages.size()) + "%");
        System.out.println("A quantidade de pessoas no grupo de faixa etária [61 ou mais]: " + ageGroup5 + " pessoas, com a porcentagem de: " + percentage(ageGroup5, ages.size()) + "%");
    }
}
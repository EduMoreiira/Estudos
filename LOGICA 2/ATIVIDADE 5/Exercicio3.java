
public class Exercicio3 {
    public static void main(String[] args) {
        double maleHeight[] = {1.60, 1.50, 1.45, 1.70, 1.80, 1.95, 1.85};
        double femaleHeight[] = {1.55, 1.57, 1.67, 1.60, 1.50, 1.45, 1.75, 1.71};

        //concat female and male into a single array called maleFemale
        int mal = maleHeight.length;
        int fal = femaleHeight.length;
        double maleFemale[] = new double[mal + fal];
        System.arraycopy(maleHeight, 0, maleFemale, 0, mal);
        System.arraycopy(femaleHeight, 0, maleFemale, mal, fal);

        double tallest = 0,
        shortest = maleFemale[0],
        femaleHeightSum = 0;
        
        for(int i = 0 ;i < maleFemale.length ; i++ ){

            if(maleFemale[i] > tallest){
                tallest = maleFemale[i];
            }

            if(maleFemale[i] < shortest){
                shortest = maleFemale[i];
            }
        }

        for(int i = 0 ; i < femaleHeight.length ; i++){
            femaleHeightSum += femaleHeight[i];
        }
        
        int numberOfMen = maleHeight.length;
        double femaleAverageHeight = femaleHeightSum / femaleHeight.length;
        System.out.println("A maior altura é de: " + tallest + "m");
        System.out.println("A menor altura é de: " + shortest + "m");
        System.out.println("A média da altura das mulheres é de: " + femaleAverageHeight + "m");
        System.out.println("O número de homens é de: " + numberOfMen);


    }
}

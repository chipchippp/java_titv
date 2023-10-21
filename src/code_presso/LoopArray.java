package code_presso;

public class LoopArray {
    public static void main(String[] args) {
        String[] laguages = {"java", "c++", "php", "css"};

        for (int i = 0 ; i < laguages.length; i++){
            System.out.println("cach 1 "+laguages[i]);
        }

        for (String laguage : laguages){
            System.out.println("cach 2 "+laguage);
        }


        int[] reviewScore = {3,1,4,1,2,5,4,1,5,1,2};
        int count = 0;

        for (int i = 0; i < reviewScore.length; i++){
            if (reviewScore[i] == 1){
                count++;
            }
        }
        System.out.println("review 1 : " +count);


        for (int score : reviewScore){
            if (score == 1){
                count++;
            }
        }
        System.out.println("review 2 : " +count);
    }
}

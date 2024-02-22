package matrixTest;

import java.util.Arrays;

public class Lotto {

    public static void main(String[] args) {

        int[] lotto = new int[6];
        for (int i = 0; i < lotto.length; i++) {
            lotto[i] = 1+(int)(Math.random()*44);
            System.out.println("iiii "+i+" 숫자넣음"+Arrays.toString(lotto));
            for (int j = 0; j < i; j++) {
                if (lotto[i] == lotto[j]) {
                    i--;
                    break;
                }
            }
        }


        System.out.println("Rmx "+Arrays.toString(lotto));



        //정렬
        for (int i = 0; i < lotto.length; i++) {
            for (int ii = 0; ii < lotto.length; ii++) {
                if (lotto[i] < lotto[ii]) {
                    int math = lotto[i];
                    lotto[i] = lotto[ii];
                    lotto[ii] = math;
                } else {
                }
            }
        }



        System.out.printf("로또 번호\n\n");
        for (int i = 0; i < lotto.length; i++) {
            System.out.printf("%2d ", lotto[i]);
        }

    }
}

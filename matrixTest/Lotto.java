package matrixTest;

import java.util.Arrays;

public class Lotto {

    public void LottoMake(int[] lotto) {
        //로또 추첨기
//        1. 서로 겹치지 않는 숫자 6개를 생성
//        2.각 숫자는 1 ~ 45 범위 내의 숫자
//        3.매번 실행 시 다른 숫자 출력
//        4.오름차순 정렬
//          -> 랜덤수 : Math 사용
        //main method에서 instance로 바꿔줌

        lotto = new int[6];

        lotto=createRandomNumber(lotto);
        lotto=sort(lotto);
        printLotto(lotto);
    }

    public static void printLotto(int[] lotto) {
        for(int i = 0;i<lotto.length;i++){
            System.out.printf("%d\t",lotto[i]);
        }
    }


    //Service 부분---------------------------------------------------------------
    public static int[] createRandomNumber(int[] lotto) {
//        int[] lotto = new int[6];
        //로또 중복금액 중복 및 입력
        for(int i = 0;i<lotto.length;i++){
            lotto[i] = 1+(int)(Math.random()*9);
//            System.out.println(Arrays.toString(lotto));
            for(int j = 0;j<i;j++){
                if(lotto[i]==lotto[j]){
                    i--;
                    break;
                }
            }
        }

        return lotto;
    }

    public static int[] sort(int[] lotto){
        //오름차순 정렬
        for(int i = 0;i<lotto.length;i++){
            for(int j = 0;j<lotto.length;j++){
                if(lotto[i]<lotto[j]){
                    int math = lotto[i];
                    lotto[i] = lotto[j];
                    lotto[j] = math;
                }
            }
        }
        return lotto;
    }


}

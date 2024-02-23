package matrixTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LottoMatching {
//    로또 발급은 같다.
//    추가된 로직은 추첨된 로또이다.
//    두 로또의 일치여부에 따라
//    다음과 같은 메시지를 출력한다.
//    단 구매로또 번호와 추첨로또 번호 모두 같이 출력한다
//    1등 : 6개 맞춤, 2등 : 5개 맞춤, 3등 : 4개 맞춤, 4등 : 3개 맞춤, 꽝 : 2개 이하
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] lottoList1 = new int[6];
        int[] lottoList2 = new int[6];

        new Lotto().LottoMake(lottoList1);;
        System.out.println("");
//        Lotto.main(lottoList2);


        //lottoList1을 가져온다
//        Lotto.createRandomNumber(lottoList1);
//        Lotto.sort(lottoList1);
//        Lotto.printLotto(lottoList1);
//        System.out.println("");

        //lottoList2을 가져온다, 입력받은 수만큼
//        Lotto.createRandomNumber(lottoList2);
//        Lotto.sort(lottoList2);
//        Lotto.printLotto(lottoList2);
//        System.out.println("");

        int round = sc.nextInt();

        for(int i=0;i<round;i++){
            //lotto번호를 맞추고 출력한다
            new Lotto().LottoMake(lottoList2);
            int lottoMatch = lottoMatch(lottoList1,lottoList2);
            lottoAtari(lottoMatch);
        }

//        List<Lotto> articles = new ArrayList<>();
//        for(int i=0;i<sc.nextInt();i++){
//            articles.add(new Lotto()
//                    ,
//                    Lotto.sort(lottoList2),
//                    Lotto.printLotto(lottoList2));
//            System.out.println("");
//        }


    }

    public static void lottoAtari(int lottoMatch) {
        if(lottoMatch==6){
            System.out.println("1등입니다.");
        }else if(lottoMatch==5){
            System.out.println("2등입니다.");
        }else if(lottoMatch==4){
            System.out.println("3등입니다.");
        }else if(lottoMatch==3){
            System.out.println("4등입니다.");
        }else {
            System.out.println("꽝입니다.");
        }
    }

    public static int lottoMatch(int[] lottoList,int[] lottoList2){
        int[] oneLotto = new int[6];
        int[] twoLotto = new int[6];

        oneLotto = lottoList;
        twoLotto = lottoList2;

        int lotteMatch =0;

        for(int i =0;i<oneLotto.length;i++){
        for(int j =0;j<oneLotto.length;j++){
            if(oneLotto[i]==twoLotto[j]){
                lotteMatch++;
            }
        }}
        return lotteMatch;
    }


}

package matrixTest;

import java.util.Random;
import java.util.Scanner;

public class BuyLotto {

    /**
     * 1. 서로 겹치지 않는 숫자 6개를 생성
     * 2. 각 숫자는 1 ~ 45 범위 내의 숫자
     * 3. 매번 실행 시 다른 숫자 출력
     * 4. 오름차순 정렬
     * -> 랜덤수 : Math 사용
     * 결과)
     * ----------------
     * 로또 번호
     * ----------------
     * 2 11 25 27 35 38
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IBuyLotto buy = new BuytheLotto();
        ILottoDraw draw = new LottoDraw();
        ILottoMatch match = new LottoMatch();

        //당첨 로또 추첨 (랜덤)
        int[] arr = new int[6];
        arr = draw.createArrayWithoutDuplicates(arr);
        arr = draw.sortAscending(arr);
        draw.printLotto(arr);
        System.out.println("당첨번호 출력완");

        //내가 산 로또
//        int buyIt = sc.nextInt();
        int[] arr2 = new int[6];
        arr2 = buy.BuytheLotto(sc);
        arr2 = draw.sortAscending(arr2);
        draw.printLotto(arr2);
        System.out.println("내가 입력한 번호 출력 완");

        //로또 매칭값 찾아서 몇등인지 표기
        match.findSame(arr,arr2);
        System.out.println(match.rank(match.findSame(arr,arr2)));

        // 구입한 로또와 추첨한 로또의 일치여부 체크

    }
}


interface IBuyLotto {
    int[] BuytheLotto(Scanner sc);
}


interface ILottoDraw {
    int createRandomNumber(int start, int end);

    int[] createArrayWithoutDuplicates(int[] arr);

    int[] sortAscending(int[] arr);

    void printLotto(int[] arar);
}

interface ILottoMatch {
    int findSame(int[] originLotto, int[] myLotto);

    String rank(int count);
}

class BuytheLotto implements IBuyLotto {
    @Override
    public int[] BuytheLotto(Scanner sc) {
        int[] BuyLotto = new int[6];

        for (int i = 0; i < BuyLotto.length; i++) {
            BuyLotto[i] = sc.nextInt();
        }
        return BuyLotto;
    }
}

class LottoDraw implements ILottoDraw {
    @Override
    public void printLotto(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d \t", arr[i]);
        }
    }

    @Override
    public int[] sortAscending(int[] arar) {
        // 버블 정렬이 들어갈 부분
        for (int i = 0; i < arar.length; i++) {
            for (int j = 0; j < arar.length - 1; j++) {
                if (arar[j] > arar[j + 1]) {
                    int temp = arar[j];
                    arar[j] = arar[j + 1];
                    arar[j + 1] = temp;
                }
            }
        }
        return arar;
    }

    @Override
    public int[] createArrayWithoutDuplicates(int[] arr) {
        //로또 중복되는 숫자 걸러서 6개 배열에 담기
        for (int i = 0; i < 6; i++) {
            int randomNumber = createRandomNumber(1, 9);
            boolean check = false;
            for (int j = 0; j < 6; j++) {
                if (arr[j] == randomNumber) {
                    // 중복되면  check 를 true 로 바꿔라..
                    check = true;
                }
            }
            if (check == false) {
                arr[i] = randomNumber; // 중복되지 않았으니 배열에 담아라.
            } else {
                i--; // 중복됐으면 이번 회수는 무효로 하고 다시 뽑아라.
            }

        }
        return arr;
    }

    @Override
    public int createRandomNumber(int start, int end) {
        Random random = new Random();
        return random.nextInt(end) + start;
    }

}

class LottoMatch implements ILottoMatch {
    @Override
    public int findSame(int[] originLotto, int[] myLotto) {
        int[] oneLotto = new int[6];
        int[] twoLotto = new int[6];

        oneLotto = originLotto;
        twoLotto = myLotto;

        int count =0;

        for(int i =0;i<oneLotto.length;i++){
            if(oneLotto[i]==twoLotto[i]){
                count++;
            }
        }

        return count;
    }

    @Override
    public String rank(int count) {
        String rank = null;
        if(count==6){
            rank = "1등입니다.";
        }else if(count==5){
            rank = "2등입니다.";
        }else if(count==4){
            rank = "3등입니다.";
        }else if(count==3){
            rank = "4등입니다.";
        }else {
            rank = "꽝입니다.";
        }
        return rank;
    }

}




import java.util.*;

public class ArrayTest2 {
    /**
     * 최적화 문제 중 최대값 구하기
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("다음 시험에서 1등 학생의 이름과 점수를 구하세요");
        System.out.println("시험에 응시한 학생수는 몇명?");
        int studentNum = sc.nextInt();
        int[] score = new int[studentNum];
        System.out.println("응시한 학생의 이름과 점수를 입력하세요");
        String[] sutdentName = new String[studentNum];

//
//        for(int i=0;i<studentNum;i++){
//            System.out.println("이름 입력하세요");
//            sutdentName[i] = sc.next();
//            System.out.println("점수 입력하세요");
//            score[i] = sc.nextInt();
//        }



//        System.out.println("응시명단 : ");
        int max = 0;
        String bestName = "";
        for(int i=0;i<score.length;i++){
            System.out.println("이름 입력하세요");
            sutdentName[i] = sc.next();
            System.out.println("점수 입력하세요");
            score[i] = sc.nextInt();
            if(max < score[i]){
                max = score[i];
                bestName = sutdentName[i];
            }else{}
        }
        System.out.println("총 " + studentNum+"명 응시하였습니다.");
        System.out.println("학생명단 : ");

        for(int i=0;i<score.length;i++) {
            System.out.println((i+1)+". "+sutdentName[i]+" "+score[i]);
        }

        System.out.println("1등 "+bestName+", 점수는 "+max+"점 입니다.");
    }
}

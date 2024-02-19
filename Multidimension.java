import java.util.*;

public class Multidimension {
    /**
     * 최적화 문제 중 최대값 구하기
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("다음 시험에서 1등 학생의 이름과 점수를 구하세요");
        System.out.println("시험에 응시한 학생수는 몇명?");
        int studentNum = sc.nextInt();
        int[] score = new int[studentNum];
        String[] sutdentName = new String[studentNum];
        int max = 0;

        for(int ii=1;ii<3;ii++){
            int avg = 0;
//            System.out.println("응시한 학생의 이름과 점수를 입력하세요");
            for(int i=0;i<score.length;i++){
//                sutdentName[i] = sc.next();
                score[i] = (int)(Math.random()*100);
                avg += score[i];
                if(max< score[i]){
                    max = score[i];
                }else{}
            }
            avg /=score.length;
            System.out.println(ii+"반 명단 : "+Arrays.toString(score));
            System.out.printf(ii+"반의 평균점수 : %d, 1등 점수 : %d",avg, max);
            System.out.println("");
        }

    }
}
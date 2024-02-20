package gradeOOP;

import memberOOP.MemberModel;

import java.util.Arrays;
import java.util.Scanner;

public class GradeView {
    public static void main(String[] args) {

        GradeModel gradeModel = new GradeModel();
        Scanner sc = new Scanner(System.in);

        System.out.println("다음은 한 학생의 과목 점수이다.");

//        gradeModel.setStudentNum();
        System.out.printf("이름 : ");

        gradeModel.setName(sc.next());
        gradeModel.createKorScore();
        gradeModel.createEngScore();
        gradeModel.createMathScore();
        gradeModel.createAvgScore();

        System.out.println("평균 점수를 구하시오");

        System.out.println(" ============= 성적표 ==============");
        System.out.printf("이름 : %s\n",gradeModel.getname());
        System.out.printf("국어점수 : %d\n",gradeModel.getKorScore());
        System.out.printf("영어점수 : %d\n",gradeModel.getEngScore());
        System.out.printf("수학점수 : %d\n",gradeModel.getMathScore());
        System.out.printf("평균 점수: %d\n",gradeModel.getAvgScore());

    }
}
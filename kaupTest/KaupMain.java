package kaupTest;

import java.util.Random;

public class KaupMain {
    //카우프지수 구하는 프로그램
    //BMI = kg / 신장(m) * 신장(m)
    //150~200cm, 30~99kg
    //소수점 첫번째 자리에서 절삭
    public static void main(String[] args) {

        double randomvalue = Math.random();
        double metre = (double) (randomvalue *0.5) + 1.5;
        float kg = (float) (randomvalue * 69) +30;

        System.out.printf("체중 : %.2f,  키 : %.2f",kg,metre);
        System.out.println("");
        System.out.printf("BMI지수는 : %.2f ",(kg/(metre*metre)));
    }
}


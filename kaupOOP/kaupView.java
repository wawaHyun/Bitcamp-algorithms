package kaupOOP;

import java.util.Scanner;

public class kaupView {
    public static void main(String[] args) {
        Person ps = new Person();

        ps.createHeight();
        ps.createWeight();

        ps.setName(); //setName에서 sc받음

        ps.createBmi();
        ps.createBodymass();

        System.out.printf("이름 : %s\n",ps.getName());
        System.out.printf("신장 : %.2f\n",ps.getHeight());
        System.out.printf("체중 : %.2f\n",ps.getWeight());
        System.out.printf("BMI지수는 : %.2f.\n",ps.getBmi());
        System.out.printf("판단관결과 : %s\n",ps.getBodymass());



    }
}

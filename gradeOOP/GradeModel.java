package gradeOOP;

import java.util.Arrays;
import java.util.Scanner;

public class GradeModel {
    //    private int studentNum;
    private String name;
    private int korScore;
    private int engScore;
    private int mathScore;
    private int avgscore;

    public void setName(String name){
    this.name = name;
    }
    public String getname(){
        return name;
    }
    public void createKorScore(){
        this.korScore= (int) (Math.random()*100);
    }
    public int getKorScore(){
        return korScore;
    }
    public void createEngScore(){
        this.engScore = (int) (Math.random()*100);

    }
    public int getEngScore(){
        return engScore;
    }
    public void createMathScore(){
        this.mathScore = (int) (Math.random()*100);

    }
    public int getMathScore(){
        return mathScore;
    }
    public void createAvgScore(){
        this.avgscore = ((korScore+engScore+mathScore)/3);

    }
    public int getAvgScore(){
        return avgscore;
    }


}

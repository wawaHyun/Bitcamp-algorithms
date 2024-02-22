package memberOOP;

import java.util.Scanner;

public class Member {
    private String id;
    private int pw;
    private String name;
    private int socialNum;
    private int phoneNum;
    private String address;
    private double height;
    private double weight;


    //kaup지수에서 사용하는 생성자
    public Member(int height,int weight){
        this.height = height;
        this.weight = weight;
    }

    //회원가입에서 사용하는 생성자
    public Member(String id,int pw,String name,
                  int socialNum,int phoneNum,String address){
        System.out.println("입력순서 : ID,PW,이름,주민번호,폰번호,주소");
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.socialNum = socialNum;
        this.phoneNum = phoneNum;
        this.address = address;
    }
    @Override
    public String toString() {
        return "ID = " + id +
                "\nPW = " + pw +
                "\n이름 = " + name +
                "\n주민번호 = " + socialNum +
                "\n폰번호 = " + phoneNum +
                "\n주소 = " + address ;
    }


    public void createHeight(){
        this.height = (double) (Math.random()*0.5)+1.5;
    }
    public double getHeight(){
        return height;
    }
    //--------------------------        -----
    public void createWeight(){
        this.weight =(double) (Math.random()*69)+30;
    }
    public double getWeight(){
        return weight;
    }
    //-------------------------------


}
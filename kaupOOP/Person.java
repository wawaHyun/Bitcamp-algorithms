package kaupOOP;

import java.util.Scanner;

public class Person {
    private double height;
    private double weight;
    double bmi;
    String bodymass;

    private String name;
//-------------------------------
    public void createHeight(){
        this.height = (double) (Math.random()*0.5)+1.5;
    }
    public double getHeight(){
        return height;
    }
    //-------------------------------
    public void createWeight(){
        this.weight =(double) (Math.random()*69)+30;
    }
    public double getWeight(){
        return weight;
    }
    //-------------------------------
    public void createBmi(){ //유저로부터 값을 받지 않으니까 CRUD규칙에 따름
//        double bmi = 0.0;
        this.bmi=(weight / (height * height));
    }
    public double getBmi(){
        return this.bmi;
    }
    //-------------------------------
    public void setName(){ //이 method안에서 sc로 받음
        Scanner sc = new Scanner(System.in);
        this.name = sc.next();
    }
    public String getName(){
        return name;
    }
    //-------------------------------
    public void createBodymass(){ //유저로부터 값을 받지 않으니까 CRUD규칙에 따름
//        String bodymass = "";
        if(bmi<18.5) {
            bodymass="저체중";
        }else if(bmi<22.9){
            bodymass = "정상";
        }else if(bmi<24.9){
            bodymass = "위험제중";
        }else if(bmi<29.9){
            bodymass = "1단계 비만";
        }else {
            bodymass = "2단계 비만";
        }
//        this.bodymass = bodymass; //this는 생략가능
    }
    public String getBodymass(){
        return bodymass;
    }

}

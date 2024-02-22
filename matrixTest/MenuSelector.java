package matrixTest;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MenuSelector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String menu = sc.next();
        switch (menu){
            case "1" :
                System.out.println("생성");
                return;
            case "0" :
                System.out.println("종료");
                break;
        }


//        while (true){
//            System.out.println("테스트출력");
//            String menu = sc.next();
//            if(menu.equals("0")){
//                System.out.println("0 종료한다");
//                return;
//            }else{
//                System.out.println("반복");
//                continue;
//            }
//        }


    }
}

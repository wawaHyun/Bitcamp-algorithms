import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner scanner = new Scanner(System.in);

        System.out.println("아래 항목을 순서대로 입력하여 주세요.");
        System.out.printf("ID : ");
        String ID = scanner.next();
        System.out.printf("PW : ");
        String PW = scanner.next();
        System.out.printf("PW확인 : ");
        String PWre = scanner.next();
        System.out.printf("이름 : ");
        String name = scanner.next();
        System.out.printf("주민번호 : ");
        String socialnum = scanner.next();
        System.out.printf("전화번호 : ");
        String callnum1 = scanner.next();
        String callnum2 = scanner.next();
        String callnum3 = scanner.next();
        System.out.printf("주소 : ");
        String blank = scanner.next();
        String adress = scanner.nextLine();


        System.out.println("ID : "+ID);
        System.out.println("PW : " +PW);
        System.out.println("비번확인 : "+PWre);
        System.out.println("이름 : "+name);
        System.out.println("주민번호 : "+socialnum);
        System.out.println("폰번호 : " +callnum1+"-"+callnum2+"-"+callnum3);
        System.out.println("주소 : " +adress);


    }
}
package memberOOP;

import java.util.Scanner;
public class MemberView {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("아래 항목을 순서대로 입력하여 주세요.");

        Member mbModel = new Member(sc.next(), sc.nextInt(),
                sc.next(), sc.nextInt(),sc.nextInt(), sc.next());

        //입력 값
        //jaja 998 jainname 66666 010555 adressUU

        System.out.printf(mbModel.toString());

    }
}
package memberOOP;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MemberView {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sc = new Scanner(System.in);
        MemberModel mbModel = new MemberModel();

        System.out.println("아래 항목을 순서대로 입력하여 주세요.");
        mbModel.setId(sc.next());
        mbModel.setPw(sc.nextInt());
        mbModel.setName(sc.next());
        mbModel.setsocialNum(sc.nextInt());
        mbModel.setphoneNum(sc.nextInt());
        mbModel.setadress(sc.next());


        //jaja 658 jainname 66666 010555 adressUU

        System.out.printf("ID : %s\nPW : %d\n이름 : %s\n", mbModel.getId(),mbModel.getPw(),mbModel.getname());
        System.out.printf("주민번호 : %d\n폰번호 : %d\n주소 : %s\n", mbModel.getsocialNum(),mbModel.getphoneNum(),mbModel.getadress());


    }
}
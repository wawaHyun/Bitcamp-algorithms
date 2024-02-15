import java.sql.SQLOutput;
import java.util.*;


public class calculator {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

        System.out.printf("숫자를 입력하세요.");
        String int1  = sc.next();
        System.out.printf("더할 숫자를 입력하세요.");
        String int2 = sc.next();
        System.out.printf("+,-를 입력하세요");
        String opcode = sc.next();

        String result = "난 문자~!";
        int result2 = 1;

        int intnum1 = Integer.parseInt(int1);
        int intnum2 = Integer.parseInt(int2);

        if(opcode.equals("+")){
           result = int1 + int2;
           result2 = intnum1 +  intnum2;
           System.out.println("문자와 문자를 결한한 값(result) : "+ int1 + opcode + int2 + " = ");


        }else if (opcode.equals("-")) {
            result = "result의 타입은 문자라서 - 계산되지 않습니다";
            result2 = intnum1 - intnum2;

        }else{
                System.out.println("잘못된 연산자입니다.");
                //St.ring resuit = int1 - int2;
            }

        System.out.println(result);
        System.out.println("문자를 정수로 강제변환(result2) : "+ intnum1 + opcode + intnum2 +" = "+result2);

        }
    }

import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("숫자4개를 입력하세요");

        int a= 3;
        int[] arr = {1,2,66,3,4,10,56};
            System.out.println("arr의 길이 : "+ arr.length);

        for (int i = 0; i<=arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}

package methodTest;
import java.util.*;
public class Howold {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<3;i++){
            int old = inputold(sc);
            System.out.println("나이 : "+old);

        }
    }

    static int inputold(Scanner sc){
        System.out.println("나이는? ");
        return sc.nextInt();
    }
}

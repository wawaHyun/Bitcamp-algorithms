package methodTest;

public class RamdomTest {
    static int returnRandom(){
        int randomNumber = (int)(Math.random()*100);
        System.out.printf(" ",randomNumber);
        return 80;
    }
    public static void main(String[] args) {
        int ramdomNumber = returnRandom();
        System.out.println("리턴된 값 : "+ramdomNumber);


    }
}
package matrixTest;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String[][] arr = new String[1][9];
        int k = 1;

        //행렬에 값 넣기
        for(int i=0;i<2;i++){
            for(int ii=0;ii<9;ii++){
                arr[i][ii] = (i+2)+" * "+(ii+1)+" = "+((i+2)*(ii+1));
//                arr[i][ii] = k;
//                k++;
            }
        }

//        for(int i=0;i<arr.length;i++){
//            for(int ii=0;ii<arr.length;ii++){
//                System.out.printf(arr[i][ii]+" ");
//                if(i)%5==0){
//                    System.out.printf("\n");
//                }else{}
//            }
//        }




    }
}

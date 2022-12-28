package DoitAlgorithm.Practice.chap03;

import java.util.Arrays;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("요솟값 : ");
        int num = sc.nextInt();
        int[] x = new int[num];

        System.out.println("오름차순으로 입력하세요.");

        System.out.print("x[0] : ");
        x[0] = sc.nextInt();

        for(int i = 1; i < num; i++){
            do {
                System.out.print("x[" + i + "] :");
                x[i] = sc.nextInt();
            }while (x[i] < x[i - 1]);
        }

        System.out.print("검색 값 : ");
        int ky = sc.nextInt();

        int idx = Arrays.binarySearch(x, ky);

        if(idx < 0){
            int isPoint = -idx -1;
            System.out.println("그 값의 요소는 존재하지 않습니다.");
            System.out.printf("삽입 포인트는 %d입니다. \n", isPoint);
            System.out.printf("x[%d]의 바로 앞의 %d을(를) 삽입하면 배열의 정렬상태가 유지 됩니다.", isPoint, ky);
        }
        else {
            System.out.println("그 값은 x[" + idx + "]에 있습니다.");
        }
    }



}

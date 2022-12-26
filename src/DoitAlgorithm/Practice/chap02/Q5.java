package DoitAlgorithm.Practice.chap02;

import java.util.Scanner;

public class Q5 {
    static void reversecopy(int[] a, int[] b){
        int num = a.length <= b.length ? a.length : b.length;
        for(int i = 0; i < num ; i++){
            a[i] = b[b.length -i -1];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("a의 요솟수는 :");
        int numa = sc.nextInt();
        int[] a = new int[numa];
        for(int i = 0; i < numa; i++){
            System.out.print("a[" + i + "] :");
            a[i] = sc.nextInt();
        }

        System.out.print("b의 요솟수는 :");
        int numb = sc.nextInt();
        int[] b = new int[numb];
        for(int i = 0; i < numb ; i++){
            System.out.print("b[" + i + "] :");
            b[i] = sc.nextInt();
        }

        reversecopy(a, b);


        System.out.println("배열 b의 모든 요소를 배열 a에 copy 했습니다.");
        for(int i = 0; i < numa; i++){
            System.out.println("a[" + i + "] = " + a[i]);
        }
    }
}





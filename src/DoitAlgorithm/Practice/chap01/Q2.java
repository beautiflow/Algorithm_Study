package DoitAlgorithm.Practice.chap01;

// 세 값의 최솟값을 구하는 min3 메서드 작성하기
// static int min3(int a, int b, int c)

import java.util.Scanner;

public class Q2 {

    static int min3(int a, int b, int c){
        int min = a;

        if(b<min){
            min = b;
        }
        if(c<min){
            min = c;
        }

        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("세 수의 최솟값을 구합니다.");
        System.out.print("a의 값: "); int a = sc.nextInt();
        System.out.print("b의 값: "); int b = sc.nextInt();
        System.out.print("c의 값: "); int c = sc.nextInt();

        int min = min3(a,b,c);
        System.out.println("최솟값은 " + min + "입니다.");
    }
}

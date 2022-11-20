package DoitAlgorithm.Practice.chap01;

// 네 값의 최솟값을 구하는 min4 메서드 작성하기
// static int min4(int a, int b, int c, int d)

import java.util.Scanner;

public class Q3 {
    static int min4(int a, int b, int c, int d){
        int min = a;

        if(b<min){
            min = b;
        }
        if(c<min){
            min = c;
        }
        if(d<min){
            min = d;
        }

        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("네 수의 최솟값을 구합니다.");
        System.out.print("a의 값: "); int a = sc.nextInt();
        System.out.print("b의 값: "); int b = sc.nextInt();
        System.out.print("c의 값: "); int c = sc.nextInt();
        System.out.print("d의 값: "); int d = sc.nextInt();

        int min = min4(a,b,c,d);
        System.out.println("최솟값은 " + min + "입니다.");
    }
}

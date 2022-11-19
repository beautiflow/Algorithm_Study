package DoitAlgorithm.Practice.chap01;

// 네 값의 최댓값을 구하는 메서드 작성하기
// static int max4(int a, int b, int c, int d)

import java.util.Scanner;

public class Q1 {

    static int max4(int a, int b, int c, int d){
        int max = a;
        if(b>max){
            max = b;
        }
        if(c>max){
            max = c;
        }
        if(d>max){
            max = d;
        }

        return max;
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("네 수의 최댓값을 구합니다.");
        System.out.print("a의 값: "); int a = sc.nextInt();
        System.out.print("b의 값: "); int b = sc.nextInt();
        System.out.print("c의 값: "); int c = sc.nextInt();
        System.out.print("d의 값: "); int d = sc.nextInt();

        int max = max4(a,b,c,d);

        System.out.println("최댓값은 " + max + "입니다.");
      }
    }



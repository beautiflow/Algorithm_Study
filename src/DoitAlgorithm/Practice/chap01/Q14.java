package DoitAlgorithm.Practice.chap01;

import java.util.Scanner;

public class Q14 {

    static void triangleLB(int n){ // 왼쪽 아래가 직각인 삼각형
        for(int i = 1; i <= n ; i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void triangleLU(int n){  // 왼쪽 위가 직각인 삼각형
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i+1; j++ ){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void triangleRU(int n){ // 오른쪽 위가 직각인 삼각형
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i -1; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= n-i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void triangleRB(int n){ // 오른쪽 아래가 직각인 삼각형
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do{
            System.out.println("단수는 :");
            n = sc.nextInt();
        }while (n <= 0);

        System.out.println("왼쪽 아래 직각삼각형");
        triangleLB(n);

        System.out.println("왼쪽 위 직각삼각형");
        triangleLU(n);

        System.out.println("오른쪽 위 직각 삼각형");
        triangleRU(n);

        System.out.println("오른쪽 아래 직각 삼각형");
        triangleRB(n);
    }
}

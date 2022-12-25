package DoitAlgorithm.Practice.chap01;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("양의 정수값의 자릿수를 구합니다.");

        int n;

        do{
            System.out.println("양의 정수값 : ");
            n = sc.nextInt();
        }while (n<=0);

        int count = 0;
        while (n > 0){
            n /= 10;
            count ++;
        }

        System.out.println("그 수는" + count + "자리입니다.");
    }
}

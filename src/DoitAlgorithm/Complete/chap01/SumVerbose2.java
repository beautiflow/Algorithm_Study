package DoitAlgorithm.Complete.chap01;

import java.util.Scanner;

public class SumVerbose2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ;
        System.out.println("1부터 n까지의 합을 구한다.");

        do{
            System.out.print("n값 : ");
            n = sc.nextInt();
        }while (n <= 0);

        int sum = 0;  // 합

        for(int i = 1; i < n; i++){
            System.out.print(i + " + ");
            sum += i;  // sum 에 i를 더함
        }

        System.out.print(n + " = ");
        sum += n;   // sum 에 n을 더함
        System.out.println(sum);
    }
}

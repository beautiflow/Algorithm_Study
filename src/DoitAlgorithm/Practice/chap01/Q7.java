package DoitAlgorithm.Practice.chap01;//package DoitAlgorithm.Practice.chap01;
//
//import java.util.Scanner;
//
//public class Q7 {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("1에서 n까지의 총합을 구합니다.");
//        System.out.print("n의 값: ");
//        int n = sc.nextInt();
//
//        int sum = (n + 1) * (n / 2) + (n % 2 == 1 ? (n + 1) / 2 : 0); //총합
//
//        System.out.println("1에서 "+ n + "까지의 총합은 " + sum + "입니다.");
//    }
//}

import java.util.Scanner;

class SumGauss {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("1에서 n까지의 총합을 구합니다.");
        System.out.print("n의 값 : ");
        int n = stdIn.nextInt();

        int sum = (n + 1) * (
                n / 2) + (n % 2 == 1 ? (n + 1) / 2 : 0);     // 총합

        System.out.println("1에서 " + n + "까지의 총합은 " + sum + "입니다.");
    }
}




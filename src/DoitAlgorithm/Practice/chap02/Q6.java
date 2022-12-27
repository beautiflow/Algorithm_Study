package DoitAlgorithm.Practice.chap02;

import java.util.Scanner;

public class Q6 {
    static int cardConv(int x, int r, char[] d){
        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do{
            d[digits++] = dchar.charAt(x % r);
            x /= r;
        }while (x != 0);

        for(int i = 0; i < digits; i++){
            char t = d[i];
            d[i] = d[digits - i - 1];
            d[digits - i - 1] = t;
        }
        return digits;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int no; // 변환하는 정수
        int cd; // 기수
        int dno; // 변환후의 자릿수
        int retry; // 다시 시도
        char[] cno = new char[32];  // 변환 후 각 자리의 숫자를 넣어두는 문자배열

        System.out.println("10진수를 기수 변환합니다.");
        do{
            do{
                System.out.println("변환하는 음이 아닌 정수 : ");
                no = sc.nextInt();
            }while ( no < 0);

            do{
                System.out.println("어떤 진수로 변활할까요?");
                cd = sc.nextInt();
            }while (cd < 2 || cd > 36);

            dno = cardConv(no, cd, cno);   // no 를 cd 진수로 변환

            System.out.println(cd + "진수로");
            for(int i = 0; i < dno ; i++){
                System.out.print(cno[i]);
            }
            System.out.print("입니다.");

            System.out.println("한번 더 할 까요? (1... 예 / 0 ... 아니요)");
            retry = sc.nextInt();
        }while (retry == 1);
    }
}

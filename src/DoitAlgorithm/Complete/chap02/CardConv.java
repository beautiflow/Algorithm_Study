package DoitAlgorithm.Complete.chap02;

import java.util.Scanner;

public class CardConv {
    // 정숫값 x 를 r 진수로 변환하여 배열 d 에 아랫자리부터 넣어 두고 자릿수를 반환
    static int cardConv(int x, int r, char[] d){
        int digits = 0;  // 변환 후의 자릿수
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do{
            d[digits++] = dchar.charAt(x % r);  // r 로 나눈 나머지를 저장
            x /= r;
        }while (x != 0);

        for(int i = 0; i < digits / 2 ; i++){  // 배열 d 의 숫자 문자열을 역순으로 정렬
            char t = d[i];
            d[i] = d[digits - i - 1];
            d[digits - i - 1] = t;

        }
        return digits;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no;  // 변환하는 정수
        int cd;  // 기수
        int dno; // 변환후의 자릿수
        int retry; // 다시 한번 ?
        char[] cno = new char[32];  // 변환 후 각 자리의 숫자를 넣어 두는 문자 배열

        System.out.println("10진수를 기수 변환 합니다.");
        do{
            do{
                System.out.println("변환하는 음이 아닌 정수 :");
                no = sc.nextInt();
            }while (no < 0);

            do{
                System.out.println("어떤 진수로 변환할까요? ");
                cd = sc.nextInt();
            }while (cd < 2 || cd > 36);

            dno = cardConv(no, cd, cno);  // no를 cd 진수로 변환

            System.out.println(cd + "진수로 ");
            for(int i = 0; i < dno; i++){
                System.out.println(cno[i]);
            }
            System.out.println("입니다.");

            System.out.println(" 한 번 더 할까요? (1...예 / 0... 아니요):");
            retry = sc.nextInt();
        }while (retry == 1);
    }
}

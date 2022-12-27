package DoitAlgorithm.Complete.chap03;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class SeqSearchFor {
    // 요솟수가 n인 배열 a에서 key와 값이 같은 요소를 선형 검색
    static int seqSearch(int[] a, int n, int key){
        for(int i = 0; i < n; i++){
            if(a[i] == key){
                return i;  // 검색 성공(인덱스 반환)
            }
        }
        return -1; // 검색 실패 (-1 반환)
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = sc.nextInt();
        int[] x = new int[num];

        for(int i = 0; i < num; i++){
            System.out.print("x[" + i + "] :");
            x[i] = sc.nextInt();
        }

        System.out.print("검색할 값 : ");
        int ky = sc.nextInt();

        int idx = seqSearch(x, num, ky);  // 배열 x 에서 값이 ky인 요소를 검색

        if(idx == -1){
            System.out.println("그 값의 요소가 없습니다.");
        }
        else {
            System.out.println("그 값은 x[" + idx + "]에 있습니다.");
        }
    }
}

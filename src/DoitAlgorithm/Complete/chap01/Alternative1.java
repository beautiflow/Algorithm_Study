package DoitAlgorithm.Complete.chap01;
// + 와 - 를 번갈아 출력 (1)
import java.util.Scanner;

public class Alternative1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("+와 -를 번갈아 n개 출력합니다.");

        do{
            System.out.print("n값: ");
            n = sc.nextInt();
        }while (n <= 0);

        for(int i = 0; i < n; i++){
            if(i % 2 == 0){
                System.out.println("+");
            }
            else {
                System.out.println("-");
            }
        }
    }
}

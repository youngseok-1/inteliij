package test0913;
import java.util.Scanner;


    public class Application1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("피라미드의 높이를 입력하세요 : ");
            int height = sc.nextInt();

            for (int i = 1; i <= height; i++) {
                // 왼쪽 공백 출력
                for (int j = height - i; j > 0; j--) {
                    System.out.print(" ");
                }
                // 숫자 출력
                for (int k = 1; k <= i; k++) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
        }
    }

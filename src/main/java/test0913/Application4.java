package test0913;

import java.util.Scanner;

public class Application4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("원하는 트리 높이를 숫자로 입력하세요: ");
        int height = sc.nextInt();

        for (int i = 1; i <= height; i++) {
            // 왼쪽 공백 출력
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }
            // 별 출력
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}
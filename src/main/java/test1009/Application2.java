package test1009;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. 사용자 입력 받기
        System.out.print("숫자를 입력하세요: ");
        int userInput = scanner.nextInt();

        // 2. 배열 생성 (1~9까지의 값을 사용해 곱한 값)
        int[] resultArray = new int[9];
        for (int i = 0; i < 9; i++) {
            resultArray[i] = userInput * (i + 1); // 1~9까지 곱한 값
        }

        // 3. 향상된 for문을 사용해 배열 출력
        System.out.println("배열의 값:");
        for (int value : resultArray) {
            System.out.print(value + " ");
        }
    }
}

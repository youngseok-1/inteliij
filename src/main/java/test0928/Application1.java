package test0928;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("배열의 크기를 입력하세요 (1 이상의 정수): ");
        int size = scanner.nextInt();

        if (size < 1) {
            System.out.println("잘못된 입력입니다. 배열의 크기는 1 이상이어야 합니다.");
            return;
        }

        int[] numbers = new int[size];

        // 배열에 값 입력 받기
        System.out.println(size + "개의 정수를 입력하세요: ");
        for (int i = 0; i < size; i++) {
            System.out.print((i + 1) + "번째 숫자: ");
            numbers[i] = scanner.nextInt();
        }

        // 최대값과 최소값 초기화
        int max = numbers[0];
        int min = numbers[0];
        int maxIndex = 0;
        int minIndex = 0;

        // 최대값과 최소값 찾기
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                maxIndex = i;
            }
            if (numbers[i] < min) {
                min = numbers[i];
                minIndex = i;
            }
        }

        // 결과 출력
        System.out.println("최대값: " + max + ", 위치: " + maxIndex);
        System.out.println("최소값: " + min + ", 위치: " + minIndex);

        scanner.close();
}
    }

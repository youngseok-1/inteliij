package test1009;

import java.util.Scanner;

public class Application {public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 첫 번째 숫자 입력
    System.out.print("첫 번째 숫자를 입력하세요: ");
    int firstNumber = sc.nextInt();

    // 두 번째 숫자 입력
    System.out.print("두 번째 숫자를 입력하세요: ");
    int secondNumber = sc.nextInt();

    // 숫자를 뒤집음
    int reversedFirst = reverseNumber(firstNumber);
    int reversedSecond = reverseNumber(secondNumber);

    // 결과 출력
    System.out.println("뒤집힌 첫 번째 숫자: " + reversedFirst);
    System.out.println("뒤집힌 두 번째 숫자: " + reversedSecond);

    // 두 숫자를 더한 합계 출력
    int sum = reversedFirst + reversedSecond;
    System.out.println("두 숫자의 합계: " + sum);
}

    // 숫자를 뒤집는 메서드
    public static int reverseNumber(int number) {
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10; // 마지막 자리 숫자 추출
            reversed = reversed * 10 + digit; // 뒤집힌 숫자를 만듦
            number /= 10; // 원래 숫자를 한 자리 줄임
        }

        return reversed;
    }
}

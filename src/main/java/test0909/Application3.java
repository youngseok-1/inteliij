package test0909;

import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {
        // 1~10까지의 정수를 입력했을 때 입력값이 배열의 길이가 되고 그 배열의 길이만큼 생성된 난수가
        // 새로운 배열의 길이를 정하게 한 배열을 출력하시오.
        // 배열의 내용은 0이지만 갯수는 난수에 의해 정해져야 함
        // 출력 예시 : 0, 0, 0, 0, 0, 0, 0, 0,
        // 1~10이 아닐 경우 "제대로 된 숫자를 입력해주세요."가 나타나도록 함
        // 만약 내가 7이라는 정수를 넣었으면 1~7까지의 난수를 발생시키도록 한다.

        System.out.println("1부터 10까지의 정수를 입력해주세요. : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number >= 1 && number <= 10) {
            // 1부터 number까지의 난수 생성
            int randomLength = (int)(Math.random() * number) + 1; // 1부터 number까지의 난수

            // 난수로 배열 생성
            int[] array = new int[randomLength];

            // 배열의 값 출력 (모두 0으로 초기화되어 있음)
            System.out.println("생성된 배열: ");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + ",");
            }
        } else {
            System.out.println("제대로 된 숫자를 입력해주세요.");
        }
    }
}
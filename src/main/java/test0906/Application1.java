package test0906;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("for 문자열 입력 :");
        String str = sc.nextLine();
        String result = ""; // 문자열을 담아야하니 String으로
        for (int i = 0; i < str.length(); i++) {
            result += str.charAt(i); // 문자열을 담고 다시 for로 돌아감.
            System.out.println(result); // 마지막 문자열까지 담으면 출력.

        }

    }
}
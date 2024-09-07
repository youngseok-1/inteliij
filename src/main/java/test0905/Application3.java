package test0905;

import java.util.Scanner;
import java.lang.Math;

public class Application3 {
    public static void main(String[] args) {
        // 0~15 범위의 난수를 생성하고
        // 난수가 10 이상일 경우 "당첨입니다." 10 미만일 경우 "아쉽네요"를 반환하세요.
        Scanner sc = new Scanner(System.in);
        int number = (int) (Math.random() * 16);
        System.out.println("생성된 난수: " + number);

        if (number >= 10) {
            System.out.println("당첨입니다.");
        } else {
            System.out.println("아쉽네요.");
        }
    }
}
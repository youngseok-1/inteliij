package test0905;

import java.util.Scanner;

public class Math {
    //  숫자를 입력 받아 짝수이면 "입력하신 숫자는 짝수입니다." 출력하고,
    //  홀수이면 "입력하신 숫자는 홀수입니다." 출력
    //  단, 0이면 "0입니다." 라고 출력하세요.
    //  조건과 상관 없이 프로그램이 종료될 때 "프로그램을 종료합니다." 라고 출력되도록 한다.
    //  자바스크립트 명을 Application이라고 지정하고 Math 자바스크립트 파일을 만들어 메소드를 호출시킨다.
    public void math() {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 하나 입력해주세요");
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("입력하신 숫자는 짝수입니다.");
        } else if (number % 2 != 0) {
            System.out.println("입력하신 숫자는 홀수입니다.");
        } else {
            System.out.println("0입니다.");
        }

        System.out.println("프로그램을 종료합니다.");
    }
}

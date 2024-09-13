package test0910_2;

import java.util.Scanner;

public class Person {
    public void runApp(Phone phone) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("===== 어플 실행 중 =====");
            System.out.println("1. 어플 종료");
            System.out.println("2. 핸드폰 종료");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("어플을 종료합니다.");
                    return; // 어플 종료하고 메인으로 돌아감
                case 2:
                    System.out.println("핸드폰을 종료합니다.");
                    phone.powerOff();
                    return; // 핸드폰 종료 후 메인 메뉴로 돌아감

            }
        }
    }
}

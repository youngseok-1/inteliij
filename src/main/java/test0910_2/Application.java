package test0910_2;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Phone phone = new Phone();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("===== 휴대폰 메뉴 =====");
            System.out.println("1. 휴대폰 켜기");
            System.out.println("2. 패턴풀기");
            System.out.println("3. 어플 실행");
            System.out.println("4. 휴대폰 종료");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    phone.powerOn();
                    break;
                case 2:
                    phone.unlockPattern();
                    break;
                case 3:
                    phone.runApp();
                    break;
                case 4:
                    phone.powerOff();
                    return; // 프로그램 종료
            }
        }
    }
}

package test0905;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {

        System.out.println(" 1. apple      2. banana");
        System.out.print("과일을 선택해주세요 : ");

        Scanner sc = new Scanner(System.in);
        String select = sc.nextLine();

        switch (select) {
            case "1":
            case "apple":
                System.out.println("선택하신 것은 apple입니다.");
                System.out.println("선택하신 것은 banana입니다.");
                break;

            case "2":
            case "banana":
                System.out.println("선택하신 것은 apple입니다.");
                System.out.println("선택하신 것은 banana입니다.");
                break;

            default:
                System.out.println("올바른 값을 입력해주세요.");
                break;
        }
    }
}
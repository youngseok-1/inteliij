package test0909;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Application2 app2 = new Application2();
        app2.fruit();
    }

    public void fruit() {
        // 배열 선언
        String[] fruits = new String[5];
        Scanner sc = new Scanner(System.in);

        // 반복문을 이용하여 과일을 배열에 입력
        for (int i = 0; i < fruits.length; i++) {
            System.out.println((i+1) + "번째 과일을 입력해주세요 : ");
            fruits[i] = sc.nextLine();
        }

        // 결과
        System.out.print("내가 좋아하는 과일은 ");
        for (int i = 0; i < fruits.length; i++) {
                System.out.print(fruits[i] + " ");
            }
        }
    }

package test0906;

import java.util.Scanner;

public class Application3 {
    public void gugudan() {
        // 연산자 입력을 안내
        System.out.println("+, -, *, /, % 중 하나를 입력하세요: ");
        Scanner sc = new Scanner(System.in);
        char op = sc.next().charAt(0);  // 연산자 입력받기

        // 2단부터 9단까지 출력하는 구구단 반복문
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                int result = 0;

                // 입력된 연산자에 따라 연산 수행
                switch (op) {
                    case '+':
                        result = i + j;
                        break;
                    case '-':
                        result = i - j;
                        break;
                    case '*':
                        result = i * j;
                        break;
                    case '/':
                        if (j != 0) {  // 나누기에서 0으로 나누는 경우 방지
                            result = i / j;
                        } else {
                            System.out.println("0으로 나눌 수 없습니다.");
                            continue;
                        }
                        break;
                    case '%':
                        if (j != 0) {  // 나머지 연산에서 0으로 나누는 경우 방지
                            result = i % j;
                        } else {
                            System.out.println("0으로 나눌 수 없습니다.");
                            continue;
                        }
                        break;
                    default:
                        System.out.println("잘못된 연산자 입력입니다.");
                        return;  // 잘못된 입력 시 프로그램 종료
                }

                // 계산 결과 출력
                System.out.println(i + " " + op + " " + j + " = " + result);
            }
            System.out.println();  // 단마다 줄바꿈
        }
    }
}
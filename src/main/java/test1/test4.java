package test1;

public class test4 {
    public static void main(String[] args) {
         /*
        정수형 2개 선언, 실수형 2개 선언 후 정수형은 왼쪽의 피연산자로, 실수형은 오른쪽의 피연산자로 놓고
        AND 논리 연산자를 통해 true를 반환하시오.
        */
        int num1 = 3;
        int num2 = 4;
        double num3 = 6.5;
        double num4 = 9.4;

        System.out.println((num1<num2) && (num3<num4));
    }
}

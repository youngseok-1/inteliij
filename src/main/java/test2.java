public class test2 {
    public static void main(String[] args) {

        /*
        주어진 byte를 이용해 오버플로우를 사용해서 -125를 나타내고
        그 값에 * 0.951을 하고 그 값을 다시 정수형으로 변경 및 양수로 변경하시오.
        */

        byte num1 = 127;
        num1++;
        num1++;
        num1++;
        num1++;

        System.out.println("오버플로우 : " + (num1));
        double num2 = (num1 * 0.951);
        System.out.println("곱한 값 : " + (num2));
        int num3 = (int)num2;
        System.out.println("정수형으로 변경된 값 : " + (num3));
        int num4 = (num3 * -1);
        System.out.println("양수로 변경된 값 : " + (num4));


    }
}

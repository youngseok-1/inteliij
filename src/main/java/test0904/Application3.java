package test0904;

public class Application3 {
    public static void main(String[] args) {


        int num1 = Math.abs(-25);
        System.out.println("-25의 절대값 : " + num1);


        int random = (int) (Math.random() * 41) - 20;  // -20 ~ 20까지의 숫자를 생성
        System.out.println("생성된 난수: " + random);


        if (random > 0) {
            System.out.println("양수입니다.");
        } else if (random < 0) {
            System.out.println("음수입니다.");
        } else {
            System.out.println("0입니다.");
        }
    }
}
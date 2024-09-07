package test0904;

import java.util.Random;

public class Application1 {

    public static void main(String[] args) {
        // 5부터 10까지 난수 random1에
        Random random1 = new Random();
        int randomNumber1 = random1.nextInt(6) + 5;
        System.out.println(randomNumber1);
        Random random2 = new Random();
        // 10부터 15까지 난수 ramdom2에
        int randomNumber2 = random2.nextInt(6) + 10;
        System.out.println(randomNumber2);
        // 두개의 난수를 더한 값을 표시해라
        int result = (randomNumber1 + randomNumber2);
        System.out.println("더한 값은" + (result) +"입니다.");
    }
}

package test0928;

import java.util.ArrayList;
import java.util.Random;

public class Application2 {
    public static void main(String[] args) {
        // ArrayList에 랜덤 숫자를 넣는 메소드 호출
        ArrayList<Integer> randomNumbers = generateRandomNumbers();

        // ArrayList 출력 (얕은 복사를 사용하여 출력)
        ArrayList<Integer> shallowCopy = new ArrayList<>(randomNumbers);
        System.out.println("생성된 랜덤 숫자들: " + shallowCopy);
    }

    // 1 ~ 50 사이의 랜덤 숫자를 7개 생성하여 ArrayList에 넣는 메소드
    public static ArrayList<Integer> generateRandomNumbers() {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        while (numbers.size() < 7) {
            int randomNumber = random.nextInt(50) + 1;  // 1 ~ 50 사이의 랜덤 숫자 생성
            if (!numbers.contains(randomNumber)) {      // 중복된 숫자 방지
                numbers.add(randomNumber);
            }
        }

        return numbers;
    }
}

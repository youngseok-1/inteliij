import java.util.Scanner;

public class Application4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 두 수 X와 Y를 입력받는다.
        System.out.print("첫 번째 수 X를 입력하세요: ");
        int X = scanner.nextInt();
        System.out.print("두 번째 수 Y를 입력하세요: ");
        int Y = scanner.nextInt();

        // 두 수를 역순으로 바꾸고 더한 후 그 결과를 다시 역순으로 바꾼다.
        int revX = reverseNumber(X);
        int revY = reverseNumber(Y);
        int sum = revX + revY;
        int result = reverseNumber(sum);

        // 결과 출력
        System.out.println("Rev(Rev(X) + Rev(Y))의 결과는: " + result);

        scanner.close();
    }

    // 숫자를 역순으로 뒤집는 함수
    public static int reverseNumber(int number) {
        int reversed = 0;
        while (number > 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;

    }

}
import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 비밀번호 설정 (여기서는 "123"으로 설정)
        String correctPassword = "123";

        while (true) {
            System.out.println("비밀번호를 한 자리씩 입력하세요.");

            // 세 자리의 비밀번호를 한 자리씩 입력받아 저장
            StringBuilder inputPassword = new StringBuilder();
            for (int i = 0; i < 3; i++) {
                System.out.print((i + 1) + "번째 자리 입력: ");
                int digit = scanner.nextInt();
                inputPassword.append(digit);
            }

            // 입력한 비밀번호와 설정된 비밀번호 비교
            if (inputPassword.toString().equals(correctPassword)) {
                System.out.println("비밀번호가 맞습니다. 성공했습니다!");
                break; // 비밀번호가 맞으면 루프 종료
            } else {
                System.out.println("비밀번호가 틀렸습니다. 처음부터 다시 입력하세요.\n");
            }
        }

        scanner.close();
    }
}
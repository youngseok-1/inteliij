import java.util.Scanner;

public class Application5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 체스판 상태 입력 받기
        char[][] board = new char[8][8];
        System.out.println("체스판 상태를 입력하세요 ('.'은 빈 칸, 'F'는 말이 있는 칸):");
        for (int i = 0; i < 8; i++) {
            String line = scanner.nextLine();
            for (int j = 0; j < 8; j++) {
                board[i][j] = line.charAt(j);
            }
        }

        int count = 0;

        // 하얀 칸에 말이 있는 경우를 세기
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                // (i + j)가 짝수인 경우 하얀 칸
                if ((i + j) % 2 == 0 && board[i][j] == 'F') {
                    count++;
                }
            }
        }

        // 결과 출력
        System.out.println("하얀 칸 위에 있는 말의 수: " + count);

        scanner.close();
    }
}
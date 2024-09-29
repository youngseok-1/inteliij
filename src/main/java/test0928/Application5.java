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



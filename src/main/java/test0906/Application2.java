package test0906;

public class Application2 {
    public static void main(String[] args) {
        //2단부터 9단까지의 구구단을 출력하는 프로그램을 작성하세요.
        // 단, 각 단에서 곱하는 숫자(su)가 4보다 큰 경우 출력하지 않으며,
        // 각 단에서 2로 나누어 떨어지는 결과는 출력하지 않는다. (continue 쓰시면 좋습니다.)
        // ---- 출력 --------
//        3 * 1 = 3
//        3 * 3 = 9
//        5 * 1 = 5
//        5 * 3 = 15
//        7 * 1 = 7
//        7 * 3 = 21
//        9 * 1 = 9
//        9 * 3 = 27

        for(int dan = 2; dan < 10; dan++) {
            for(int su = 1; su < 10; su++) {
                if(su > 4) {
                    break;
                }
                if ((dan * su) % 2 == 0){
                    continue;
                }
                System.out.println(dan + " * " + su + " = " + (dan * su));
            }
        }
    }
}

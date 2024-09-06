package test1;

public class test3 {
    public static void main(String[] args) {
        //         인조이조의 총합 점수를 계산하려고 한다. 최종점수가 정수(int)로 나오도록 만들어라 프로젝트퀄리티의 최고점은 D이다.
//         최종점수 계산법 = 랭킹 : 1등 10점, 2등 8점, 3등 6점 / 퀄리티점수 : 유니코드 숫자 / 프로젝트점수 스코어 곱하기 프로젝트갯수
//         인조이 조의 랭킹은 1등(byte), 프로젝트수는 3개(long), 스코어는 95.8(float), 퀄리티는 D(char)이다.
        // 최종점수 랭킹은 10점, 퀄리티 점수는 68점 (D) 프로젝트점수 95.8 x 3

        byte rank1 = 10;
        int rank2 = (int)rank1;
        System.out.println("랭킹점수는 " + (rank2) + "입니다.");

        char quality = 'D';
        int quality2 = (int)quality;
        System.out.println("퀄리티점수는 " + (quality2) + "입니다.");

        float project = (95.8f * 3);
        int project2 = (int)project;
        System.out.println("프로젝트점수는 " + (project2) +"입니다.");


        int score = (rank2 + quality2 +project2);
        System.out.println("최종점수는 " +(score) +"입니다.");




    }
}

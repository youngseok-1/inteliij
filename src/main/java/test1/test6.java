package test1;

public class test6 {
    public static void main(String[] args) {
        /*
         * 사원 a의  8월달 월급을 구해라. -> 보너스까지 포함해서 세금계산하기, 계산 결과마다 소수점은 다 없애기
         * 연봉 = 30000000 보너스 = 500000  세금 = 3.3%
         * 만약 a사원의 8월달 세후 월급이 300만원이 넘는다면
         * if 310만원 = 축하드립니다. 이번 월급은 3000000원입니다.
         *   넘지 않는다면
         * if 250만원 = 이번 월급은 2500000원입니다.
         * */

        int annual = 30000000;
        int bonus = 500000;

        int annualBonus = (annual + bonus);
        System.out.println("연봉은" + (annualBonus) + "입니다.");

        double duty = ( annualBonus * 3.3/100);
        System.out.println("세금은" + ((long)(duty)) + "입니다.");

        int ad = ((annualBonus - ((int)duty)));
        System.out.println("세후는" + (ad) + "입니다.");

        int salary = (ad / 12);
        System.out.println("월급은" + (salary) + "입니다.");

        





    }
}

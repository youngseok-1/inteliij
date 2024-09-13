package test0910;

public class Vending {

    private boolean isMoney; // 돈 들어오기 전
    private int money;

    public void input() {
        if(isMoney) {
            System.out.println("돈을 이미 투입하셨습니다.");
        } else {
            this.isMoney = true;
            System.out.println("돈을 투입하셨습니다. 음료수를 골라주세요.");
        }
    }
    public void signal() {

    }
}

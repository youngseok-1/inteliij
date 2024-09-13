package test0910_2;

import java.util.Scanner;

public class Phone {
    private boolean isOn;
    private boolean isUnlocked;

    public Phone() {
        this.isOn = false;
        this.isUnlocked = false;
    }

    public void powerOn() {
        if (isOn) {
            System.out.println("휴대폰이 이미 켜져있습니다.");
        } else {
            this.isOn = true;
            this.isUnlocked = false;
            System.out.println("휴대폰이 켜졌습니다. 패턴을 풀어주세요.");
        }
    }

    public void unlockPattern() {
        if (!isOn) {
            System.out.println("휴대폰이 꺼져있습니다. 먼저 켜주세요.");
        } else if (isUnlocked) {
            System.out.println("이미 패턴이 풀려있습니다.");
        } else {
            System.out.println("패턴을 입력해주세요: ");
            Scanner sc = new Scanner(System.in);
            String pattern = sc.nextLine();
            if (pattern.equals("1234")) {
                isUnlocked = true;
                System.out.println("패턴이 풀렸습니다.");
            } else {
                System.out.println("패턴이 틀렸습니다.");
            }
        }
    }

    public void runApp() {
        if (!isOn || !isUnlocked) {
            System.out.println("휴대폰이 꺼져있거나 패턴이 잠겨있습니다.");
        } else {
            Person person = new Person();
            person.runApp(this); // 어플 실행
        }
    }

    public void powerOff() {
        if (!isOn) {
            System.out.println("휴대폰이 이미 꺼져있습니다.");
        } else {
            System.out.println("휴대폰이 꺼집니다.");
            isOn = false;
            isUnlocked = false; // 휴대폰이 꺼지면 패턴 잠금
        }
    }

    public boolean isOn() {
        return isOn;
    }

    public boolean isUnlocked() {
        return isUnlocked;
    }
}

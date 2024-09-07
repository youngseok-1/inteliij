package test0904;

public class Application2 {
    public static void main(String[] args) {
        Application2 app2 = new Application2();
        app2.number();

    }
    public void number() {
        int random = (int) (Math.random() * 16)  + (-5);
        System.out.println("생성된 난수 : " + (random));
        int abs = (Math.abs(random));
        System.out.println("난수의 절대값 : " + (abs));
    }
}

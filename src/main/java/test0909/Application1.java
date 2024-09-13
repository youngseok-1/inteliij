package test0909;

public class Application1 {

    public static void main(String[] args) {


//        다음은 카드 게임에서 사용되는 카드 4개의 모양과 13개의 숫자를 표현한 배열입니다.
//        이 배열을 활용하여 카드 두 장을 무작위로 뽑고, 뽑은 두 장의 카드가 같은 모양인지 확인한 후,
//        같은 모양이라면 “축하합니다! 두 장의 카드가 같은 모양입니다.“라는 메시지를 출력하는 프로그램을 작성하세요.
//        만약 다른 모양이라면 “아쉽습니다. 다른 모양의 카드입니다.“라는 메시지를 출력하세요.

        String[] shapes = {"SPADE", "CLOVER", "HEART", "DIAMOND"};
        String[] cardNumbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "JACK", "QUEEN", "KING", "ACE"};

        // 난수 발생
        int randomShapeIndex1 = (int) (Math.random() * shapes.length);
        int randomCardNumberIndex1 = (int) (Math.random() * cardNumbers.length);

        int randomShapeIndex2 = (int) (Math.random() * shapes.length);
        int randomCardNumberIndex2 = (int) (Math.random() * cardNumbers.length);

        // 첫 번째 카드 출력
        System.out.println("첫 번째로 뽑은 카드는 " + shapes[randomShapeIndex1] + " " + cardNumbers[randomCardNumberIndex1] + " 카드입니다.");

        // 두 번째 카드 출력
        System.out.println("두 번째로 뽑은 카드는 " + shapes[randomShapeIndex2] + " " + cardNumbers[randomCardNumberIndex2] + " 카드입니다.");

        // 두 카드의 모양을 비교
        if(shapes[randomShapeIndex1].equals(shapes[randomShapeIndex2])) {
            System.out.println("축하합니다! 두 장의 카드가 같은 모양입니다.");
        } else {
            System.out.println("아쉽습니다. 다른 모양의 카드입니다.");
        }



    }

}

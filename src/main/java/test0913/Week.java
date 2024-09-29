package test0913;
import java.util.Arrays;
public class Week {

    public void Array() {

            String[] arr1 = {"월", "화", "수", "목"};
            String[] arr2 = {"금", "토", "일"};

            // 두 배열의 크기를 합한 새로운 배열 생성
            String[] week = new String[arr1.length + arr2.length];

            // arr1 배열 복사
            System.arraycopy(arr1, 0, week, 0, arr1.length);

            // arr2 배열 복사
            System.arraycopy(arr2, 0, week, arr1.length, arr2.length);

            // 배열 합친 결과 출력
            System.out.println(Arrays.toString(week));
        }
    }


package chap_05;

public class _02_ArrayLoop {
    public static void main(String[] args) {
        // 배열의 순회
        String[] coffees = {"아메리카노","카페모카","라떼","카푸치노"};

        // for 반복문 순회
        for (int i = 0; i < 4; i++) {
            System.out.println(coffees[i] + " 하나");
        }
        System.out.println("주세요");

        System.out.println("------------------------");

        // 배열의 길이를 이용한 순회
        for (int i = 0; i < coffees.length; i++) {
            System.out.println(coffees[i] + " 하나");
        }
        System.out.println("주세요"); // .length = len()    <- 파이썬

        System.out.println("------------------------------");
        for (String coffe  : coffees) {
            System.out.println(coffe + " 하나");
        }
        System.out.println("주세요");

        // enhanced for (for-each) 반복문
        // for i in [list] <- 파이썬에서 쓰던 방식이랑 동일


    }
}

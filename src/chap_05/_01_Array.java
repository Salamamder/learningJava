package chap_05;

public class _01_Array {
    public static void main(String[] args) {
        // 배열 : 같은 자료형의 값 여러개 저장하는 연속된 공간
        // 순서의 개념이 존재

        String coffeRoss = "아메리카노";
        String coffeRachel = "카페모카";
        String coffeChandler = "라떼";
        String coffeMonica = "카푸치노";

        System.out.println(coffeRoss + "하나"); // 아메리카노 하나
        System.out.println(coffeRachel + "하나");
        System.out.println(coffeChandler + "하나");
        System.out.println(coffeMonica + "하나");
        System.out.println("주세요");

        // 배열 선언 첫 번째 방법
        // String[] coffes = new String[4];

        // 두 번재 방법
        // String coffes[] = new String[4];
//        coffes[0] = "아메리카노"; // 0 부터 시작
//        coffes[1] = "카페모카";
//        coffes[2] = "라떼";
//        coffes[3] = "카푸치노";

        // 세 번째 방법
        // String[] coffes = new String[] {"아메리카노","카푸치노","라떼","카페모카"};

        // 네 번째 방법
        String[] coffes = {"아메리카노","카푸치노","라떼","카페모카"};

        // 커피 주문
        System.out.println(coffes[0] + "하나"); // 아메리카노 하나
        System.out.println(coffes[1] + "하나"); // 카푸치노 하나
        coffes[2] = "에스프레소"; // 값 변경
        System.out.println(coffes[2] + "하나"); // 라떼 하나
        System.out.println(coffes[3] + "하나"); // 카페모카 하나

        // 다른 자료형
        int[] i = new int[3];
        i[0] = 1;
        i[1] = 2;
        i[2] = 3;
        double[] d = new double[] {10.0, 11.2, 13.5};
        boolean[] b = {true, true, false};



    }
}

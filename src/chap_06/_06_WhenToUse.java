package chap_06;

public class _06_WhenToUse {

    public static int getPower(int number) { // 매소드 내에서 다른 메소드 호출이 가능
        // int result = number * number;
        // return result;
        // return number * number;
        return getPower(number, 2);
    }

    public static int getPower(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }


    public static void main(String[] args) {
        // 메서드가 필요한 이유

        // 2의 2승을 구하기
        int result = getPower(2, 2);
        System.out.println(result); // 2 * 2 = 4

        // 3의 3승을 구하기
        result = getPower(3, 3);
        System.out.println(result); // 2 * 2 = 4

        // 4의 2승을 구하기
        result = getPower(4, 2);
        System.out.println(result); // 2 * 2 = 4

    }
}

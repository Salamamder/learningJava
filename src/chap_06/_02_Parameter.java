package chap_06;

public class _02_Parameter {

    // 전달 값이 있는 메서드
    public static void power(int number) { // Parameter, 매개변수
        int result = number * number;
        System.out.println(number + " 의 2 승은 " + result);
    }

    public static void powerByExp(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        System.out.println(number + " 의 " + exponent + " 승은 " + result);
    }

    public static void main(String[] args) {
        // 전달값, Parameter
        // 2 -> 2 * 2 = 4
        // 3 -> 3 * 3 = 9

        // Arguments, 인수
        power(5); // 5 * 5 = 25
        power(3);

        powerByExp(2, 3);
        powerByExp(3, 3);
        powerByExp(10, 0);
    }
}

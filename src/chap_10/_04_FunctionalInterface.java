package chap_10;

import chap_10.converter.*;

public class _04_FunctionalInterface {
    public static void main(String[] args) {
        KRWConverter converter = new KRWConverter();
        // converter.convert(499);

//        convertUSD(public void convert(int USD)) {
//            // 1 달러 = 1400 원
//            System.out.println(USD + " 달러 = " + (USD * 1400) + " 원");
//        };
        // 람다식으로 변경시
        convertUSD( (USD) -> System.out.println(USD + " 달러 = " + (USD * 1400) + " 원"), 2 );
        // 객체 전달을 람다식으로 대체

        Convertible convertible = USD -> System.out.println(USD + " 달러 = " + (USD * 1400) + " 원"); // 현재 인터페이스에 하나만 있어서 문제없이 동작
        convertUSD(convertible, 499);

        // 메소드 : 클래스 내에서 기능을 정의 하는 것
        // 이런 형식을 함수형 인터페이스라고 부른다.
        // 함수는 클래스 밖에서 정의하는 것

        System.out.println("------------------------------------");
        // 전달값이 하나도 없는 경우
        ConvertibleWithNoParams c1 = () -> System.out.println("1 달러 = 1400 원");
        c1.convert();

        // 두 줄 이상의 코드가 있다면
        c1 = () -> {
            int USD = 5;
            int KRW = 1400;
            System.out.println(USD + " 달러 = " + (USD * KRW) + " 원");
        };
        c1.convert();

        // 전달값이 2개인 경우
        ConvertibleWithTwoParams c2 = (d, w) -> System.out.println(d + " 달러 = " + (d * w) + " 원");
        c2.convert(10, 1400);

        // 반환값이 있는 경우
        ConvertibleWithReturn c3 = (d, w) -> d * w; // return이 있으면 {} 생략 불가
        int result = c3.convert(299, 1400);
        System.out.println("299 달러 = " + result + " 원");
    }

    public static void  convertUSD(Convertible converter, int USD) {
        converter.convert(USD);
    }
}

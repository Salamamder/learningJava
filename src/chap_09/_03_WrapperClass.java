package chap_09;

public class _03_WrapperClass {
    public static void main(String[] args) {
        // 래퍼 클래스 (Wrapper)
        // int double float char

        Integer i = 123; // int i = 123'
        Double d = 1.0; // double d = 1.0;
        Character c = 'A'; // char c = 'A';

        System.out.println(i);
        System.out.println(d);
        System.out.println(c);

        System.out.println("-------------------------------");

        System.out.println(i.intValue()); // 123
        System.out.println(d.intValue()); // 1
        System.out.println(c.charValue()); // A

        System.out.println("-------------------------------");
        String s = i.toString(); // 문자열로 변환
        System.out.println(s);

    }
}

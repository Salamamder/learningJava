package chap_09;

import chap_09.coffee.*;
import chap_09.user.User;
import chap_09.user.VIPUser;

public class _02_GenericClass {
    public static void main(String[] args) {
        // 제네릭 클래스
        CoffeeByNumber c1 = new CoffeeByNumber(33);
        c1.ready();

        CoffebyNickname c2 = new CoffebyNickname("히라이 모모");
        c2.ready();

        System.out.println("----------------------------------");

        CoffeeByName c3 = new CoffeeByName(34);
        c3.ready();

        CoffeeByName c4 = new CoffeeByName("파비앙 셰어");
        c4.ready();

        System.out.println("----------------------------------");

        int c3Name = (int)c3.name;
        System.out.println("주문 고객 번호 : " + c3Name);

        String c4Name = (String) c4.name;
        System.out.println("주문 고객 이름 : " + c4Name);

        // c4Name = (String) c3.name;
        // "정수를 문자열로 형 변환 할 수 없다." 에러가 발생

        System.out.println("----------------------------------");

        Coffee<Integer> c5 = new Coffee<>(35); // 정수로 정의해서 문자는 못ㄷㄹ감
        c5.ready();
        int c5Name = c5.name;
        System.out.println("주문 고객 번호 : " + c5Name);

        Coffee<String> c6 = new Coffee<>("인자기"); // String으로 정의 해서 인트는 못들감
        c6.ready();
        String c6Name = c6.name;
        System.out.println("주문 고객 이름 : " + c6Name);

        System.out.println("----------------------------------");

        CoffeeByUser<User> c7 = new CoffeeByUser<>(new User("이사크"));
        c7.ready();

        CoffeeByUser<User> c8 = new CoffeeByUser<>(new VIPUser("머피"));
        c8.ready();

        System.out.println("----------------------------------");
        orderCoffee("토날리");
        orderCoffee(36);

        orderCoffee("기마랑이스","아메리카노");
        orderCoffee(37, "라떼");
        // CoffeeByUser<User> c9 = new CoffeeByUser<>(new BlackBox()); // 블랙박스는 유저 클래스를 상속받지 않기 때문에 에러 발생
    }

    public static <T> void orderCoffee(T name) {
        System.out.println("커피 준비 완료 : " + name);
    }

    public static <T, V> void orderCoffee(T name, V coffee) { // 값 여러 개 넣는 경우 <> 안에 정의만 잘 해주면 됨
        System.out.println(coffee + " 준비 완료 : " + name);
    }
}



class BlackBox {

}
package chap_10;

public class _01_AnonymousClass1 {
    public static void main(String[] args) {
        // 익명 클래스
        // 이름이 없는 클래스
        Coffee c1 = new Coffee();
        c1.order("아메리카노");
        System.out.println("---------------------");

        Coffee c2 = new Coffee();
        c2.order("라떼");
        System.out.println("---------------------");

        // 굉장히 친한 친구 방문
        Coffee specialCoffee = new Coffee() { // 익명 클래스의 첫 번째 예시
            @Override
            public void order(String coffee) { // 해당 객체에만 적용되도록 오버라이딩이 가능
                super.order(coffee);
                System.out.println("(귓속말) 딸기 케이크는 서비스예요");
            }

            @Override
            public void returnTray() {
                System.out.println("(귓속말) 자리에 두시면 제가 치울게요");
            }
        };
        specialCoffee.order("바닐라 라떼");
        specialCoffee.returnTray();
        System.out.println("---------------------");


    }
}

class Coffee {
    public void order(String coffee) {
        System.out.println("주문하신 " + coffee + " 나왔습니다.");
    }

    public void returnTray() {
        System.out.println("커피 반납이 완료되었습니다.");
    }
}

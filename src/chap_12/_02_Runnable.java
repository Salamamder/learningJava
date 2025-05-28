package chap_12;

import chap_12.clean.CleanRunnable;

public class _02_Runnable {
    // 쓰레드는 상속
    // 러너블은 인터페이스
    // 둘이 run을 오버라이딩해서 쓰는 것은 같음
    // 상황 따라서 쓰면 된다.

    public static void main(String[] args) {
        CleanRunnable cleanRunnable = new CleanRunnable();
        Thread thread = new Thread(cleanRunnable);
        thread.start();

        cleanByBoss();
    };

    public  static void cleanByBoss() {
        System.out.println("-- 사장 청소 시작 (Thread) --");
        for (int i = 1; i <= 10; i+=2) {
            System.out.println("(사장) "  + i  +"번방 청소 중");
        }
        System.out.println("-- 사장 청소 끝 (Thread) --");
    }
}

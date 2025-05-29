package chap_12;

public class _Quiz_12 {
    // 상품 A와 상품 B로 이루어진 세트 상품을 효율적으로 포장하는 프로그램을 작성하시오
    // 조건
    // 상품 A 와 상품 B 는 각각 5개씩 준비
    // 상품 A 와 상품 B 는 두 사람이 독립적으로 준비
    // 상품 A 와 상품 B 가 모두 준비된 이후 세트 상품 포장 시작
    // 포장이 필요한 세트 상품은 총 5개

//    public static void main(String[] args) {
//
//        Runnable readyA = new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 1; i <= 5; i++) {
//                    System.out.println("A 상품 준비 "  + i  + "/5");
//
//                }
//                System.out.println("-- A 상품 준비 완료 --");
//            }
//        };
//
//
//        Runnable readyB = new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 1; i <= 5; i++) {
//                    System.out.println("B 상품 준비 "  + i  + "/5");
//                }
//                System.out.println("-- B 상품 준비 완료 --");
//            }
//        };
//
//        Thread ready1 = new Thread(readyA);
//        Thread ready2 = new Thread(readyB);
//        ready1.start();
//        ready2.start();
//
//        try {
//            ready1.join();
//            ready2.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//
//    }



    public static void main(String[] args) {
        Runnable runnableA = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("A 상품 준비 " + i + "/5");
            }
            System.out.println(" -- A 상품 준비 완료 --");
        };

        Runnable runnableB = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("B 상품 준비 " + i + "/5");
            }
            System.out.println(" -- B 상품 준비 완료 --");
        };

        Thread threadA = new Thread(runnableA);
        Thread threadB = new Thread(runnableB);

        threadA.start();
        threadB.start();

        // join으로 동작이 끝날 때 까지 기다릴 수 있음
        // 해당 쓰레드가 끝날 때 까지 main 메소드는 대기를 함
        try {
            threadA.join();
            threadB.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        // join을 대체하는 다른 방법
        // while문과 thread.isAlive() 메서드를 이용하면 가능하다
//        while (threadA.isAlive() || threadB.isAlive()){
//
//        }
        // 위의 구문은 스레드가 살아있으면 메인메서드를 무한정 대기하게 만든다.


        Runnable runnableSet = () -> {
            System.out.println("== 세트 상품 포장 시작 ==");
            for (int i = 1; i <= 5; i++) {
                System.out.println("세트 상품 준비 " + i + "/5");
            }
            System.out.println(" -- 세트 상품 준비 완료 --");
        };
        Thread threadSet = new Thread(runnableSet);
        threadSet.start();

    }
}

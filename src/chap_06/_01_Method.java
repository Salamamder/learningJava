package chap_06;

public class _01_Method {

    public static void sayHello() { // 메소드는 뭔가를 하는 형태라 대개로 이름에 동사를 씀
        System.out.println("Hello I'm Method");
    }




    public static void main(String[] args) {
        // 메소드
        System.out.println("메소드 호출 전");
        sayHello();
        sayHello();
        sayHello();
        System.out.println("메소드 호출 후");
    }
}

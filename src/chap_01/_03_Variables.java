package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name = "홍길동";
        int Hour = 15;


        System.out.println(name + "님, 배송이 시작됩니다. " + Hour + "시에 방문예정입니다.");
        System.out.println(name + "님, 배송이 완료되었습니다.");

        double score = 90.5;
        char grade = 'A';
        name = "강백호";
        System.out.println(name + "님의 평균 점수는 " + score + "점입니다.");
        System.out.println("학점은 " + grade + "입니다.");

        boolean pass = true;
        System.out.println("이번 시험에 합격했을까요? " + pass);

        double d = 3.14159235789;
        float f = 3.14159235789F;
        System.out.println(d);
        System.out.println(f);

        long l = 1000000000000L;
        l = 1_000_000_000_000L; // 가독성을 위해 '_'을 입력해도 됨
        System.out.println(l);

        // int, long, float, double, char, String, boolean 공부완료
    }
}

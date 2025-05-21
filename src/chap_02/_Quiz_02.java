package chap_02;

public class _Quiz_02 {
    public static void main(String[] args) {
        int 키[] = {115, 121};
        int i;

/*
        for (i = 0; i < 2; i++) {
            if (키[i] >= 120) {
                System.out.println("키가 " + 키[i] +" 이므로 탑승 가능합니다");
            }
            else {
                System.out.println("키가 " + 키[i] +" 이므로 탑승 불가합니다");
            }
            */

        // 삼항 연산자 사용시
        for (i = 0; i < 2; i++) {
            System.out.println((키[i] >= 120) ? ("키가 " + 키[i] +" 이므로 탑승 가능합니다") : ("키가 " + 키[i] +" 이므로 탑승 불가합니다"));
        }
    }
}

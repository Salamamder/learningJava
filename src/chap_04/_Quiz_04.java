package chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        // 조건문을 활용하여 주차 요금 정산 프로그램을 작성하라
        // 조건
        // 주차요금은 시간당 4000원 (일일 최대 요금은 30000원)
        // 경차 또는 장애인 차량은 최종 요금에서 50% 할인

        boolean 경차[] = {false, true, false, true};
        boolean 장애인[] = {false, false, true, true};
        int 이용시간[] = {5, 10, 8, 5};
        int 최종요금[] = {0,0,0,0};

        for (int i = 0; i < 4; i++) {
            최종요금[i] = 이용시간[i]*4000;
            if (최종요금[i] > 30000) {
                최종요금[i] = 30000;
            }
            if (경차[i] || 장애인[i]) {
                최종요금[i] /= 2;
            }
            System.out.println((i+1) + "번째 손님의 최종요금은 " + 최종요금[i] +"원 입니다.");
        }

    }
}

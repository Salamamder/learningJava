package chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        // substring을 쓰는 것이 좋아보임
        String personalId[] = {"901231-1234567", "030708-4567890"};
        int i;
        for (i = 0; i < 2; i ++) {
            System.out.println(personalId[i].substring(0, 8));
            System.out.println(personalId[i].substring(0, personalId[i].indexOf("-") + 2)); // 0 위치부터 하이픈 위치 +2 직전 까지
        }
    }
}

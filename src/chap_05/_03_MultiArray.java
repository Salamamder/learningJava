package chap_05;

public class _03_MultiArray {
    public static void main(String[] args) {
        // 다차원 배열 (2차원 배열)

        // 소규모 영화관 좌석
        // A1 - A5
        // B1 - B5
        // C1 - C5

        String[] seatA = {"A1", "A2", "A3", "A4", "A5"};
        String[] seatB = {"B1", "B2", "B3", "B4", "B5"};
        String[] seatC = {"C1", "C2", "C3", "C4", "C5"};

        // 3행 5열 크기의 2차원 배열
        String[][] seats =new String[][] {
                {"A1", "A2", "A3", "A4", "A5"},
                {"B1", "B2", "B3", "B4", "B5"},
                {"C1", "C2", "C3", "C4", "C5"}

        };

        // B2 에 접근하려면?
        System.out.println(seats[1][1]);

        // C5에 접근하려면?
        System.out.println(seats[2][4]);

        // 첫 줄에는 3칸, 둘째 줄에는 4칸, 셋째 줄에는 5칸
        String[][] seats2 = {
                {"A1" ,"A2", "A3"},
                {"B1", "B2", "B3", "B4"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        // A3 에 접근하려면?
        System.out.println(seats2[0][2]);

        // A5에 접근하려면?
        // System.out.println(seats2[0][4]); // 존재하지 않는 곳에 접근하려 해서 오류 발생

        // 3차원 배열 만들기 3 x 3 x 3 정육면체 형태
        String[][][] marray = new String[3][3][3];




    }
}

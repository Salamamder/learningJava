package chap_13;

public class _02_Output {
    public static void main(String[] args) {
        // System.out.format();
        // System.out.printf();

        System.out.println("------------------정수----------------");
        // System.out.printf("포맷",값1, 값2, 값3, ...); // 양식
        System.out.printf("%d%n", 1); // %n = \n
        System.out.printf("%d %d %d%n", 1, 2, 3);
        System.out.printf("%d%n", 1234);
        System.out.printf("%6d%n", 1234); // __1234 6자리의 공간을 확보하고 나서 1234 출력
        System.out.printf("%06d%n",1234); // 001234 6자리의 공간을 확보하고 1234 출력, 빈 공간은 0으로 채움
        System.out.printf("%6d%n", -1234); // _-1234
        System.out.printf("%06d%n", -1234); // -01234 0이 -와 숫자 사이에 들어오는 것을 확인 가능
        System.out.printf("%+6d%n", 1234); // 음수일 땐 -, 양수일 땐 + 를 붙여주는 방법
        System.out.printf("%+06d%n", 1234); // 0이 + 와 정수 사이에 위치하는 것 확인 가능
        System.out.printf("%,15d%n", 1000000000); // __1,000,000,000 세 자리마다 ','로 구분
        System.out.printf("%-6d%n", 1234); // 1234__ 6자리의 공간을 확보하고 나서 왼쪽 정렬



    }
}

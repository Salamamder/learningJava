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


        System.out.println("---------- 실수 ----------");
        System.out.printf("%f%n", Math.PI); // 3.141593 (일반 출력)
        System.out.printf("%.2f%n", Math.PI); // 3.14 (소수점 둘째자리)
        System.out.printf("%6.2f%n", Math.PI); // __3.14 (6자리 공간 확보, 소수점 둘째자리)
        System.out.printf("%-6.2f%n", Math.PI); // 3.14__ (왼쪽 정렬)
        System.out.printf("%06.2f%n", Math.PI); // 003.14 (빈 공간을 0으로 채우기)
        System.out.printf("%+6.2f%n", Math.PI); // _+3.14 (항상 +- 기호 표시)


        System.out.println("--------------- 문자열 -----------------");
        System.out.printf("%s%n", "Java"); // Java (일반 출력)
        System.out.printf("%6s%n", "Java"); // __Java (6자리 공간 확보하고 우측 정렬)
        System.out.printf("%-6s%n", "Java"); // Java__ (6자리 공간 확보하고 좌축정렬)
        System.out.printf("%6.2s%n", "Java"); // ____Ja (6자리 공간 확보하고 우측 정렬해서 2글자만 출력)
        System.out.printf("%-6.2s%n", "Java"); // Ja____ (6자리 공간 확보하고 좌측 정렬해서 2글자만 출력)


        System.out.println("--------------- 응용 -----------------");
        System.out.println("이름 영어 수학 평균");
        System.out.println("강백호 " + 90 + " " + 80 + " " + 85.0); // 강백호 90 80 85.0
        System.out.println("서태웅 " + 100 + " " + 100 + " " + 100.0); // 서태웅 100 100 100.0
        System.out.println("채치수 " + 95 + " " + 100 + " " + 97.5); // 채치수 95 100 97.5


        System.out.println("--------------- 응용2 -----------------"); //s
        System.out.println("이름      영어   수학   평균"); // 공백이 각각 6, 3, 3 칸으로 구분
        System.out.printf("%-6s %4d %4d %6.1f%n", "강백호", 90, 80, 85.0);
        System.out.printf("%-6s %4d %4d %6.1f%n", "서태웅", 90, 80, 85.0);
        System.out.printf("%-6s %4d %4d %6.1f%n", "채치수", 90, 80, 85.0);


        System.out.println("------------ 참고 -------------"); // 한글 영어 숫자 각각 차지하는 공간이 살짝씩 다름
        System.out.println("ABCDEFG");
        System.out.println("가나다라마바사");
        System.out.println("가 나 다 라");


    }
}

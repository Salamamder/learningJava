package chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        // 형변환 TypeCasting
        // 정수형에서 실수형으로
        // 실수형에서 정수형으로

        int score = 93;
        System.out.println(score); // 93
        System.out.println((float) score); // int가 float으로 형변환이 이루어짐
        System.out.println((double) score); // double로 형변환

        // float, double to int
        float score_f = 93.3F;
        double score_d = 98.8;
        System.out.println((int) score_f); // 93, 소수점이 버려짐
        System.out.println((int) score_d); // 98, 소수점이 버려짐
        // 정수 + 실수 연산
        score = 93 + (int) 98.8; // 93 + 98
        System.out.println(score); // 191

        score_d = 93 + 98.8; // int + double형은 double으로 계산
        System.out.println(score_d);


        // 변수에 형변환된 데이터 집어넣기
        double convertedScoreDouble = score; // 191 -> 191.0
        System.out.println(convertedScoreDouble); // 191.0
        // int -> long -> float -> double (자동 형변환)

        int convertedScoreInt = (int)score_d; // 191.8 -> 191
        System.out.println(convertedScoreInt);
        // double -> float -> long -> int (수동형변환)


        // 숫자를 문자열로
        //String s1 = String.valueOf(93);
        String s1 = Integer.toString(93);
        System.out.println(s1);

        // String s2 = String.valueOf(98.8);
        String s2 = Double.toString(98.8);
        System.out.println(s2); // 98.8

        // 문자열을 숫자로 변환
        int i = Integer.parseInt("93");
        System.out.println((i)); // 93
        double d = Double.parseDouble("98.8");
        System.out.println(d); // 98.8

        // 숫자형태 문자열이 아닌 진짜 문자가 들어와서 에러 발생
        int error = Integer.parseInt("자바"); // 오류가 뜨게 됨

    }
}

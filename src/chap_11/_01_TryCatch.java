package chap_11;

public class _01_TryCatch {
    public static void main(String[] args) {
        // 예외 처리
        // 오류 : 컴파일 오류, 런타임 오류 (에러 error, 예외 exception)
        // 컴파일 오류 : 코드에 오류가 있어서 프로그램이 실행조차 안되는 경우
        // int i = "문자열"; // 예시
        // 런타임 오류 : 컴파일은 되는데 실행하는 과정에서 문제가 발생하는 경우
        // int[] arr = new int[3]; // 예시
        // arr[5] = 100; // 컴파일은 문제 없지만 샐행에서 문제 발생

        // 기본적인 예외 처리 : try-catch문
        try {
            // System.out.println(3 / 0);

//            int[] arr = new int[3];
//            arr[5] = 100;

            Object obj = "test";
            System.out.println((int) obj);

        } catch (Exception e) {
            System.out.println("이런 문제가 발생했어요 -> " + e.getMessage());
            e.printStackTrace();
        }


        System.out.println("프로그램 정상 종료");
    }
}



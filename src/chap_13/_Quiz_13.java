package chap_13;

import java.io.*;
import java.util.Scanner;

public class _Quiz_13 {
    // 속담 퀴즈 프로그램을 작성하시오
    // 조건
    // 퀴즈 내용은 saying.txt.라는 이름의 파일로 제공
    // 퀴즈는 문제와 정답이 각각 한 줄로 구성 (퀴즈 3개인 경우 총 6줄)
    // 사용자로부터 값을 입력받아 정답여부 확인
    // 오답인 경우 정답 안내
    // 퀴즈 내용이 더 이상 없을 때까지 반복

    public static void main(String[] args) {
        File file = new File("saying.txt");

        // 입력받을 scanner 정의
        Scanner sc = new Scanner(System.in);

        // 파일 만들기
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            bw.write("세 살 __ 여든까지 간다");
            bw.newLine();
            bw.write("버릇");
            bw.newLine();
            bw.write("소 잃고 ___ 고친다");
            bw.newLine();
            bw.write("외양간");
            bw.newLine();
            bw.write("천 리 길도 한 __부터");
            bw.newLine();
            bw.write("걸음");
            bw.newLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        // 읽어와서 출력하는 코드
        // 입력도 받아서 답하고 맞는지 확인 해야 함
        try (BufferedReader br = new BufferedReader(new FileReader("saying.txt"))) {
            System.out.println("속담 퀴즈입니다. 빈 칸에 알맞은 말을 입력하시오. (주관식)");
            System.out.println("--------------------------------------------------");
            String question;
            String answer;
            while ((question = br.readLine()) != null && (answer = br.readLine()) != null ) {
                System.out.println("(문제) " + question);
                System.out.print(" 정답 입력 ==> ");
                String input = sc.next();
                // 정답인 경우, 아닌경우 출력
                // if (answer == input) { // 이렇게 하면 주소값을 비교하에 안됨 equals를 쓰는게 좋음
                if (answer.equals(input)) { // 정답인경우
                    System.out.println("정답입니다!!!");
                } else { // 틀린경우
                    System.out.println("틀렸습니다. 정답은 " + answer + "입니다.");
                }

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

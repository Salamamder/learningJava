package chap_13;

import java.util.Scanner;

public class _01_Input {
    public static void main(String[] args) {
        // 사용자 입력
        Scanner sc = new Scanner(System.in);
//        System.out.println("이름을 입력하세요");
//        String name = sc.next();
//        System.out.println("혈액형을 입력하세요");
//        String bloodType = sc.next();
//        System.out.println("키를 입력하세요");
//        // int height = Integer.parseInt(sc.next());
//        int height = sc.nextInt();
//        System.out.println("몸무게를 입력하세요");
//        double weight = Double.parseDouble(sc.next());
//        double weight = sc.nextDouble();
//
//        System.out.println("입력하신 정보는 다음과 같습니다.");
//        System.out.println("이름 : " + name);
//        System.out.println("혈액형 : " + bloodType);
//        System.out.println("키 : " + height);
//        System.out.println("몸무게 : " + weight);

        System.out.println("무슨 프로그래밍 언어를 배웠나요?");
        String lang = sc.next(); // 한 단어 (자바 파이썬)
        // String lang = sc.nextLine(); // 한 줄 전체를 입력으로 받음

        System.out.println("언어 : " + lang);

        sc.nextLine(); // next 뒤에 nextline을 쓰면 next에 2개 이상의 단어가 들어오면 nextline이 나머지를 처리한다.

        System.out.println("배우고 나서 기분이 어땠나요?");
        String feeling = sc.next(); // 한 문장 (재밌었어요)
        // String feeling = sc.nextLine(); // 한 줄을 입력으로 받음
        System.out.println("기분 : " + feeling);
    }
}

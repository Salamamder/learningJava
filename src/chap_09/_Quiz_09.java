package chap_09;

import java.util.ArrayList;

public class _Quiz_09 {
    // ArrayLsit 를 이용하여 학생별 프로그래밍 언어 자격증 취득 정보를 관리하고,
    // 자바 자격증을 보유한 학생 이름을 출력하시오
    // 조건
    // 학생 이름 및 자격증 취득 정보를 위한 Student 클래스 생성
    // 학생 1인당 보유 자격증은 1개로 제한
    // 모든 클래스는 하나의 파일에 정의

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("유재석", "파이썬"));
        list.add(new Student("박명수", "자바"));
        list.add(new Student("김종국", "자바"));
        list.add(new Student("조세호", "C"));
        list.add(new Student("서장훈", "파이썬"));

        System.out.println("자바 자격증을 보유한 학생");
        System.out.println("-----------------------------");
        for (Student s : list) {
            if (s.license.equals("자바")) {
                System.out.println(s.name);
            }

        }

    }
}

class Student {
    public String name;
    public String license;

    public Student(String name, String license) {
        this.name = name;
        this.license = license;
    }
}

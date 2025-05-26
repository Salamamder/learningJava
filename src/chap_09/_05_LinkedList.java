package chap_09;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class _05_LinkedList {
    public static void main(String[] args) {
        // 링크드 리스트 & 리스트는 중복데이터를 허용한다.
        LinkedList<String> list = new LinkedList<>();

        // add data
        list.add("모모");
        list.add("사나");
        list.add("지효");
        list.add("미나");
        list.add("쯔위");

        // 데이터 조회(인덱스)
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.getLast());
        System.out.println(list.getFirst());

        System.out.println("-------------------------------");

        // 추가
        list.addFirst("니노");
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("-------------------------------");

        list.addLast("아코");
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("-------------------------------");

        System.out.println("학생 추가 전 (인덱스 1) : " + list.get(1));
        list.add(1, "미코"); // 1 인덱스에 미코 넣기, 나머지는 뒤로 밀림
        System.out.println("학생 추가 후 (인덱스 1)) : " + list.get(1));
        System.out.println("학생 추가 후 (인덱스 2) : " + list.get(2));

        System.out.println("-------------------------------");

        // 삭제
        System.out.println("남은 학생 수 (제외 전) : " + list.size());
        list.remove(list.size() - 1);
        System.out.println("남은 학생 수 (제외 후) : " + list.size());


        System.out.println("-------------------------------");

        // 처음 학생과 마지막 학생이 전학
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("남은 학생 수 (전학 전) : " + list.size());
        list.removeFirst(); // 첫 데이터 삭제
        list.removeLast(); // 마지막 데이터 삭제
        System.out.println("남은 학생 수 (전학 후) : " + list.size());
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("-------------------------------");

        // 변경 (수강권 양도)
        list.set(0, "샤를로트");
        System.out.println(list.get(0));

        System.out.println(list.indexOf("지효"));
        if (list.contains("김종국")) {
            System.out.println("수강 신청 성공");
        } else {
            System.out.println("수강 신청 실패");
        }

        System.out.println("-------------------------------");

        // 전체 삭제
        list.clear();
        if (list.isEmpty()) {
            System.out.println("학생 수 : " + list.size());
            System.out.println("리스트가 비었습니다.");
        }

        System.out.println("-------------------------------");

        // 새로운 학기
        list.add("모모");
        list.add("사나");
        list.add("지효");
        list.add("미나");
        list.add("쯔위");

        Collections.sort(list); // 정렬
        for (String s : list) {
            System.out.println(s);
        }
    }
}

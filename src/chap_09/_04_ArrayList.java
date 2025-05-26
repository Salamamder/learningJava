package chap_09;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class _04_ArrayList {
    public static void main(String[] args) {
        // 컬렉션 프레임워크
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        // 위의 배열에 추가 데이터 삽입을 원할시
        // 새로운 배열을 만들고 옮기는 작업이 필요
        // 컬렉션 프레임워크는 원하는 만큼 추가하거나 삭제 가능 -> 파이썬 리스트랑 비슷한 듯

        // 컬렉션 프레임워크 (List, Set, Map)
        ArrayList<String> list = new ArrayList<>();

        // 데이터 추가
        list.add("모모");
        list.add("사나");
        list.add("지효");
        list.add("미나");
        list.add("쯔위");

        // 데이터 조회 (인덱스)
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));

        System.out.println("----------------------------------");
        System.out.println("신청 학생 수 (이사 전) : " + list.size()); // 5
        list.remove("미나"); // 이사 간 후
        System.out.println("신청 삭생 수 (이사 후) : " + list.size()); // 4
        System.out.println(list.get(3)); // 쯔위 -> 앞으로 당겨짐

        System.out.println("--------------------------------");

        System.out.println("남은 학생 수 (제외 전) : " + list.size()); // 4
        list.remove(list.size() - 1);
        System.out.println("남은 학생 수 (제외 후) : " + list.size()); // 3

        System.out.println("--------------------------------");
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
        for (String s : list) { // 이 방식도 가능
            System.out.println(s);
        }


        System.out.println("--------------------------------");

        // 변경 (수강권 양도)
        System.out.println("수강권 양도 전 : " + list.get(0));
        list.set(0, "니노");
        System.out.println("수강권 양도 후 : " + list.get(0));

        System.out.println("--------------------------------");

        // 확인
        System.out.println(list.indexOf("지효")); // 2
        // 선착순 5명 내에 포함 되었는가?
        if (list.contains("지효")) {
            System.out.println("수강 신청 성공");
        } else {
            System.out.println("수강 신청 실패");
        }

        System.out.println("--------------------------------");

        // 전체 삭제
        list.clear();
        if (list.isEmpty()) {
            System.out.println("학생 수 : " + list.size());
            System.out.println("리스트가 비었습니다.");
        }

        System.out.println("--------------------------------");

        // 다음 학기에 새로 공부 시작
        list.add("모모");
        list.add("사나");
        list.add("지효");
        list.add("미나");
        list.add("쯔위");

        // 정렬
        Collections.sort(list);
        for (String s : list) {
            System.out.println(s);
        }
    }
}

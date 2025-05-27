package chap_09;

import com.sun.security.jgss.GSSUtil;

import java.util.*;

public class _08_Iterator {
    public static void main(String[] args) {
        // 이터레이터
        List<String> list = new ArrayList<>();
        list.add("모모");
        list.add("(알 수 없음)");
        list.add("지효");
        list.add("(알 수 없음)");
        list.add("사나");
        list.add("(알 수 없음)");
        list.add("리온");
        list.add("(알 수 없음)");
        list.add("칸나");


        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("------------------------------");


        Iterator<String> it = list.iterator();  // ctrl + alt + v 를 누르면 반환값을 가지는거 자동 완성
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());

        System.out.println("------------------------------");

        it = list.iterator(); // 커서를 처음 위치로 이동
        while (it.hasNext()) { // hasNext() : 다음에 가져올 커서가 있는지 true false로 알려준다
            System.out.println(it.next());
        }
        System.out.println("------------------------------");

        it = list.iterator();
        while (it.hasNext()) {
            String s = it.next();
            if (s.contains("(알 수 없음)")) { // (알 수 없음) 값일 경우 조건문 발동
                it.remove(); // 현재 커서가 가리키는 값 삭제
            }
        }
        it = list.iterator(); // 커서를 처음 위치로 이동
        while (it.hasNext()) { // hasNext() : 다음에 가져올 커서가 있는지 true false로 알려준다
            System.out.println(it.next());
        }

        // iterator는 HashSet에서 사용 가능
        HashSet<String> set = new HashSet<>();
        set.add("모모");
        set.add("지효");
        Iterator<String> itSet = set.iterator();
        while (it.hasNext()) {
            System.out.println(itSet.next());
        }
        System.out.println("----------------------------");

        // iterator는 Map에서 사용 가능
        HashMap<String, Integer> map = new HashMap<>();
        map.put("모모", 10);
        map.put("지효", 5);

        // map.iterator() // 제공되지 않음
        //map은 key와 value를 추가 소환하면 iterator를 사용 가능하다.
        Iterator<String> itMapKey = map.keySet().iterator();
        while (itMapKey.hasNext()) {
            System.out.println(itMapKey.next());
        }
        System.out.println("----------------------------");

        Iterator<Integer> itMapValue = map.values().iterator();
        while (itMapValue.hasNext()) {
            System.out.println(itMapValue.next());
        }
        System.out.println("----------------------------");

        // iterator를 통해 key와 value를 함께 출력하는 방법
        Iterator<Map.Entry<String, Integer>> itMap = map.entrySet().iterator();
        while (itMap.hasNext()) {
            System.out.println(itMap.next());
        }



    }
}

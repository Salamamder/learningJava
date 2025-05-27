package chap_09;

import java.util.HashMap;

public class _07_HashMap {
    public static void main(String[] args) {
        // 맵 (Key, Value)
        HashMap<String, Integer> map = new HashMap<>();
        // 순서 보장이 필요한 경우
        // HashMap<String, Value> map = new LinkedHashMap<>(); 을 사용하면 된다
        // LinkedHashMap은 순서를 보장한다.

        // 데이터 추가
        map.put("모모", 10); // 해쉬맵에서는 add가 아닌 put을 사용한다.
        map.put("지효", 5);
        map.put("사나", 3 );
        map.put("리온", 15);

        System.out.println("총 고객 수 : " + map.size());
        System.out.println("------------------------");

        // 조회
        System.out.println("모모님의 포인트 : " + map.get("모모"));
        System.out.println("지효님의 포인트 : " + map.get("지효"));
        System.out.println("------------------------");

        // 확인
        if (map.containsKey("리온")) {
            int point = map.get("리온");
            map.put("리온", ++point);
            System.out.println("리온님의 누적 포인트 : " + map.get("리온"));
        } else {
            map.put("리온", 3);
            System.out.println("리온님 신규 등록 (포인트 1)");
        }
        System.out.println("------------------------");

        // 삭제
        map.remove("모모");
        System.out.println(map.get("모모"));
        System.out.println("-------------------------");

        //전체 삭제
        map.clear();
        if (map.isEmpty()) {
            System.out.println("남은 고객 수 : " + map.size());
            System.out.println("가게 접자");
        }
        System.out.println("--------------------------");

        // 다시 고객이 찾아옴
        map.put("모모", 10);
        map.put("지효", 5);
        map.put("사나", 3 );
        map.put("리온", 15);

        // Key 확인
        for (String key : map.keySet()) { // 해쉬 맵에서 순서가 보장되지 않는 것을 확인 가능, key값 중복 허용 x
            System.out.println(key);
        }
        System.out.println("----------------------------");
        
        // value 확인
        for (int value : map.values()) {
            System.out.println(value);
        }
        System.out.println("-----------------------------");

        // key & value 함께 확인
        for (String key : map.keySet()) {
            System.out.println("고객 이름 : " + key + "\t포인트 : " + map.get(key));
        }
        System.out.println("----------------------------");

        // 맵 : 중복 x, 순서 x
        map.put("리온", 10);
        map.put("리온", 30);
        map.put("리온", 50); // key값은 그대로, only value be updated by "put"
        for (String key : map.keySet()) {
            System.out.println("고객 이름 : " + key + "\t포인트 : " + map.get(key));
        }
        System.out.println("----------------------------");
    }
}

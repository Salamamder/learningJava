package chap_09;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class _06_HashSet {
    public static void main(String[] args) {
        // 세트 -> 중복을 허용하지 않음, 순서 보장되지 않음
        HashSet<String> set = new HashSet<>();
        set.add("삼겹살");
        set.add("쌈장");
        set.add("음료");
        set.add("소금");
        set.add("후추");
        set.add("삼겹살");
        set.add("깻잎");
        set.add("상추");
        set.add("삼겹살");

        System.out.println("총 구매 상품 수 : " + set.size());

        // 순회
        for (String s : set) {
            System.out.println(s);
        }
        System.out.println("---------------------------");

        // 확인
        if (set.contains("삼겹살")) {
            System.out.println("삼겹살 사러 출발");
        }
        System.out.println("---------------------------");

        // 삭제
        System.out.println("총 구매 상품 수 (삼겹살 구매 전) : " + set.size()); // 7
        set.remove("삼겹살");
        System.out.println("총 구매 상품 수 (삼겹살 구매 후) : " + set.size()); // 6
        System.out.println("---------------------------");

        // 전체 삭제
        set.clear();
        if (set.isEmpty()) {
            System.out.println("남은 구매 상품 수 : " + set.size());
            System.out.println("집으로 출발");
        }
        System.out.println("---------------------------");

        // 세트 : 중복 허용 x,  순서 보장 x
        HashSet<Integer> inSet = new HashSet<>();
        inSet.add(1);
        inSet.add(13);
        inSet.add(2);
        
        for (int i : inSet) {
            System.out.println(i);
        }

        System.out.println("-----------------------------");

        // 링크드 해쉬 세트 : 중복 허용 x,  순서 보장 o
        HashSet<Integer> inLinkedSet = new LinkedHashSet<>();
        inLinkedSet.add(1);
        inLinkedSet.add(13);
        inLinkedSet.add(2);

        for (int i : inLinkedSet) {
            System.out.println(i); // 넣은 순서대로 출력이 된다
        }



    }
}

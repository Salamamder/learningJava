package chap_10;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _05_Stream {
    public static void main(String[] args) {
        // 스트림

        // 스트림 생성
        // Arrays.stream 이용하는 방법
        int[] scores = {100, 95, 90, 85, 80};
        IntStream scoreStream = Arrays.stream(scores);

        String[] langs = {"python", "java", "javascript", "c", "c++", "c#"};
        Stream<String> langStream = Arrays.stream(langs);

        // Collection.stream() 객체로부터 스트림을 만드는 방법
        List<String> langList = new ArrayList<>();
//        langList.add("python");
//        langList.add("java");
        langList = Arrays.asList("python", "java", "javascript", "c", "c++", "c#");
        // System.out.println(langList.size());
        Stream<String> langListStream = langList.stream();

        // Stream.of()를 이용하는 방법
        Stream<String> langListOfStream = Stream.of("python", "java", "javascript", "c", "c++", "c#");

        // 스트림 사용
        // 중간 연산 (Intermediate Operation) : filter, map, sorted, distinct, skip, ...
        // 최종 연산 (Terminal Operation) : count, min, max, sum, forEach, anyMatch, allMatch, ...

        // 90점 이상인 점수만 출력
        Arrays.stream(scores).filter(x -> x >= 90).forEach(x -> System.out.println(x));
        // Arrays.stream(scores).filter(x -> x >= 90).forEach(System.out::println); // 위와 똑같이 동작
        System.out.println("----------------------------------");

        // 90점 이상인 사람의 수
        int count = (int)Arrays.stream(scores).filter(x -> x >= 90).count();
        System.out.println(count);
        System.out.println("------------------------------------");

        // 90점 이상인 점수들의 합
        int sum = Arrays.stream(scores).filter(x -> x >= 90).sum();
        System.out.println(sum);
        System.out.println("------------------------------------");

        // 90점 이상인 점수들을 정렬
        Arrays.stream(scores).filter(x -> x >= 90).sorted().forEach(System.out::println);
        System.out.println("------------------------------------");

        // "python", "java", "javascript", "c", "c++", "c#"
        // c로 시작하는 프로그래밍 언어
        Arrays.stream(langs).filter(x -> x.startsWith("c")).forEach(System.out::println);
        System.out.println("------------------------------------");

        // java라는 글자를 포함하는 언어
        Arrays.stream(langs).filter(x -> x.startsWith("java")).forEach(System.out::println);
        System.out.println("------------------------------------");

        // 4글자 이하의 언어를 정렬해서 출력
        langList.stream().filter(x -> x.length() <= 4).sorted().forEach(System.out::println);
        System.out.println("------------------------------------");

        // 4글자 이하의 언어중에서 c라는 글자를 포함하는 언어
        langList.stream().filter(x -> x.length() <= 4).filter(x -> x.contains("c")).forEach(System.out::println);
        System.out.println("------------------------------------");

        // 4글자 이하의 언어중에서 c라는 글자를 포함하는 언어가 하나라도 있는지 여부 -> anyMatch
        boolean anyMatch = langList.stream().filter(x -> x.length() <= 4).anyMatch(x -> x.contains("c"));
        System.out.println(anyMatch);
        System.out.println("------------------------------------");

        // 4글자 이하의 언어들은 모두 c 라는 글자를 포함하는지 여부
        boolean allMatch = langList.stream().filter(x -> x.length() <= 4).allMatch(x -> x.contains("c"));
        System.out.println(allMatch);
        System.out.println("------------------------------------");

        // 3글자 이하의 언어들은 모두 c 라는 글자를 포함하는지 여부
        allMatch = langList.stream().filter(x -> x.length() <= 3).allMatch(x -> x.contains("c"));
        System.out.println(allMatch);
        System.out.println("------------------------------------");


        // 4글자 이하의 언어들 중에서 c라는 글자를 포함하는 언어 뒤에 (어려워요) 라는 글자를 함께 출력
        // map
        langList.stream()
                .filter(x -> x.length() <= 4)
                .filter(x -> x.contains("c"))
                .map(x -> x + " (어려워요)") // map은 함수를 행한 뒤 반환까지 함
                .forEach(System.out::println);
        System.out.println("--------------------------------------");

        // c라는 글자를 포함하는 언어를 대문자로 출력
        langList.stream()
                .filter(x -> x.contains("c"))
                .map(String::toUpperCase) // 해당 형태 기억해둘 것
                .forEach(System.out::println);
        System.out.println("------------------------------------");

        // c 라는 글자를 포함하는 언어를 대문자로 변경하여 리스트로 저장
        List<String> langListStartWithC = langList.stream()
                .filter(x -> x.contains("c"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        langListStartWithC.forEach(System.out::println);
        System.out.println("------------------------------------");


    }
}

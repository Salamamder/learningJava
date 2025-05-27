package chap_10.converter;

@FunctionalInterface // 함수형 인터페이스라고 마킹 해 놓는 것
// 실수로 뭔가 더 만들어서 꼬이는 일을 방지하는 역할
// 모든 것은 피로 쓰여진다.
public interface Convertible {
    void convert(int USD);

}

package chap_09;

public class _01_Generics {
    public static void main(String[] args) {
        // 제네릭스

        Integer[] iArray = {1, 2, 3, 4, 5}; // 래퍼 클래스로 감싸주려고 Integer 사용, 원래는 int
        Double[] dArray = {1.0, 2.0, 3.0, 4.0, 5.0}; // 래퍼 클래스로 감싸주려고 Double 사용, 원래는 double
        String[] sArray = {"A", "B", "C", "D", "E"}; //

        printIntArray(iArray);
        printDoubleArray(dArray);
        printStringArray(sArray);

        System.out.println("--------------------------------");

        printAnyArray(iArray);
        printAnyArray(dArray);
        printAnyArray(sArray);
    }

    // 제네릭은 일반 자료형 지원 x -> 래퍼 클래스로 감싸줘야 함
    // T : Type, K : Key, V : Value, E : Element  <>
    private static <T> void printAnyArray(T[] array) {
        for (T t : array) {
            System.out.print(t + " "); // 1 2 3 4 5
        }
        System.out.println();
    }


    private static void printDoubleArray(Double[] dArray) {
        for (double i : dArray) {
            System.out.print(i + " "); // 1 2 3 4 5
        }
        System.out.println();
    }


    private static void printStringArray(String[] sArray) {
        for (String i : sArray) {
            System.out.print(i + " "); // 1 2 3 4 5
        }
        System.out.println();
    }


    private static void printIntArray(Integer[] iArray) {
        for (int i : iArray) {
            System.out.print(i + " "); // 1 2 3 4 5
        }
        System.out.println();
    }

}

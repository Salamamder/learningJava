package chap_11;

import java.io.BufferedWriter;

public class _05_TryWithResources {
    public static void main(String[] args) {
        MyFileWriter writer1 = null;
        try {
            writer1 = new MyFileWriter();
            writer1.write("아이스크림이 먹고 싶어요");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                writer1.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        }

        System.out.println("----------------------");
        // try의 괄호() 안에서 객체 정의시
        try (MyFileWriter writer2 = new MyFileWriter()) { // AutoCloseable 인터페이스 구현시
            writer2.write("도넛이 먹고 싶어요"); // 자동으로 close가 호출이 된다.
        } catch (Exception e) {
            e.printStackTrace();
        }

        BufferedWriter bw = null;
    }
}

class MyFileWriter implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("파일을 정상적으로 닫습니다.");
    }

    public void write(String line) {
        System.out.println("파일에 내용을 입력합니다.");
        System.out.println("입력 내용 : " + line);
    }
}

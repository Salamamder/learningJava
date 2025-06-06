package chap_13;

import java.io.File;
import java.io.IOException;

public class _03_File {
    public static void main(String[] args) {
        String fileName = "test.txt";
        File file = new File(fileName);
        try {
            file.createNewFile(); // 파일 생성 (이미 있는경우 진행 x)b
            if (file.exists()) {
                System.out.println("파일 이름 : " + file.getName());
                System.out.println("파일 절대 경로 : " + file.getAbsolutePath());
                System.out.println("파일 크기 (바이트) : " + file.length()); // 10글자 들어가니 10바이트
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

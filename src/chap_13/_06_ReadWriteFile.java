package chap_13;

import java.io.*;

public class _06_ReadWriteFile {
    public static void main(String[] args) {
        // BufferedReader : 파일에서 내용을 읽어올 때
        // BufferedWriter : 파일에 내용을 쓸 때

        // 파일 쓰기
//        try(BufferedWriter bw = new BufferedWriter(new FileWriter("goodjob.txt", true))) {
//            // 뒤에 true 추가시 어펜드 즉 이어쓰기 한다는 뜻 (덮어쓰기 안하고 이어쓰기가 됨)
//            // try의 괄호 안에 객체 선언 해주면 끝날 때 자동으로 닫힘
////            bw.write("1. 이제 거의 끝이 보여요.");
////            bw.newLine();
////            bw.write("2. 여기까지 오신 여러분들 정말 대단해요!");
////            bw.newLine();
//            bw.write("3. 조금만 더 힘내요!");
//        }
//        catch (IOException e) {
//            throw new RuntimeException(e);
//        }


        // 파일 읽기
        try (BufferedReader br = new BufferedReader(new FileReader("goodjob.txt"))) {
            String line;
            while((line = br.readLine()) != null ) {
                System.out.println(line);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

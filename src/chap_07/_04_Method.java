package chap_07;

import org.w3c.dom.ls.LSOutput;

public class _04_Method {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();

        b1.autoReport(); // 지원 안됨
        BlackBox.canAutoReport = true;
        b1.autoReport(); // 지원 됨

        b1.insertMemoryCard((256));


        // 일반 영상 : 1
        // 이벤트 영상 (충돌 감지) : 2
        int fileCount = b1.getVideoFileCount(1);
        System.out.println("일반 영상 파일 수 : " + fileCount + "개");

        fileCount = b1.getVideoFileCount(2);
        System.out.println("이벤트 영상 파일 수 : " + fileCount + "개");
    }
}

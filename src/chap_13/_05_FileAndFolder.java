package chap_13;

import java.io.File;

public class _05_FileAndFolder {
    public static void main(String[] args) {
        // String folder = "."; // 현재 경로라는 의미
        // String folder = "C:\\Users\\EunSung\\Desktop\\WORK\\Develop\\공부\\JAVA\\만든 거\\JavaWorkspace\\src\\chap_13"; // 절대경로 방식
        String folder = "src/chap_13"; // 상대경로 방식 (자바워크스페이스 기준으로 진행됨)
        File filesAndFolders = new File(folder);
        System.out.println("현재 폴더 경로 : " + filesAndFolders.getAbsolutePath());
        for (File file : filesAndFolders.listFiles()) {
            if (file.isFile()) {
                System.out.println("(파일) " + file.getName());
            } else if (file.isDirectory()) {
                System.out.println("(폴더) " + file.getName());
            }
            // System.out.println(file.getName());
        }
    }
}

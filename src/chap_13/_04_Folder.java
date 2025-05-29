package chap_13;

import java.io.File;

public class _04_Folder {
    public static void main(String[] args) {
        String folderName = "A";
        File folder = new File(folderName);
        folder.mkdir();

        if (folder.exists()) {
            System.out.println("폴더가 존재합니다. : " + folder.getAbsolutePath());
        }

        System.out.println("------------------------------------------");
        folderName = "A/B/C";
        // "A" + File.separator + "B" + File.separator + "C"

        // 윈도우 : C:\\Users\\Silverstar\\Desktop
        // 맥 : /Users/Silverstar/Desktop

        folder = new File(folderName);
        folder.mkdir();
        if (folder.exists()) {
            System.out.println("폴더가 존재합니다. : " + folder.getAbsolutePath());
        } else {
            System.out.println("폴더 생성 실패 (mkdir)");
        }

        folder = new File(folderName);
        folder.mkdirs(); // 여러개의 하위폴더로 구성된 폴더 생성은 mkdirs를 사용하면 된다.
        if (folder.exists()) {
            System.out.println("폴더가 존재합니다. : " + folder.getAbsolutePath());
        } else {
            System.out.println("폴더 생성 실패 (mkdir)");
        }
    }
}

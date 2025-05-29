package chap_13;

import java.io.File;

public class _07_DeleteFile {
    public static void main(String[] args) {
        File file = new File("goodjob.txt");
        if (file.exists()) { // 파일 존재시 파일 삭제 코드를 진행하도록 함
            if (file.delete()) { // 삭제 성공시 true를 반환함
                System.out.println("파일 삭제 성공" + file.getName());
            } else {
                System.out.println("파일 삭제 실패 : " + file.getName());
            }
        }

        File folder = new File("A");
        if (folder.exists()) {
            if (folder.delete()) { // A 폴더 밑에 다른 폴더들이 있어서 삭제 실패 함
                // 위의 방식은 가장 하위 폴더부터 차례로 삭제하는것은 가능
                System.out.println("폴더 삭제 성공 : " + folder.getAbsolutePath());
            } else {
                System.out.println("폴더 삭제 실패 : " + folder.getAbsolutePath());
            }
        }

        if (deleteFolder(folder)) {
            System.out.println("*폴더 삭제 성공 : " + folder.getAbsolutePath());
        } else {
            System.out.println("*폴더 삭제 실패 : " + folder.getAbsolutePath());
        }

    }

    // deleteFolder(A)
    //    deleteFolder(B)
    //       deleteFolder(c)
    //       C.delete() 삭제
    //    B.delete() 삭제
    // A.delete 삭제
    // 재귀 호출하는 형태


    public static boolean deleteFolder(File folder) { // 재귀 형식으로 폴더 삭제하는 메서드 생성
        if (folder.isDirectory()) {
            for (File file : folder.listFiles()) {
                deleteFolder(file);
            }
        }
        System.out.println("삭제 대상 : " + folder.getAbsolutePath());
        return folder.delete();
    }
}

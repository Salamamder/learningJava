package chap_05;

// 신발 사이즈는 250 부터 295 까지 5 단위로 증가
// 신발 사이즈 수는 총 10가지

// 사이즈 250 (재고있음)
// 사이즈 255 (재고 있음)
// ...

public class _Quiz_05 {
    public static void main(String[] args) {
        int shoeSize[] = new int[10];
        for (int i = 0; i < shoeSize.length; i++) { // 여기까지 생각이 똑같음
            // shoeSize[i] = 250 + (i * 5); // 이게 더 깔끔함
            if (i == 0) {
                shoeSize[i] = 250;
            }
            else {
                shoeSize[i] = shoeSize[i - 1] + 5;
            }
            System.out.println("사이즈 " + shoeSize[i] + " (재고있음)");
        }

    }
}

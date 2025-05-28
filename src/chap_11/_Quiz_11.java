package chap_11;

import java.security.spec.ECFieldF2m;

public class _Quiz_11 {
    // 문제
    // 인기가 많은 상품이 선착순으로 판매되는 온라인 쇼핑몰에서
    // 발생할 수 있는 문제를 처리하는 프로그램을 작성하시오
    // 조건
    // 발생 가능한 문제의 2가지 조건 : 상품 구매 가능 시간, 상품 매진
    // 각 문제에 대한 사용자 정의 예외 클래스 작성
    // 에러 코드에 따른 의도적 예외 발생 및 예외 처리
    // 모든 클래스는 하나의 파일에 정의
    // 에러코드 0 : 에러없음 -> -
    // 에러코드 1 : 판매 시간 아님 -> 상품 구매는 20시부터 가능합니다.
    // 에러코드 3 : 매진 -> 다음 기회에 이용해주세요.

    public static void main(String[] args) {
        int errorCode = 1;
        try {
            if (errorCode == 0) {
                throw new error0("상품 구매를 완료했습니다.");
            } else if (errorCode == 1) {
                throw new error1("상품 구매 가능 시간이 아닙니다.");
            } else if (errorCode == 2) {
                throw new error2("해당 상품은 매진됐습니다.");
            }
        } catch (error0 e) {
            System.out.println(e.getMessage());
        } catch (error1 e) {
            System.out.println(e.getMessage());
            System.out.println("상품 구매는 20시부터 가능합니다.");
        } catch (error2 e) {
            System.out.println(e.getMessage());
            System.out.println("다음 기회에 이용해주세요.");
        }
    }

//    public static void main(String[] args) {
//        int errorCode = 0;
//        try {
//            if (errorCode == 0) {
//                System.out.println("상품 구매를 완료했습니다.");
//            } else if (errorCode == 1) {
//                throw new NotOnSaleException("상품 구매 가능 시간이 아닙니다.");
//            } else if(errorCode == 2) {
//                throw new soldOutException("해당 상품은 매진됐습니다.");
//            }
//        } catch (NotOnSaleException e) {
//
//        } catch (soldOutException e) {
//
//        }
//
//
//    }
}

//class NotOnSaleException extends Exception {
//    public NotOnSaleException(String message) {
//        super(message);
//    }
//}
//
//class soldOutException extends Exception {
//    public soldOutException(String message) {
//        super(message);
//    }
//}

class error0 extends Exception {
    public error0(String message) {
        super(message);
    }
}

class error1 extends Exception {
    public error1(String message) {
        super(message);
    }
}

class error2 extends Exception {
    public error2(String message) {
        super(message);
    }
}
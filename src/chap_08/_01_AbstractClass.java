package chap_08;

import chap_08.Camera.Camera;
import chap_08.Camera.FactoryCam;
import chap_08.Camera.SpeedCam;

public class _01_AbstractClass {
    public static void main(String[] args) {
        // 데이터 추상화 (data Abstraction)
        // abstract
        // 추상 클래스 (아직 완성되지 않은 클래스)
        // 추상 메소드 (추상 클래스 또는 인터페이스에서만 사용 가능한, 껍데기만 있는 메소드)

        // Camera camera = new Camera(); // 추상클래스는 객체 생성 X
        FactoryCam factoryCam = new FactoryCam();
        factoryCam .showMainFeature();

        SpeedCam speedCam = new SpeedCam();
        speedCam.showMainFeature();
        }
    }


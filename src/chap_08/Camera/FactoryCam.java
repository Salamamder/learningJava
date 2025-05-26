package chap_08.Camera;

import chap_08.detector.Detectable;
import chap_08.reporter.Reportable;

public class FactoryCam extends Camera implements Detectable, Reportable {
    private Detectable detector;
    private Reportable reporter;

    public void setReportor(Reportable reportor) {
        this.reporter = reportor;
    }

    public void setDetector(Detectable detector) {
        this.detector = detector;
    }

    // setter를 통해 기능 구현을 해당 코드문에서 하는게 아니라
    // 받아 써오게 만들었음
    // 코드를 여기서 수정할 필요 x
    // 해당 기능을 담당하는 코드문에서 수정
    // 장점: 나중에 코드(기능) 교체가 용이해짐

    public void showMainFeature() {
        System.out.println("화재 감지");
    }

    @Override
    public void detect() {
        detector.detect();
    }

    @Override
    public void report() {
        reporter.report();
    }
}

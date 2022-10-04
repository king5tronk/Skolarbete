package växt;

import org.junit.jupiter.api.Test;

class PalmTest {
Palm s = new Palm(5, "Laura");
Mat mat = Mat.KRANVATTEN;
double matMängd = mat.basNivå* s.getLängd();
@Test
void getLängd(){
    assert (s.getLängd() == 5);
    assert (s.getLängd() != 2);
}
@Test
    void beräknaMat() {
    assert matMängd == 2.5;
    }
}
package växt;

public class Kaktus extends Växt {
    public Kaktus(double längd, String namn) {
        super(längd, namn);
        mat = Mat.MINERALVATTEN;
    }


    public void beräknaMat() {
        matMängd = mat.basNivå;
    }
}

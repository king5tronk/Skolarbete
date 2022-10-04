package växt;

public class Palm extends Växt {
    public Palm(double längd, String namn) {
        super(längd, namn);
        mat = Mat.KRANVATTEN;
    }

    public void beräknaMat() {
        matMängd = mat.basNivå * getLängd();

    }

}

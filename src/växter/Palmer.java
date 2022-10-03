package växter;

public class Palmer extends Växter{
    public Palmer(double längd, String namn) {
        super(längd, namn);
        mat = Mat.KRANVATTEN;
    }

    public void beräknaMat() {
        matMängd = mat.basNivå * getLängd();

    }

}

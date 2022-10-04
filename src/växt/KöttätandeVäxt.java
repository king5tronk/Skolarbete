package växt;

public class KöttätandeVäxt extends Växt {
    public KöttätandeVäxt(double längd, String namn) {
        super(längd, namn);
        mat = Mat.PROTEINDRYCK;
    }


    public void beräknaMat() {
        matMängd = (mat.extraTillskott * getLängd()) + mat.basNivå;
    }
}

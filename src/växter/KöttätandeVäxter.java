package växter;

public class KöttätandeVäxter extends Växter{
    public KöttätandeVäxter(double längd, String namn) {
        super(längd, namn);
        mat = Mat.PROTEINDRYCK;
    }


    public void beräknaMat() {
        matMängd = (mat.extraTillskott * getLängd()) + mat.basNivå;
    }
}

package växter;

public class Kaktusar extends Växter{
    public Kaktusar(double längd, String namn) {
        super(längd, namn);
        mat = Mat.MINERALVATTEN;
    }


    public void beräknaMat() {
        matMängd = mat.basNivå;
    }
}

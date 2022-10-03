package växter;
public abstract class Växter implements växtInterface{
    private double längd;
    private String namn;
    protected Mat mat;
    protected double matMängd;

    public Växter() {
    }
    public Växter(double längd, String namn) {
        this.längd = längd;
        this.namn = namn;
    }

    public String getNamn() {
        return namn;
    }
    public double getLängd() {
        return längd;
    }
    @Override
    public void beräknaMat(){
    }

    public String skrivUtMat() {
        return "\n" + namn + "\n\nBehöver " + matMängd + " liter\nav " + mat;
    }
    @Override
    public String toString(){
        return this.getNamn();
    }

}

package växter;
public abstract class Växter implements växtInterface{    //Här har jag gjort en class "Växter" som sedan alla andra
                                                        // växter ärver samt implementerar interface.
                                                        // Även gjort variablerna till private och gjort
                                                        // getters till dom.
    private double längd;
    private String namn;
    protected Mat mat;
    protected double matMängd;

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

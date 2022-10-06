package växt;
public abstract class Växt implements växtInterface{    //Här har jag gjort en class "Växter" som sedan alla andra
                                                        // växter ärver samt implementerar interface.
                                                        // Även gjort variablerna till private (inkapsling) och gjort
                                                        // getters till dom.
    private double längd;
    private String namn;
    protected Mat mat;
    protected double matMängd;

    public Växt(double längd, String namn) {
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
    public void beräknaMat(){     //polymorifism, alla som extends "Växt" använder ärvda metoder och använder dom på olika sätt.
    }
    public String skrivUtMat() {
        return "\n" + namn + "\n\nBehöver " + matMängd + " liter\nav " + mat;
    }
    @Override
    public String toString(){
        return this.getNamn();
    }

}

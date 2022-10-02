public abstract class Växter {
    private double längd;
    private String namn;

    public Växter() {
    }
    public Växter(double längd, String namn) {
        this.längd = längd;
        this.namn = namn;
    }

    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }



    public double getLängd() {
        return längd;
    }

    public void setLängd(double längd) {
        this.längd = längd;
    }
}

import java.util.ArrayList;

public class Huvudprogram {

    public Huvudprogram() {
        ArrayList<Växter> växter = new ArrayList<>();
        växter.add(new Palmer(5, "Laura"));
        växter.add(new Kaktusar(0.2, "Igge"));
        växter.add(new KöttätandeVäxter(0.7, "Meatloaf"));
        växter.add(new Palmer(1, "Putte"));



    }









    public static void main(String[] args) {
        Huvudprogram h = new Huvudprogram();


    }
}
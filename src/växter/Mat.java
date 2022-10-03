package växter;

public enum Mat {                        //En special klass med en grupp av variablar som är "final"
                                        // med värden som aldrig ändras.
    KRANVATTEN (0.5, 0.0),
    PROTEINDRYCK (0.1, 0.2),
    MINERALVATTEN (0.02, 0.0);

    public final double basNivå;
    public final double extraTillskott;

    Mat (double b, double t){
        basNivå = b;
        extraTillskott = t;
    }

}

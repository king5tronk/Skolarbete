package program;
import växt.*;

import javax.swing.*;
import java.util.ArrayList;

public class Huvudprogram {
    ArrayList<Växt> växter = new ArrayList<>();
    public Huvudprogram() {

    växterSkapas();
    användareInput();


    }
    private void växterSkapas() {
        växter.add(new Palm(5, "Laura"));
        växter.add(new Kaktus(0.2, "Igge"));
        växter.add(new KöttätandeVäxt(0.7, "Meatloaf"));
        växter.add(new Palm(1, "Putte"));
    }

    public void användareInput() {
        boolean repeat = true;
        do {
            String input = JOptionPane.showInputDialog(null, "Vilken växt ska få mat?");
            input = input.replaceAll("\\s", "");
                hämtaPlanta(input);
                skrivUtVäxtOchBeräkna(input);
        } while(repeat);
    }

    public void skrivUtVäxtOchBeräkna(String input){
        try {
            Växt växt = hämtaPlanta(input);
            växt.beräknaMat();
            JOptionPane.showMessageDialog(null, växt.skrivUtMat());
        }catch (NullPointerException e){
            JOptionPane.showMessageDialog(null, "Finns ingen planta med det namnet, försök igen!");
        }
    }
    private Växt hämtaPlanta(String input){
        //try {
            for (Växt växt : växter) {
                if (input.equalsIgnoreCase(växt.getNamn())) {
                    return växt;
                }
            }
        return null;
    }





    public static void main(String[] args) {
        Huvudprogram h = new Huvudprogram();


    }
}
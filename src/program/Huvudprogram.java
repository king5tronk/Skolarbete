package program;
import växter.*;

import javax.swing.*;
import java.util.ArrayList;

public class Huvudprogram {
    ArrayList<Växter> växter = new ArrayList<>();
    public Huvudprogram() {

    växterSkapas();
    användareInput();


    }
    private void växterSkapas() {
        växter.add(new Palmer(5, "Laura"));
        växter.add(new Kaktusar(0.2, "Igge"));
        växter.add(new KöttätandeVäxter(0.7, "Meatloaf"));
        växter.add(new Palmer(1, "Putte"));
    }

    public void användareInput() {
        boolean repeat = true;
        do {
            String input = JOptionPane.showInputDialog(null, "Vilken växt ska få mat?");
            input = input.replaceAll("\\s", "");
            switch (input.toUpperCase()) {
                case "IGGE":
                case "LAURA":
                case "PUTTE":
                case "MEATLOAF":
                    hämtaPlanta(input);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Felaktiv inmatning, försök igen!");


            }
        } while(repeat);
    }
    private String hämtaPlanta(String input){
        for (Växter växt : växter) {
            if (input.equalsIgnoreCase(växt.toString())) {
                växt.beräknaMat();
                JOptionPane.showMessageDialog(null, växt.skrivUtMat());
            }
        }
        return null;
    }





    public static void main(String[] args) {
        Huvudprogram h = new Huvudprogram();


    }
}
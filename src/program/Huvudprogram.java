package program;
import växter.*;

import javax.swing.*;
import java.util.ArrayList;

public class Huvudprogram {
    ArrayList<Växter> växter = new ArrayList<>();
    String input;



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
                    for (Växter växt : växter) {
                        if (input.equalsIgnoreCase(växt.toString())) {
                            växt.beräknaMat();
                            JOptionPane.showMessageDialog(null, växt.skrivUtMat());
                        }
                    }
                    repeat = false;
                    break;
                case "LAURA":
                    System.out.println("Laura");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Felaktiv inmatning, försök igen!");


            }
        } while(repeat);
    }
    private void getPlant(){
        for (Växter växt : växter) {
            if (input.equals(växt.getNamn())) {
                växt.skrivUtMat();
            }
        }
    }





    public static void main(String[] args) {
        Huvudprogram h = new Huvudprogram();


    }
}
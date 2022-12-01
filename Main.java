/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fahrrad;

/**
 *
 * @author bekns
 */
public class Main {
    public static Fahrrad f1;
    public static Fahrrad f2;
    public static Fahrrad f3;
    public static Fahrrad f4;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        f1 = new Fahrrad(21614, 2, "Damit hat er nicht gerechnet", 200.0);
        f2 = new Fahrrad(45355, 2, "Game Over", 400.00);
        f3 = new Fahrrad(10115, 2, "Atemlos durch die Nacht…", 800.00);
        f4 = new Fahrrad(68309, 2, "Ich bin dann mal weg!", 1600.00);

        f1.setPreis(2);
        f2.setPreis(4);
        f3.setPreis(8);
        f4.setPreis(16);

        System.out.println("Preis: " + getBilligsteFahrrad().getPreis());

    }

    public static Fahrrad getBilligsteFahrrad() {
        Fahrrad cheapest = f1;

        if (cheapest.getPreis() > f2.getPreis()) {
            cheapest = f2;
        }
        if (cheapest.getPreis() > f3.getPreis()) {
            cheapest = f3;
        }
        if (cheapest.getPreis() > f4.getPreis()) {
            cheapest = f4;
        }
        return cheapest;
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fahrrad;

/**
 *
 * @author bekns
 */
public class Fahrrad {
    // Eigenschaften

    private int artikelnummer;
    private int reifengroesse;
    private String marke;
    private double preis;

    // Konstruktor
    public Fahrrad(int artikelnummer, int reifengroesse, String marke, double preis) {
        this.artikelnummer = artikelnummer;
        this.reifengroesse = reifengroesse;
        this.marke = marke;
        this.preis = preis;
    }

    public int getArtikelnummer() {
        return this.artikelnummer;
    }

    public int getReifengroesse() {
        return this.reifengroesse;
    }

    public String getMarke() {
        return this.marke;
    }

    public double getPreis() {
        return this.preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

}
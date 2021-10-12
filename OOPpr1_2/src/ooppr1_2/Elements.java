/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooppr1_2;

/**
 *
 * @author Sulearvuti 02 lenovo
 */
public class Elements {
    private String element;
    private int number;
    private String symbol;
    private double weight;
    private double boil;
    private double melt;  
    private double density; 
    private double vapour;
    private double fusion;

    public Elements() {
    }

    public Elements(String element, int number, String symbol, double weight, double boil) {
        this.element = element;
        this.number = number;
        this. symbol = symbol;
        this.weight = weight;
        this.boil = boil;
        
    }
        public Elements(String element, int number, String symbol, double weight) {
        this.element = element;
        this.number = number;
        this. symbol = symbol;
        this.weight = weight;
        
    }

    public Elements(String element, int number, String symbol, double weight, double boil, double melt, double density, double vapour, double fusion) {
        this.element = element;
        this.number = number;
        this.symbol = symbol;
        this.weight = weight;
        this.boil = boil;
        this.melt = melt;
        this.density = density;
        this.vapour = vapour;
        this.fusion = fusion;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getBoil() {
        return boil;
    }

    public void setBoil(double boil) {
            this.boil = boil;
    }

    public double getMelt() {
        return melt;
    }

    public void setMelt(double melt) {
        this.melt = melt;
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
    }

    public double getVapour() {
        return vapour;
    }

    public void setVapour(double vapour) {
        this.vapour = vapour;
    }

    public double getFusion() {
        return fusion;
    }

    public void setFusion(double fusion) {
        this.fusion = fusion;
    }

    @Override
    public String toString() {
        return "Elements{" + "Element: " + element + ", Number: " + number + ", Sümbol: " + symbol + ", Mass: " + weight + ", Keemistemperatuur: " + boil + ", Sulamistemperatuur: " + melt + ", Tihedus: " + density + ", Aurumine: " + vapour + ", Tuumas[ntees: " + fusion + '}';
    }
    
    
    
}

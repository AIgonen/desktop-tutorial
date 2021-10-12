/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package software;

import java.util.Date;

/**
 *
 * @author Sulearvuti 02 lenovo
 */
public class CommercialSoftware extends Shareware {
    public double price;

    public CommercialSoftware(double price, String name, String developer, Date instalDate, int workdays) {
        super(name, developer, instalDate, workdays);
        this.price = price;
    }    

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "CommercialSoftware" + super.toString().replace("Shareware", "") + " price" + price ; 
    }
    
    
}

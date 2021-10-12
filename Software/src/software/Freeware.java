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
public class Freeware extends Software{

    public Freeware(String name, String developer, Date instalDate) {
        super(name, developer, instalDate);
    }

    @Override
    public boolean isTimeLimit() {
        return false; 
    }

    @Override
    public String toString() {
        return "Freeware " + super.toString().replace("Software", "");
    }
    
    
    
    
    
}

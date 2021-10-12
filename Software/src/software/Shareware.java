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
public class Shareware extends Software{
    
    private int workdays;

    public Shareware(String name, String developer, Date instalDate, int workdays) {
        
        super(name, developer, instalDate);
        
        this.workdays = workdays;
    }

    public int getWorkdays() {
        return workdays;
    }

    public void setWorkdays(int workdays) {
        this.workdays = workdays;
    }
    
    

    @Override
    public boolean isTimeLimit() {
        boolean limit = true;
        
        return limit; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Freeware " + super.toString().replace("Software", "");
    }
    
    
    
    
    
    
}

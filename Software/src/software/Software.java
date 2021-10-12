/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package software;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Sulearvuti 02 lenovo
 */
public abstract class Software {

    /**
     * @param args the command line arguments
     */
    
    private String name;
    private String developer;
    private Date instalDate;

    public Software(String name, String developer, Date instalDate) {
        this.name = name;
        this.developer = developer;
        this.instalDate = instalDate;
    }

    public String getName() {
        return name;
    }

    public String getDeveloper() {
        return developer;
    }

    public Date getInstalDate() {
        return instalDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public void setInstalDate(Date instalDate) {
        this.instalDate = instalDate;
    }
    
    public abstract boolean isTimeLimit();

    @Override
    public String toString() {
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        
        String dateString = format.format( instalDate ); 
        return "Software{" + "name=" + name + ", developer=" + developer + ", instalDate=" + dateString + '}';
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

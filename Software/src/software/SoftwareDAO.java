/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package software;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sulearvuti 02 lenovo
 */
public class SoftwareDAO {
    public static List<Software> soft = new ArrayList();
    
    static {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        
        Date date;
        
        try {
            date = sdf.parse("24.09.2021");
            Freeware f = new Freeware("Notepad++", "Don Ho", date);
            soft.add(f);
            
            date = sdf.parse("01.09.2021");
            Shareware sw = new Shareware("Antivir kasper", "kasper", date, 14);
            soft.add(sw);
            
            date = sdf.parse("01.01.2021");
            CommercialSoftware cs = new CommercialSoftware(12.34, "Win 10", "win", date, 365);
            soft.add(cs);
            
        } catch (ParseException ex) {
            Logger.getLogger(SoftwareDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooppr1_2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sulearvuti 02 lenovo
 */
public class ElementsDAO {
    public static List<Elements> elements = new ArrayList();
    
    static{
        try {
            Scanner scn = new Scanner(new FileReader("elements.csv"));
        
            String[] headingline = scn.nextLine().split(","); //heading
            
            while(scn.hasNext())
            {
                String[] line = scn.nextLine().split(",");
                
                Elements e = new Elements(line[0], Integer.parseInt(line[1]), line[2], Double.parseDouble(line[3]));
                elements.add(e);  
            }
            
        } catch (FileNotFoundException ex) {
             Logger.getLogger(ElementsDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static List<Elements> findElement(String name) {
       List<Elements> finds = new ArrayList();
       
        for(Elements e : elements){           
            if(e.getElement().equalsIgnoreCase(name)){
                finds.add(e);
            }
        }
        return finds;
    }
            
    public static double findElementsWeight(String symbol) {
        
        
        List<Elements> finds = new ArrayList();
        double weight = 0;
        
        for(Elements e : elements){
            if(e.getSymbol().equals(symbol)){
                finds.add(e);
                weight = e.getWeight();
            }
        }
        
        return weight;
    }
    
}

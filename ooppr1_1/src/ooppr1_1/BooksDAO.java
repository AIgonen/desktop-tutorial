/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooppr1_1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sulearvuti 02 lenovo
 */
public class BooksDAO {
    public static List<Book> books = new ArrayList();
    
    static
    {
        try {
            Scanner scn = new Scanner(new FileReader("Books.csv"));
        
            String[] headingline = scn.nextLine().split(";"); //heading
            
            while(scn.hasNext())
            {
                String[] line = scn.nextLine().split(";");
                
                Book b = new Book(line[0], line[1], line[2], line[3], Double.parseDouble(line[4].replace(',', '.')), Integer.parseInt(line[5]));
                books.add(b);  
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BooksDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static List<Book> findByType(String type){
        List<Book> finds = new ArrayList();
        
        for(Book b : books){
            if(b.getType().equalsIgnoreCase(type)){
                finds.add(b);
            }
        }
        
        return finds;
    }
    
    public static List<Book> findByPrice(double minPrice, double maxPrice){
        List<Book> finds = new ArrayList();
        
        for(Book b : books){
            if(b.getPrice() >= minPrice && b.getPrice() <= maxPrice){
                finds.add(b);
            }
        }
        
        return finds;
    }
    
    public static List<Book> findBookByMultipleParam(String booksId, int booksQuantity){
        List<Book> finds = new ArrayList();
        
        for(Book b : books){
            if(b.getId().equals(booksId) || b.getQty() == booksQuantity){
                finds.add(b);
            }
        }
        
        //b.getAuthor().equalsIgnoreCase(booksAuthor) ||
        return finds;
    }
}

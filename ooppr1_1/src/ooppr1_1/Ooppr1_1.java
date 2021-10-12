/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooppr1_1;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Andrei Igonen
 * 
 * Loo klass Book, mis sisaldab välju, meetodeid get/ set (omadused), konstruktoreid, toString meetodit, ja (teine klass) meetodeid, mis realiseerivad järgmisi ülesandeid: 
Näita  määratud kategooria (nt Database, Programming ...) raamatuid
Näita raamatuid, mis kuuluvad teatud hinnaklassi (näiteks raamatu hind, vahemikus 15-30 eurot)
Otsi raamatuid erinevate kriteeriumite järgi (nt autor, pealkiri, pealkirja fragment ...)
Andmed on failis Books.csv
 */
public class Ooppr1_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
       
        int menu;
        
        do {
        System.out.println("");
        System.out.println("\n Menu:");
        System.out.println(" 0 - Exit");
        System.out.println(" 1 - Show all books.");
        System.out.println(" 2 - Search books by type.");
        System.out.println(" 3 - Show books by priceclass.");
        System.out.println(" 4 - Search books by ID or quantity.");
            if(scn.hasNextInt()){
                menu = scn.nextInt();
                switch (menu){
                    case 0 : System.out.println("Good Buy!"); break;
                    case 1 : FindAllBooks(); break; // find all book in a csv file
                    case 2 : FindBookByType(); break; // find book by type
                    case 3 : FindBookByPrice(); break; // find books by price   
                    case 4 : FindBookByMultipleParameters(); break; // find books by ID or quantity
                }
            } else 
                System.out.println("Viga. proovi uuesti"); break;
        } while(menu != 0);    
        
    }
    public static void FindAllBooks(){
        List<Book> books = BooksDAO.books;
        
        for(Book b : books){
            System.out.println(b);
        }
    }
    public static void FindBookByType(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a book type to find");
        String bookType = scn.next();
        
        List<Book> booksByType = BooksDAO.findByType(bookType);
        
        for(Book b : booksByType){
            System.out.println(b);
        }
    }
    
    public static void FindBookByPrice(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a prices between which to seacrhc books");
        System.out.println("Enter a minimal price");
        double minPrice = scn.nextDouble();
        
        System.out.println("Enter a maximal price");
        double maxPrice = scn.nextDouble(); 
        
        List<Book> booksByPrice = BooksDAO.findByPrice(minPrice, maxPrice);
        
        for(Book b : booksByPrice){
            System.out.println(b);
        }
    }
    
    public static void FindBookByMultipleParameters(){
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Enter a books ID");
        String booksId = scn.next();
        
        System.out.println("Enter a books quantity");
        int booksQuantity = scn.nextInt();
        
        System.out.println("Found books:");
        
        List<Book> booksByMultipleParam = BooksDAO.findBookByMultipleParam(booksId, booksQuantity);
        
        for(Book b : booksByMultipleParam){
            System.out.println(b);
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooppr1_1;

/**
 *
 * @author Sulearvuti 02 lenovo
 */
public class Book {
    // fields
    private String id;
    private String type;
    private String title;
    private String author;
    private double price;
    private int qty;
    
    //empty constructor
    public Book()
    {
        
    }
    
    //constructor

    public Book(String id, String type, String title, String author, double price, int qty) {
        this.id = id;
        this.type = type;
        this.title = title;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price >= 0)
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        if(qty>=0)
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Raamat: {" + "id=" + id + ", tüüp: " + type + ", Pealkiri: " + title + ", Autor: " + author + ", Hind: " + price + ", Kogus: " + qty + '}';
    }
    
    
}

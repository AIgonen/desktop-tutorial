/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooppr3;

/**
 *
 * @author Sulearvuti 02 lenovo
 */
public class Shape implements IShape, Comparable<Shape> {

    public Shape() {
    }

    
    
    @Override
    public double getArea() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getPerimeter() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    public int compareTo(Shape t) {
         if(this.getArea() < t.getArea())
            return -1;
        else if (this.getArea() > t.getArea())
            return 1;
        else
            return 0;
    }
    
}

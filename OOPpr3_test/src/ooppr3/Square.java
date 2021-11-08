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
public class Square implements IShape{

    private Line line1;
    private Line line2;
    private Line line3;
    private Line line4;
    
    private Point point1;
    private Point point2;

    public Square(Line line1, Line line2, Line line3, Line line4) {
        this.line1 = line1;
        this.line2 = line2;
        this.line3 = line3;
        this.line4 = line4;
    }

    public Square() {
    }
    
    
    
    
    @Override
    public double getArea() {
        return line1.getLineLength() * line2.getLineLength() * line3.getLineLength() * line4.getLineLength();
    }

    @Override
    public double getPerimeter() {
        return line1.getLineLength() + line2.getLineLength() + line3.getLineLength() + line4.getLineLength();
    }

    @Override
    public String toString() {
        return "Square{" + "a=" + String.format("%.2f",line1.getLineLength()) + ", b=" + String.format("%.2f",line2.getLineLength()) + ", c=" + String.format("%.2f",line3.getLineLength()) + ", d=" + String.format("%.2f",line4.getLineLength()) + ", P=" + String.format("%.2f",getPerimeter()) + ", S=" + String.format("%.2f",getArea()) + '}';
    }
    
//    @Override
//    public int compareTo(IShape t) {
//        if(this.getArea() < t.getArea())
//            return -1;
//        else if (this.getArea() > t.getArea())
//            return 1;
//        else
//            return 0;
//    }
    
}

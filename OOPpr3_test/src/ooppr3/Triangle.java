/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooppr3;

import ooppr3.Line;

/**
 *
 * @author Andrei Igonen
 */
public class Triangle implements IShape, ITriangle{
    private Line line1;
    private Line line2;
    private Line line3;
    
    private Point point1;
    private Point point2;
    
  
    

    public Triangle(Line line1, Line line2, Line line3) {
        this.line1 = line1;
        this.line2 = line2;
        this.line3 = line3;
    }

    

    @Override
    public double getArea() {
        return Math.sqrt(Math.abs(getPerimeter() * (getPerimeter() - line1.getLineLength()) * (getPerimeter() - line2.getLineLength()) * (getPerimeter() - line3.getLineLength())));
    }

    @Override
    public double getPerimeter() {
        return (line1.getLineLength() + line2.getLineLength() + line3.getLineLength()) / 2;
    }

    @Override
    public double getH() {
        return Math.sqrt(Math.pow(line2.getLineLength(), 2) - Math.pow(line1.getLineLength() / 2, 2));
    }


    @Override
    public String toString() {
        return "Triangle{" + "H=" + String.format("%.2f",getH()) + ", S=" + String.format("%.2f",getArea()) + " ,P=" + String.format("%.2f",getPerimeter()) + '}';
    }  
    
//    @Override
//    public int compareTo(IShape t) {
//       if(this.getArea() < t.getArea())
//            return -1;
//        else if (this.getArea() > t.getArea())
//            return 1;
//        else
//            return 0;
//    }
}

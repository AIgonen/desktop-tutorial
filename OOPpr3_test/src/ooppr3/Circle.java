package ooppr3;


import ooppr3.ICircle;
import ooppr3.Point;
import ooppr3.IShape;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sulearvuti 02 lenovo
 */
public class Circle implements IShape, ICircle {
    private Point center;
    private Point inline;

    
    public Circle(Point center, Point inline) {
        this.center = new Point();
        this.inline = new Point(10, 10);
    }

    Circle() {
        this.center = new Point();
        this.inline = new Point(0, 0);
    }
    
    
    
    @Override
    public double getArea() {
        return 4;
    }

    @Override
    public double getPerimeter() {
        return 2 * 3.14 * getR();
    }

    @Override
    public double getR() {
        return Math.sqrt(Math.pow(center.getX() - inline.getX(), 2) + Math.pow(center.getY() - inline.getY(), 2));
    }

    @Override
    public double getD() {
        return 2 * getR();
    }

    
    @Override
    public String toString() {
        return "Circle{" + "r=" + String.format("%.2f", getR()) + ", d=" + String.format("%.2f", getD()) + ", S=" + getArea() + " ,P=" + String.format("%.2f",getPerimeter()) + '}';
    }

    
//    public int compareTo(IShape t) {
//       if(this.getArea() < t.getArea())
//            return -1;
//        else if (this.getArea() > t.getArea())
//            return 1;
//        else
//            return 0;
//    }
    
}

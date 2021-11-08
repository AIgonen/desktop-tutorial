/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooppr3;

/**
 *
 * @author Andrei Igonen
 */
public class Line {
    private Point p1;
    private Point p2;

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Line() {
        this.p1=new Point();
        this.p2=new Point(10,10);
    }

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }
    
    @Override
    public String toString() {
        return "Line{" + "p1=" + p1 + ", p2=" + p2 + '}';
    }
    
    public double getLineLength()
    {
        double l;
        
        l=Math.sqrt(Math.pow((p1.getX()-p2.getX()), 2)+(p1.getY()-p2.getY()));
        return l;
    }
}

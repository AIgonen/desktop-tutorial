/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooppr1_2;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Andrei Igonen
 * Analüüsige fail elements.csv. Looge klass ChemicalElement, mis sisaldab välju, meetodeid get/ set (omadused), konstruktoreid, toString.
 * Loo klass mis loeb faili ja loob keemiliste elementide listi ja vajalikud meetodid otsimiseks ja andmete arvutamiseks.

* Programmis realiseeri menüü:
* Otsi element nimetuse järgi massiivist ja kuva andmed
* Kasutaja sisestab molekulaarvalemi, näiteks, H2O ja programm arvutab molekulaarkaalu.
 */
public class OOPpr1_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        
//       List<Elements> element = ElementsDAO.elements;
//        
//        for(Elements e : element){
//            System.out.println(e);
//        }
//       
       // FindElement();
       FindElementsWeight();
    }   
    public static void FindElement(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a name of an element");
        String elementsName = scn.next();
        
        List<Elements> elementName = ElementsDAO.findElement(elementsName);
        
        System.out.println(elementName);     
    }
    
    public static void FindElementsWeight(){
        
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a Symbol of an element");
        String elementsSymbol = scn.next();
        
     //   List<Elements> elementSymbol = ElementsDAO.findElementsWeight(elementsSymbol);
        
        double weight = ElementsDAO.findElementsWeight(elementsSymbol);;
        
        System.out.println(weight); 
    }
    
    
}

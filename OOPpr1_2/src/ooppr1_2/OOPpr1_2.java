/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooppr1_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        System.out.println("Enter a formula");
        String formula = scn.next();
        
     //   List<Elements> elementSymbol = ElementsDAO.findElementsWeight(elementsSymbol);
         List<String> el = new ArrayList(); 
       
        Pattern r =  Pattern.compile("A[cglmrstu]|B[aehikr]?|C[adeflmnorsu]?|D[bsy]|E[rsu]|F[elmr]?|G[ade]|H[efgos]?|I[nr]?|Kr?|L[airuv]|M[dgnot]|N[abdeiop]?|Os?|P[abdmortu]?|R[abefghnu]|S[bcegimnr]?|T[abcehilm]|U(u[opst])?|V|W|Xe|Yb?|Z[nr]|\\d|\\(|\\)");
        Matcher matcher =r.matcher(formula);
        
    while (matcher.find()) {
     //   System.out.print("Start index: " + matcher.start());
     //   System.out.print(" End index: " + matcher.end() + " ");
        el.add(matcher.group());
    }
        double weight, sum = 0;
    for (String s : el){
        weight = ElementsDAO.findElementsWeight(s);
        sum = sum + weight;
    }
        
        
        System.out.println(sum); 
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopex4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.*;
import org.json.simple.parser.*;

import org.codehaus.jackson.*;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

/**
 *
 * @author Sulearvuti 02 lenovo
 */
public class OOPex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException, ParseException, java.text.ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        
            People p1 = new People();
            p1.setFirstname("Kalle");
            p1.setLastname("Part");
            p1.setId(1);
            p1.setBirthday(sdf.parse("15.07.1987"));
            p1.setEmails(new String[] {"ivan.ivanov@mail.ru","ivan@test.com"});
            p1.setLanguages(new String[] {"Hindu", "English", "Estonian"});
            
            People p2 = new People();
            p2.setFirstname("Ivan");
            p2.setLastname("Isupov");
            p2.setId(2);
            p2.setBirthday(sdf.parse("15.07.1978"));
            p2.setEmails(new String[] {"ivan.ivanov@mail.ru","ivan@test.com"});
            p2.setLanguages(new String[] {"Spanish", "English"});
            
            People p3 = new People();
            p3.setFirstname("Stepan");
            p3.setLastname("Karginov");
            p3.setId(3);
            p3.setBirthday(sdf.parse("22.12.2000"));
            p3.setEmails(null);
            p3.setLanguages(new String[] {"Idish"});
            
        JSONArray pplList=new JSONArray();
        pplList.add(p1);
        pplList.add(p2);
        pplList.add(p3);

            readPeopleObject();
        //  writePeopleObject(pplList);
          

    }
    private static void writePeopleObject(JSONArray pplList) throws IOException{
        
        InputStream inputStream = new FileInputStream(new File("people.json"));
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File("people.json"), pplList);
     //  inputStream.close();
    }

    
    private static void readPeopleObject(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        try {
            ObjectMapper mapper = new ObjectMapper();
            InputStream inputStream = new FileInputStream(new File("people.json"));
            TypeReference<List<People>> typeReference = new TypeReference<List<People>>() {};
            List<People> people = mapper.readValue(inputStream, typeReference);
//            for(People p : people){
//                System.out.println("Firstname: " + p.getFirstname() + " Lastname: " + p.getLastname() + " Born on: " + sdf.format(p.getBirthday()) + " Emails: " + Arrays.toString(p.getEmails())+ " Languages: " + Arrays.toString(p.getLanguages()));
//            }
            whereIsNoEmail(people); // seaches for people without email adresses
            whereIsMoreThen2Languages(people);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(OOPex4.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(OOPex4.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private static void whereIsNoEmail(List<People> people){
       SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        
       for(People p : people){
           if(p.getEmails() == null)
           {
                System.out.println("Firstname: " + p.getFirstname() + " Lastname: " + p.getLastname() + " Born on: " + sdf.format(p.getBirthday()) + " Emails: " + Arrays.toString(p.getEmails())+ " Languages: " + Arrays.toString(p.getLanguages()));
           }
       }
    }
    
    private static void whereIsMoreThen2Languages(List<People> people){
       SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        
       for(People p : people){
           if(p.Languages.length > 2)
           {
                System.out.println("Firstname: " + p.getFirstname() + " Lastname: " + p.getLastname() + " Born on: " + sdf.format(p.getBirthday()) + " Emails: " + Arrays.toString(p.getEmails())+ " Languages: " + Arrays.toString(p.getLanguages()));
           }
       }
        }
    

}

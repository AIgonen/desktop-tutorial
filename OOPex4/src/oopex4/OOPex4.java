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
            p1.setLanguages(new String[] {"Hindu", "English"});
            
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
            p3.setEmails(new String[] {"ks@hotmail.com","karginn@outlook.com"});
            p3.setLanguages(new String[] {"Idish"});
            
        JSONArray pplList=new JSONArray();
        pplList.add(p1);
        pplList.add(p2);
        pplList.add(p3);

            readPeopleObject();
        //    writePeopleObject(pplList);

        
   

        
        
        // ПОЧЕМУ ЗАПИСИ В ДЖИСОН ФАЙОЕ ДУБЛИРУЮТСЯ С МАЛЕНИКОЙ БУКВЫ??????
//      WRITE TO A FILE
//        InputStream inputStream = new FileInputStream(new File("people.json"));
//        JSONArray pplList=new JSONArray();
//        pplList.add(p1);
//        pplList.add(p2);
//        pplList.add(p3);
//        ObjectMapper mapper = new ObjectMapper();
//        mapper.writeValue(new File("people.json"), pplList);
//        inputStream.close();
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
            for(People p : people){
                System.out.println("Firstname: " + p.getFirstname() + " Lastname: " + p.getLastname() + " Born on: " + sdf.format(p.getBirthday()) + " Emails: " + Arrays.toString(p.getEmails())+ " Languages: " + Arrays.toString(p.getLanguages()));
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(OOPex4.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(OOPex4.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}

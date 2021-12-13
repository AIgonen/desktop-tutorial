/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopex4;

import org.codehaus.jackson.*;
import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import java.text.SimpleDateFormat;
import java.util.*;


@JsonIgnoreProperties(ignoreUnknown=true)
public class People implements java.io.Serializable{ 
    Date date = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");

    public int id;
    public String Lastname;
    public String Firstname;
    public Date Birthday;
    public String[] Emails;
    public String[] Languages;

    public People(int id, String Lastname, String Firstname, Date Birthday, String[] Emails, String[] Languages) {
        this.id = id;
        this.Lastname = Lastname;
        this.Firstname = Firstname;
        this.Birthday = Birthday;
        this.Emails = Emails;
        this.Languages = Languages;
    }

    public String[] getEmails() {
        return Emails;
    }

    public void setEmails(String[] Emails) {
        this.Emails = Emails;
    }

    public String[] getLanguages() {
        return Languages;
    }

    public void setLanguages(String[] Languages) {
        this.Languages = Languages;
    }
    

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String Lastname) {
        this.Lastname = Lastname;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String Firstname) {
        this.Firstname = Firstname;
    }

    public Date getBirthday() {
        return Birthday;
    }

    public void setBirthday(Date Birthday) {
        this.Birthday = Birthday;
    }

    
    public People(){
        
    }
    public People(int id, String Lastname, String Firstname, Date Birthday) {
        this.id = id;
        this.Lastname = Lastname;
        this.Firstname = Firstname;
        this.Birthday = Birthday;
    }
    
    public static void searchList (){
        
    }
      
}

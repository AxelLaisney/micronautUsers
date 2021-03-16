package fr.java.micronautusers.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

//class that describe a table in the database
@Entity //define that it's an entity that describe a table in a database
@Data //lombok annotion that allow use to not have to write all getter and setter
public class Users {
    @Id //define that user_id is the primary key
    private int user_id;
    private String user_fname;
    private String user_lname;
    private String user_email;
    private String user_phone;

    //Class controller to create an User object
    public Users(String user_fname, String user_lname, String user_email, String user_phone){
        this.user_fname = user_fname;
        this.user_lname = user_lname;
        this.user_email = user_email;
        this.user_phone = user_phone;
    }
}


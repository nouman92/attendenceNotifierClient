/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagementsystem.models;

import java.util.Date;

/**
 *
 * @author nouman
 */
public class student {
    public String id;
    public String name;
    public String classId;   
    public boolean attendence;
    public Date date;
    public student(String id, String name, String classId, boolean attendence, Date date){
        this.id = id ;
        this.name = name;
        this.classId = classId;
        this.attendence = attendence;
        this.date = date;
    }
}

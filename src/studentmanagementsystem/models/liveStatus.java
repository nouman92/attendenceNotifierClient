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
public class liveStatus {
    public Date date;
    public String presentStudent;
    public String absentStudent;
    public String totalStudent;
    public liveStatus(String present, String absent, String total, Date date){
        this.presentStudent = presentStudent;
        this.absentStudent = absentStudent;
        this.totalStudent = totalStudent;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagementsystem.models;

/**
 *
 * @author nouman Anjum
 */
public class SystemUser {
    public String username;
    public String password;
    public boolean logedin;
    
    public SystemUser(String userName,String password,boolean loggedIn){
        this.username = userName;
        this.password = password;
        this.logedin = loggedIn;
    }
}

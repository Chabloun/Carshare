/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ENTITIES;

import java.sql.Date;

/**
 *
 * @author Rissen
 */
public class Client {
    private int Id;
    private String Login;
    private String Password;
    private String LastName;
    private String FirstName;
    private String Sexe;
    private String Address;
    private String Email;
    private Date DateB;
    private String City;
    private int Rank;


    public int getId(){
        return Id;
    }
    public void setId(int x){
        this.Id=x;
    }
    public String getLogin(){
        return Login;
    }
    public void setLogin(String x){
        this.Login=x;
    }
    public String getPassword(){
        return Password;
    }
    public void setPassword(String x){
        this.Password=x;
    }
    public String getLastName(){
        return LastName;
    }
    public void setLastName(String x){
        this.LastName=x;
    }
    public String getFirstName(){
        return FirstName;
    }
    public void setFirstName(String x){
        this.FirstName=x;
    }
    public String getSexe(){
        return Sexe;
    }
    public void setSexe(String x){
        this.Sexe=x;
    }
    public String getAddress() {
        return Address;
    }
    public void setAddress(String x){
        this.Address=x;
    }
    public String getEmail() {
        return Email;
    }
    public void setEmail(String x){
        this.Email=x;
    }
    public Date getDateB() {
        return DateB;
    }
    public void setDateB(Date x){
        this.DateB=x;
    }
    public String getCity() {
        return City;
    }
    public void setCity(String x){
        this.City=x;
    }
    public int getRank() {
        return Rank;
    }
    public void setRank(int x){
        this.Rank=x;
    }

}




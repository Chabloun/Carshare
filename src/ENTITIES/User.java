/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ENTITIES;

import java.sql.Date;

/**
 *
 * @author Karray
 */
public class User {

    private int Id;
    private String Login;
    private String Password;
    private String LastName;
    private String FirstName;
    private String Address;
    private String Email;
    private Date DateB;
    private String City;
    private int Rank;
    
    public User(){
        this.Id=0;
        this.Login="";
        this.Password="";
        this.LastName="";
        this.FirstName="";
        this.Address="";
        this.Email="";
        this.DateB=new Date(2013,1,1);
        this.City="";
        this.Rank=0;
    }
    
    /**
     *
     * @param id
     * @param login
     * @param password
     * @param lastname
     * @param firstname
     * @param address
     * @param email
     * @param dateb
     * @param city
     * @param rank
     */
    public User(String login,String password,String lastname,String firstname,String address,String email,Date dateb,String city,int rank){
        this.Id=0;
        this.Login=login;
        this.Password=password;
        this.LastName=lastname;
        this.FirstName=firstname;
        this.Address=address;
        this.Email=email;
        this.DateB=dateb;
        this.City=city;
        this.Rank=rank;
    }

    public int getId() {
        return Id;
    }    
    public String getLogin() {
        return Login;
    }
    public String getPassword() {
        return Password;
    }
    public String getLastName() {
        return LastName;
    }
    public String getFirstName() {
        return FirstName;
    }
    public String getAddress() {
        return Address;
    }
    public String getEmail() {
        return Email;
    }
    public Date getDateB() {
        return DateB;
    }
    public String getCity() {
        return City;
    }
    public int getRank() {
        return Rank;
    }
    
    public void setId(int a) {
        this.Id=a;
    }    
    public void setLogin(String a) {
        this.Login=a;
    }
    public void setPassword(String a) {
        this.Password=a;
    }
    public void setLastName(String a) {
        this.LastName=a;
    }
    public void setFirstName(String a) {
        this.FirstName=a;
    }
    public void setAddress(String a) {
        this.Address=a;
    }
    public void setEmail(String a) {
        this.Email=a;
    }
    public void setDateB(Date a) {
        this.DateB=a;
    }
    public void setCity(String a) {
        this.City=a;
    }
    public void setRank(int a) {
        this.Rank=a;
    }
}

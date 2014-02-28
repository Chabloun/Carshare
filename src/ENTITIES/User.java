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
    private String Sexe;
    private String Address;
    private String Email;
    private Date DateB;
    private String City;
    private String Img;
    private int Rank;
    private Date DateI;
    private int Blocked;
    
    public User(){
        this.Id=0;
        this.Login="";
        this.Password="";
        this.LastName="";
        this.FirstName="";
        this.Sexe="";
        this.Address="";
        this.Email="";
        this.DateB=new Date(2014,1,1);
        this.City="";
        this.Img="none";
        this.Rank=0;
        this.DateI=new Date(2014,1,1);
        this.Blocked=0;
    }

    public User(String login,
                String password,
                String lastname,
                String firstname,
                String sexe,
                String address,
                String email,
                Date dateb,
                String city,
                String img,
                int rank,
                Date dateI,
                int blocked
            ){
        this.Id=0;
        this.Login=login;
        this.Password=password;
        this.LastName=lastname;
        this.FirstName=firstname;
        this.Sexe=sexe;
        this.Address=address;
        this.Email=email;
        this.DateB=dateb;
        this.City=city;
        this.Img=img;
        this.Rank=rank;
        this.DateI=dateI;
        this.Blocked=blocked;
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
    public String getSexe() {
        return Sexe;
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
    public String getImg() {
        return Img;
    }
    public int getRank() {
        return Rank;
    }
    public Date getDateI() {
        return DateI;
    }
    public int getBlocked() {
        return Blocked;
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
    public void setSexe(String a) {
        this.Sexe=a;
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
    public void setImg(String a) {
        this.Img=a;
    }
    public void setRank(int a) {
        this.Rank=a;
    }
    public void setDateI(Date a) {
        this.DateI=a;
    }
    public void setBlocked(int a) {
        this.Blocked=a;
    }
}

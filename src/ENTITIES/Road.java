
package ENTITIES;

import java.sql.Date;

/**
 *
 * @author Omar
 */
public class Road {
    
    private int Id;
    private float Price ;
    private String Driver;
    private String CityD;
    private String CityR;
    private int Seat;
    private String Round;
    private Date DateD ;
    private Date DateR ;
    private String HourD;
    private String HourR;
    private String Car;

    public Road( String Driver,float Price,  int Seat,String CityD, String CityR,  String Round, Date DateD, Date DateR, String HourD, String HourR, String Car) {
       
        
        this.Driver = Driver;
        this.Price = Price;
         this.Seat = Seat;
        this.CityD = CityD;
        this.CityR = CityR;
       
        this.Round = Round;
        this.DateD = DateD;
        this.DateR = DateR;
        this.HourD = HourD;
        this.HourR = HourR;
        this.Car = Car;
    }

    public Road(){
       this.Id=0;
        this.Price = 0;
        this.Driver = "";
        this.CityD = "";
        this.CityR = "";
        this.Seat =0;
        this.Round = "";
        this.DateD=new Date(2014-01-01);
        this.DateR=new Date(2014-01-01);
        this.HourD="";
        this.HourR="";
        this.Car="";
         }
    
    public void setDateD(Date DateD) {
        this.DateD = DateD;
    }

    public void setDateR(Date DateR) {
        this.DateR = DateR;
    }

    public void setHourD(String HourD) {
        this.HourD = HourD;
    }

    public void setHourR(String HourR) {
        this.HourR = HourR;
    }

    public void setCar(String Car) {
        this.Car = Car;
    }

    public Date getDateD() {
        return DateD;
    }

    public Date getDateR() {
        return DateR;
    }

    public String getHourD() {
        return HourD;
    }

    public String getHourR() {
        return HourR;
    }

    public String getCar() {
        return Car;
    }
    
   
   
    
    public String getCityD() {
        return CityD;
    }
            
    public void setCityD(String CityD) {
        this.CityD = CityD;
    }

    public String getCityR() {
        return CityR;
    }

    public void setCityR(String CityR) {
        this.CityR = CityR;
    }

    public int getSeat() {
        return Seat;
    }

    public void setSeat(int Seat) {
        this.Seat = Seat;
    }

    public String getRound() {
        return Round;
    }

    public void setRound(String Round) {
        this.Round = Round;
    }
     
    
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getDriver() {
        return Driver;
    }

    public void setDriver(String Driver) {
        this.Driver = Driver;
    }
 
    public float getPrice() {
        return Price;
    }

    public void setPrice(float Price) {
        this.Price = Price;
    }
    
  
}

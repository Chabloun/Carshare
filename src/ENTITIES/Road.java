
package ENTITIES;

/**
 *
 * @author Omar
 */
public class Road {
    
    private int Id;
   // private float LongD;
    private float Price ;
  //  private float LatD;
   // private float LongR;
   // private float LatR;
    private String Driver;
    private String CityD;
    private String CityR;
    private int Seat;
    private int Round;
   
   public Road(){
        //this.Id = 0;
       // this.LongD = 0;
        this.Price = 0;
        //this.LatD = 0;
        //this.LongR = 0;
       // this.LatR = 0;
        this.Driver = "";
        this.CityD = "";
        this.CityR = "";
        this.Seat =0;
        this.Round = 0;
   }

    public Road(float Price,String Driver, String CityD, String CityR, int Seat, int Round) {
        //this.Id = Id;
      //  this.LongD = LongD;
        this.Price = Price;
       // this.LatD = LatD;
       // this.LongR = LongR;
   //     this.LatR = LatR;
        this.Driver = Driver;
        this.CityD = CityD;
        this.CityR = CityR;
        this.Seat = Seat;
        this.Round = Round;
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

    public int getRound() {
        return Round;
    }

    public void setRound(int Round) {
        this.Round = Round;
    }
     
    
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    /*public float getLongD() {
        return LongD;
    }

    public void setLongD(float longD) {
        this.LongD = LongD;
    }

    public float getLatD() {
        return LatD;
    }

    public void setLatD(float LatD) {
        this.LatD = LatD;
    }

    public float getLongR() {
        return LongR;
    }

    public void setLongR(float LongR) {
        this.LongR = LongR;
    }

    public float getLatR() {
        return LatR;
    }

    public void setLatR(float LatR) {
        this.LatR = LatR;
    }*/

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

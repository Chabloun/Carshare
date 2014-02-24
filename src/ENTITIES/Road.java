
package ENTITIES;

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
    private int Round;
   
   public Road(){
       this.Id=0;
        this.Price = 0;
        this.Driver = "";
        this.CityD = "";
        this.CityR = "";
        this.Seat =0;
        this.Round = 0;
   }

    public Road(String Driver,float Price  ,int Seat ,String CityD, String CityR, int Round) {
        this.Price = Price;
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


package ENTITIES;

/**
 *
 * @author Omar
 */
public class RoadENTITIES {
    private int Id;
    private float LongD;
    private float Price ;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public float getLongD() {
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
    }

    public String getDriver() {
        return Driver;
    }

    public void setDriver(String Driver) {
        this.Driver = Driver;
    }
    private float LatD;
    private float LongR;
    private float LatR;
    
    private String Driver;

    public float getPrice() {
        return Price;
    }

    public void setPrice(float Price) {
        this.Price = Price;
    }
    
  
}

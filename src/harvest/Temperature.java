/*
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 */
package harvest;

/**
 * Temperature value for calculated dependency
 * @author Ldc1108
 */
public class Temperature {
    private double temp;
    private double tempAlt;
   
    private String units = "ev";
    private String alt; // Note: Not worrying about alt units until stage 2
    
    /**
     * Constructor takes native temp units (EV) and sets this and alt units
     * @param temp - Temperature point in EV
     */
    public Temperature(double temp) {
        this.temp = temp;
        // calculate alt and set it here
    }
    
    /**
     * Returns value of temp at this point in EV
     * @return temp - Value of temperature point in EV 
     */
    public double getValue() {
        return temp;
    }
    
    /**
     * Returns value of temp at this point in ??
     * @return 
     */
    public double getAltValue() {
        return tempAlt;
    }

    /**
     * Allows comparison between temperatures native units (EV)
     * @return integer - true if temperatures equal, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (o instanceof Temperature) {
            Temperature t = (Temperature)o;
            if (this.temp == t.temp) {
                return true;
            } else {
                return false;
            }
        } else {
            System.err.println("Incorrect comparison");
            return false;
        }
    }

    // NEEDS COMMENTS DO ASAP - [Needed for Hashset comparisons]
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 13 * hash + (int) (Double.doubleToLongBits(this.temp) ^ (Double.doubleToLongBits(this.temp) >>> 32));
        return hash;
    }
    
    /**
     * Prints Temp representation: Temp: [NativeValue] [AltValue]
     * @return String representation of Temp
     */
    @Override
    public String toString() {
        String str = "";
        str += "["+this.temp + " " + this.units+"]";
        str += "["+this.tempAlt + " " + this.alt+"]";
        return str;
    }
}
/*
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 */
package harvest;

/**
 * Temperature value for calculated dependency
 * @author Ldc1108
 */
public class Temperature implements Independent {
    private double temp;
    private double tempAlt;
   
    private final String units = "ev";
    private final String alt = "Temp Alt"; // Note: Not worrying about alt units until stage 2
    
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
    @Override
    public double getValue() {
        return temp;
    }
    
    /**
     * Returns value of temp at this point in ??
     * @return tempAlt - Value of temperature point in ergs
     */
    @Override
    public double getAltValue() {
        return tempAlt;
    }
    
    /**
     * Returns native units in string
     * @return units - Native units for temperature
     */
    @Override
    public String getNativeUnits() {
        return units;
    }
    
    /**
     * Returns alternative units in string
     * @return alt - Alternative units for temperature
     */
    @Override
    public String getAltUnits() {
        return alt;
    }

    /**
     * Test equality between temperatures native units (EV)
     * @return boolean - true if temperatures equal, false otherwise
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

    /**
     * Hash code needs to be defined so HashSet<> contain methods look in the
     * correct hash "bucket"
     * @return hash - integer corresponding to hash code
     */
    @Override
    public int hashCode() {
        int hash = 5;
        hash += 13 * hash + (int) (Double.doubleToLongBits(this.temp) ^ (Double.doubleToLongBits(this.temp) >>> 32));
        return hash;
    }
    
    /**
     * Prints Temp representation: Temp: [NativeValue] [AltValue]
     * @return String representation of Temp
     */
    @Override
    public String toString() {
        String str = "T:";
        str += "["+this.temp + " " + this.units+"]";
        str += "["+this.tempAlt + " " + this.alt+"]";
        return str;
    }
}
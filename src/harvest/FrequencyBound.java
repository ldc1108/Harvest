/*
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 */
package harvest;

/**
 * Frequency bound gives range of frequency for which dependency data is found
 * @author Ldc1108
 */
public class FrequencyBound {
    private double startBound, startBoundAlt;    
    private double endBound, endBoundAlt; 
    /* Note: Frequency for most data comes naturally as ERGS, and you will need
     * to compute the EV values, which will have a small round off error at time
     */
    private final String units = "erg";
    private final String alt = "ev";
    
    /**
     * Constructor takes native unit frequencies and sets those and alt units
     * @param startBound - Starting boundary of Frequency range (ergs)
     * @param endBound  - Ending boundary of Frequency range (ergs)
     */
    public FrequencyBound(double startBound, double endBound) {
        this.startBound = startBound;
        this.endBound = endBound;
        // calculate alt bound here and set it equal
    }
    
    /**
     * Returns bounds in erg units
     * @return double[] - Array of frequency boundaries in erg unit
     */
    public double[] getValue() {
        double[] bound = new double[2];
        bound[0] = startBound;
        bound[1] = endBound;
        return (bound);
    }
    
    /**
     * Returns bounds in EV units
     * @return double[] - Array of frequency boundaries in EV unit
     */
    public double[] getAltValue() {
        double[] bound = new double[2];
        bound[0] = startBoundAlt;
        bound[1] = endBoundAlt;
        return bound;
    }
    
    /**
     * Returns native units in string
     * @return units - Native units for frequency
     */
    public String getNativeUnits() {
        return units;
    }
    
    /**
     * Returns alternative units in string
     * @return alt - Alternative units for frequency
     */
    public String getAltUnits() {
        return alt;
    }

    /**
     * Test equality between frequency bounds
     * @return boolean - true if frequency bounds equal, false otherwise
     */
   @Override
    public boolean equals(Object o) {
        if (o instanceof FrequencyBound) {
            FrequencyBound f = (FrequencyBound)o;
            if ((this.startBound == f.startBound) && 
                    (this.endBound == f.endBound)) {
                return true;
            } else {
                return false;
            }
        } else {
            System.out.println("Incorrect comparison");
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
        int hash = 3;
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.startBound) ^ (Double.doubleToLongBits(this.startBound) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.endBound) ^ (Double.doubleToLongBits(this.endBound) >>> 32));
        return hash;
    }
   
   /**
     * Prints Frequency representation: 
     * Freq Bounds: [NativeValueBound1] [NativeValueBound2] / [AltValueBound1] 
     *  [AltValueBound2]
     * @return String representation of Frequency bounds
     */
    @Override
    public String toString() {
        String str = "FBound:";
        str += "["+this.startBound + " " + this.endBound + " " + this.units + "] /";
        str += "["+this.startBoundAlt + " " + this.endBoundAlt + " " + this.alt+"]";
        return str;
    }
}
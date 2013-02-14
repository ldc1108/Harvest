/*
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 */
package harvest;

/**
 * Frequency bound gives range of frequency for which dependency data is found
 * @author Ldc1108
 */
public class FrequencyBound implements Comparable {
    private double startBound, startBoundAlt;    
    private double endBound, endBoundAlt; 
    /* Note: Frequency for most data comes naturally as ERGS, and you will need
     * to compute the EV values, which will have a small round off error at time
     */
    private String units = "ev";
    private String alt = "ergs";
    
    /**
     * Constructor takes native unit frequencies and sets those and alt units
     * @param startBound - Starting boundary of Frequency range
     * @param endBound  - Ending boundary of Frequency range
     */
    public FrequencyBound(double startBound, double endBound) {
        this.startBound = startBound;
        this.endBound = endBound;
        // calculate alt bound here and set it equal
    }
    
    /**
     * Returns bounds in EV units
     * @return double[] - Array of frequency boundaries in EV unit
     */
    public double[] getBound() {
        double[] bound = new double[2];
        bound[0] = startBound;
        bound[1] = endBound;
        return (bound);
    }
    
    /**
     * Returns bounds in EV units
     * @return double[] - Array of frequency boundaries in ERGS unit
     */
    public double[] getAltBound() {
        double[] bound = new double[2];
        bound[0] = startBoundAlt;
        bound[1] = endBoundAlt;
        return bound;
    }

    /**
     * Allows comparison between frequency bounds alt units (ERGS)
     * Note: We use Alt units (ERGS) because this is readily availible in file
     * @return integer - 0 if frequency bounds equal, -1 otherwise
     */
   @Override
    public int compareTo(Object o) {
        try {
            FrequencyBound f = (FrequencyBound)o;
            if ((this.startBoundAlt == f.startBoundAlt) && 
                    (this.endBoundAlt == f.endBoundAlt)) {
                return 0;
            } else {
                return -1;
            }
        } catch (ClassCastException e) {
            System.out.println("Incorrect comparison");
            return -1;
        }
    }
   
   /**
     * Prints Frequency representation: 
     * Freq Bounds: [NativeValueBound1] [NativeValueBound2] / [AltValueBound1] 
     *  [AltValueBound2]
     * @return String representation of Frequency bounds
     */
    @Override
    public String toString() {
        String str = "";
        str += "["+this.startBound + " " + this.endBound + " " + this.units + "] /";
        str += "["+this.startBoundAlt + " " + this.endBoundAlt + " " + this.alt+"]";
        return str;
    }
}

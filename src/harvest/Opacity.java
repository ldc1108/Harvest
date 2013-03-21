/*
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 */
package harvest;

/**
 * Opacity point given 3 constants
 * @author Ldc1108
 */
public class Opacity extends Dependent {
    /**
     * Constructor - takes constants, and sets alt values also 
     * @param bound - Frequency boundaries
     * @param temp - Temperature point
     * @param dens - Density point
     * @param nativeValue - Opacity value in native Un, given constants 
     */
    public Opacity(FrequencyBound bound, Temperature temp, Density dens, 
            double nativeValue) {
        // Note: We will not worry about opacity alt units until later stages
        super(bound, temp, dens, nativeValue, "1/cm", "??");
        //calculate alternative united value here
    }
    
    /**
     * Return a string of value [both native and alt] and states of D,T,FBounds
     * @return String representation of Opacity and its states
     */
    @Override
    public String toString() {
        String str = "Opac: \n";
        str += "["+this.getNativeValue() + this.getNativeUnits()+"] \n";
        str += "["+this.getAltValue() + this.getAltUnits()+"] \n";
        str += super.toString();
        return str;
    }
    /**
     * Tests equality for Opacity to other Dependent object
     * @param o - Object to compare to 
     * @return boolean - true if frequency bounds equal, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (o instanceof Opacity) {
            Opacity op = (Opacity)o;
            if (super.equals(o)) {
                return true;
            } else {
                return false;
            }
        } else {
            System.err.println("Invalid comparison");
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
        int hash = 7;
        return hash;
    }
}
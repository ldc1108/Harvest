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
        String str = "";
        str += "["+this.getNativeValue() + this.getNativeUnits()+"]";
        str += "["+this.getAltValue() + this.getAltUnits()+"]";
        str += super.toString();
        return str;
    }
}
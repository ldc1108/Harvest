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
        super(bound, temp, dens, nativeValue);
        this.units = "1/cm";
        //calculate alternative units here
        
    }
}

/*
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 */
package harvest;

/**
 * Dependent class has Opacity, Emmisivity children -Each dependent defined by 
 * constants which form single value (In multiple units)
 * @author Ldc1108
 */
public abstract class Dependent {
    double nativeValue;
    double altValue;
    String units;
    String alt;
    private FrequencyBound freqBound;
    private Temperature tempPoint;
    private Density densPoint;

    /**
     * Constructor - Receives constants, sets native value
     * @param bound - Frequency boundaries
     * @param temp - Temperature point
     * @param dens - Density point
     * @param nativeUnits  - Value given constants
     */
    Dependent(FrequencyBound bound, Temperature temp, Density dens, 
            double nativeUnits) {
        freqBound = bound;
        tempPoint = temp;
        densPoint = dens;
        this.nativeValue = nativeUnits;
        // set alt in opacity/emmissivty children
    }
    
    /*
     * @return nativeValue - returns value given constants in native units
     */
    public double getNative() {
        return nativeValue;
    }
    
    /**
     * @return altValue - returns value given constant in alternative units
     */
    public double getAlt() {
        return altValue;
    }
    
    /**
     * @return freqBound - returns boundaries for frequency on which dependency
     *  value was calculated
     */
    public FrequencyBound getFreqBound() {
        return freqBound;
    }
    
    /**
     * @return tempPoint - returns value of temperature on which dependency 
     *  value was calculated
     */
    public Temperature getTempPoint() {
        return tempPoint;
    }
    
    /**
     * @return densPoint - returns value of density on which dependency value 
     *  was calculated
     */
    public Density getDensPoint() {
        return densPoint;
    }
    
}

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
    private double nativeValue;
    private double altValue;
    private String units;
    private String alt;
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
            double nativeValue, String units, String alt) {
        freqBound = bound;
        tempPoint = temp;
        densPoint = dens;
        this.nativeValue = nativeValue;
        this.units = units;
        this.alt = alt;
        // set alt in opacity/emmissivty children
    }
    
    /*
     * Return native value of Dependent
     * @return nativeValue - returns value given constants in native units
     */
    public double getNativeValue() {
        return nativeValue;
    }
    
    /**
     * Return altValue of Dependent
     * @return altValue - returns value given constant in alternative units
     */
    public double getAltValue() {
        return altValue;
    }
    
    /**
     * Returns String of native units
     * @return units - Native units in string
     */
    public String getNativeUnits() {
        return units;
    }
    
    /**
     * Returns string of alternative units
     * @return alt - Alternative units in string
     */
    public String getAltUnits() {
        return alt;
    }
    
    /**
     * Return Frequency state of Dependent
     * @return freqBound - returns boundaries for frequency on which dependency
     *  value was calculated
     */
    public FrequencyBound getFreqBound() {
        return freqBound;
    }
    
    /**
     * Return temperature state of Dependent
     * @return tempPoint - returns value of temperature on which dependency 
     *  value was calculated
     */
    public Temperature getTempPoint() {
        return tempPoint;
    }
    
    /**
     * Return density state of dependent
     * @return densPoint - returns value of density on which dependency value 
     *  was calculated
     */
    public Density getDensPoint() {
        return densPoint;
    }
    
    /**
     * Return Dens, Temp, Freq Bounds states for Dependent  
     * @return String representation of all 3 states in form:
     *  Dens:
     *  Temp:
     *  Freq Bounds:
     */
    @Override
    public String toString() {
        String str = "";
        str += "Dens: " + densPoint;
        str += "Temp: " + tempPoint;
        str += "Freq Bounds: " + freqBound;
        return str;
    }
//    
//    /**
//     * Compares D,T,FBounds to other Dependent object
//     * @param o - Object to compare to 
//     * @return integer - 0 if frequency bounds equal, -1 otherwise
//     */
//    @Override
//    public int compareTo(Object o) {
//        Dependent d = (Dependent)o;
//        if densPoint.compareTo(d.densPoint) {
//    }
}

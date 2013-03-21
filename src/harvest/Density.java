/*
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 */
package harvest;

/**
 * Density value for calculated dependency
 * @author Ldc1108
 */
public class Density implements Independent {
    private double dens;
    private double densAlt;
    
    private final String units = "g/cc";
    private final String alt = "D alt";// Note - Alt units not priority @ stage 1
    
    /**
     * Constructor - Takes native unit (g/cc) density value, sets that 
     *  and alternate value
     * @param dens - g/cc unit of density point
     */
    public Density(double dens) {
        this.dens = dens;
        // calculate alt and set it here
    }
    
    /**
     * @return dens - Density value in native units
     */
    @Override
    public double getValue() {
        return dens;
    }
    
    /**
     * @return densAlt - Density value in alternative units
     */
    @Override
    public double getAltValue() {
        return densAlt;
    }
    
    /**
     * Returns native units in string
     * @return units - Native units for density
     */
    @Override
    public String getNativeUnits() {
        return units;
    }
    
    /**
     * Returns alternative units in string
     * @return alt - Alternative units for density
     */
    @Override
    public String getAltUnits() {
        return alt;
    }

    /**
     * Tests equality between densities native units (g/cc)
     * @return integer - true if densities equal, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (o instanceof Density) {
            Density d = (Density)o;
            if (this.dens == d.getValue()) {
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
        int hash = 3;
        hash += 37 * hash + (int) (Double.doubleToLongBits(this.dens) ^ (Double.doubleToLongBits(this.dens) >>> 32));
        return hash;
    }
    
    /**
     * Prints Density representation: Dens: [NativeValue] [AltValue]
     * @return String representation of Density
     */
    public String toString() {
        String str = "Dens: \n";
        str += "["+this.dens + " " + this.units+"] \n";
        str += "["+this.densAlt + " " + this.alt+"] \n";
        return str;
    }
}

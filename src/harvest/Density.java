/*
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 */
package harvest;

/**
 * Density value for calculated dependency
 * @author Ldc1108
 */
public class Density implements Comparable {
    double dens;
    double densAlt;
    
    private String units = "g/cc";
    private String alt;// Note - Alt units not priority @ stage 1
    
    /**
     * Constructor - Takes native unit density value, sets that and alternate
     * @param dens - g/cc unit of density point
     */
    public Density(double dens) {
        this.dens = dens;
        // calculate alt and set it here
    }
    
    /**
     * @return dens - Density value in native units
     */
    public double getValue() {
        return dens;
    }
    
    /**
     * @return densAlt - Density value in alternative units
     */
    public double getAltValue() {
        return densAlt;
    }

    /**
     * Allows comparison between densities native units (g/cc)
     * @return integer - 0 if densities equal, -1 otherwise
     */
    @Override
    public int compareTo(Object o) {
        try {
            Density d = (Density)o;
            if (this.dens == d.getValue()) {
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
     * Prints Density representation: Dens: [NativeValue] [AltValue]
     * @return String representation of Density
     */
    public String toString() {
        String str = "";
        str += "["+this.dens + " " + this.units+"]";
        str += "["+this.densAlt + " " + this.alt+"]";
        return str;
    }
}

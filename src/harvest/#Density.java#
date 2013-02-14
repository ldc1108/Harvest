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
    
    String units = "g/cc";
    String alt;
    
    /**
     * Constructor - 
     * @param dens 
     */
    public Density(double dens) {
        this.dens = dens;
        // calculate alt and set it here
    }
    
    public double getValue() {
        return dens;
    }
    
    public double getAltValue() {
        return densAlt;
    }

    @Override
    public int compareTo(Object o) {
        try {
            Density d = (Density)o;
            if (this.dens == d.dens) {
                return 0;
            } else {
                return -1;
            }
        } catch (ClassCastException e) {
            System.out.println("Incorrect comparison");
            return -1;
        }
    }
}

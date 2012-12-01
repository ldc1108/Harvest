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
     * Constructor - Takes native unit density value, sets that and alternate
     * @param dens 
     */
    public Density(double dens) {
        this.dens = dens;
        // calculate alt and set it here
    }
    
    /*
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
     * Allows comparison between densities
     * @return int - 0 iff densities equal, -1 otherwise
     */
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

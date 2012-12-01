/*
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 */
package harvest;

import java.util.Comparator;

/**
 * Temperature value for calculated dependency
 * @author Ldc1108
 */
public class Temperature implements Comparable {
    double temp;
    double tempAlt;
    
    String units = "ev";
    String alt;
    
    /**
     * Constructor - Takes native unit temp value, sets that and alternate
     * @param temp 
     */
    public Temperature(double temp) {
        this.temp = temp;
        // calculate alt and set it here
    }
    
    /*
     * @return temp - Temp value in native units
     */
    public double getValue() {
        return temp;
    }
    
    /**
     * @return tempAlt - Temp value in alternative units
     */
    public double getAltValue() {
        return tempAlt;
    }

    /**
     * Allows comparison between temps
     * @return int - 0 iff temps equal, -1 otherwise
     */
    @Override
    public int compareTo(Object o) {
        try {
            Temperature t = (Temperature)o;
            if (this.temp == t.temp) {
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

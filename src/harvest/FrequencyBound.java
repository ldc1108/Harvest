/*
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 */
package harvest;

/**
 * Frequency bound gives range of frequency for which dependency data is found
 * @author Ldc1108
 */
public class FrequencyBound implements Comparable {
    double startBound, startBoundAlt;    
    double endBound, endBoundAlt; 
    
    String units = "ev";
    String alt;
    
    /**
     * Constructor - Takes native unit freq bound value, sets that and alternate
     * @param temp 
     */
    public FrequencyBound(double startBound, double endBound) {
        this.startBound = startBound;
        this.endBound = endBound;
        // calculate alt bound here and set it equal
    }
    
    /*
     * @return bound - Freq values in native units
     */
    public double[] getBound() {
        double[] bound = new double[2];
        bound[0] = startBound;
        bound[1] = endBound;
        return (bound);
    }
    
    /*
     * @return bound - Freq values in alt units
     */
    public double[] getAltBound() {
        double[] bound = new double[2];
        bound[0] = startBoundAlt;
        bound[1] = endBoundAlt;
        return bound;
    }

    /**
     * Allows comparison between freq boundaries
     * @return int - 0 iff freqs equal, -1 otherwise
     */
   @Override
    public int compareTo(Object o) {
        try {
            FrequencyBound f = (FrequencyBound)o;
            if ((this.startBound == f.startBound) && (this.endBound == f.endBound)) {
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

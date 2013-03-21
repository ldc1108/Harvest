/*
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 */
package harvest;

import java.util.HashSet;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Luke
 */
public class DependentTest {
    
    public DependentTest() {
    }
    
    /**
     * Test of equals method, of class Dependent.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = new Opacity(new FrequencyBound(2345.5E+02, 245237.92E+04),
                new Temperature(235.2), new Density(12.0), 827349.3E-02);
        Dependent instance = new Opacity(new FrequencyBound(2345.5E+02, 245237.92E+04),
                new Temperature(235.2), new Density(12.0), 827349.3E-02);
        boolean expResult = true;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
    }

    /**
     * Test of hashCode method, of class Dependent.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Dependent instance = new Opacity(new FrequencyBound(2345.5E+02, 245237.92E+04),
                new Temperature(235.2), new Density(12.0), 827349.3E-02);
        Object o = new Opacity(new FrequencyBound(2345.5E+02, 245237.92E+04),
                new Temperature(235.2), new Density(12.0), 827349.3E-02);
        boolean expResult = true;
        HashSet<Dependent> h = new HashSet<>();
        h.add(instance);
        // Note: Suspicious call (Expects Dependent, but receives Object) intentional
        boolean result = h.contains(o);
        assertEquals(expResult, result);
    }
}

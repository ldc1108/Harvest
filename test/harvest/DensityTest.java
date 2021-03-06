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
 * @author Ldc1108
 */
public class DensityTest {
    
    public DensityTest() {
    }
    
    /**
     * Test of equals method, of class Density.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = new Density(2.82580E+00);
        Density instance = new Density(.28258000E+01);
        boolean expResult = true;
        boolean result = instance.equals(o);
        assertEquals("Two instances of density should be equal",expResult,result);
    }

    /**
     * Test of hashCode method, of class Density.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Density instance = new Density(2.2342E3);
        Density o = new Density(2.2342E3);
        HashSet<Density> h = new HashSet<>();
        h.add(instance);
        boolean expResult = true;
        boolean result = h.contains(o);
        assertEquals("HashSet should contain object", expResult, result);
    }
}
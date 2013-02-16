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
public class TemperatureTest {
    
    public TemperatureTest() {
    }
    
    /**
     * Test of equals method, of class temp.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = new Temperature(2.82580E+00);
        Temperature instance = new Temperature(.28258000E+01);
        boolean expResult = true;
        boolean result = instance.equals(o);
        assertEquals("Two instances of temp should be equal",expResult,result);
    }

    /**
     * Test of hashCode method, of class temp.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Temperature instance = new Temperature(2.2342E3);
        Temperature o = new Temperature(2.2342E3);
        HashSet<Temperature> h = new HashSet<>();
        h.add(instance);
        boolean expResult = true;
        boolean result = h.contains(o);
        assertEquals("HashSet should contain object", expResult, result);
    }
}
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
public class FrequencyBoundTest {
    
    public FrequencyBoundTest() {
    }

    /**
     * Test of equals method, of class temp.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = new FrequencyBound(2.82580E+00, 50.0);
        FrequencyBound instance = new FrequencyBound(.28258000E+01, 50.00);
        boolean expResult = true;
        boolean result = instance.equals(o);
        assertEquals("Two instances of FrequencyBound should be equal",
                expResult,result);
    }

    /**
     * Test of hashCode method, of class temp.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        FrequencyBound instance = new FrequencyBound(2.2342E3, 5282352.924214);
        FrequencyBound o = new FrequencyBound(2.2342E3, 5282352.924214);
        HashSet<FrequencyBound> h = new HashSet<>();
        h.add(instance);
        boolean expResult = true;
        boolean result = h.contains(o);
        assertEquals("HashSet should contain object", expResult, result);
    }
}
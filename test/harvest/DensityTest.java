/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package harvest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Luke
 */
public class DensityTest {
    
    public DensityTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getValue method, of class Density.
     */
    @Test
    public void testGetValue() {
        System.out.println("getValue");
        Density instance = new Density(0.0);
        double expResult = 0.0;
        double result = instance.getValue();
        assertEquals("Expected Dens. does not equal Density", expResult, result);
    }

    /**
     * Test of getAltValue method, of class Density.
     * NOTE: Alts not yet implemented, so ignore for now
     *  When ready to enable, uncomment "@Test"
     */
    //@Test
    public void testGetAltValue() {
        System.out.println("getAltValue");
        Density instance = new Density(2.5E13);
        double expResult = 0.0; // Obviously not right, will fix when alts built
        double result = instance.getAltValue();
        assertEquals("Expected result should be Null", expResult, result);
    }

    // FINISH THE REST OF THESE TESTS
    
    /**
     * Test of getNativeUnits method, of class Density.
     */
    @Test
    public void testGetNativeUnits() {
        System.out.println("getNativeUnits");
        Density instance = null;
        String expResult = "";
        String result = instance.getNativeUnits();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAltUnits method, of class Density.
     */
    @Test
    public void testGetAltUnits() {
        System.out.println("getAltUnits");
        Density instance = null;
        String expResult = "";
        String result = instance.getAltUnits();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Density.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = null;
        Density instance = null;
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Density.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Density instance = null;
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Density.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Density instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}

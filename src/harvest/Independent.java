/*
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 */
package harvest;

/**
 *
 * @author Ldc1108
 */
public interface Independent {
    // Get value in native units
    public double getValue();
    // Get value in alt units
    public double getAltValue();
    // Get native Units name
    public String getNativeUnits();
    // Get alt units name
    public String getAltUnits();
    // Tests equality between objects
    @Override
    public boolean equals(Object o);
    // Return string representation
    @Override
    public String toString();
}

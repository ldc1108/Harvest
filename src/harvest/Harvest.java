/*
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 */
package harvest;

/**
 * Harvest - GUI for viewing LLE Opacity Emissivity Files [Los Alamos]
 * @author Ldc1108
 */

public class Harvest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            System.out.println("Harvest 3, By Luke Coy (Ldc1108@rit.edu)");
            GUI view = new GUI();
            view.main(new String[0]);
    }
}

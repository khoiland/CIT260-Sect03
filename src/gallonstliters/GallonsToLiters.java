/*
 * Try This 1-1
 * This program converts gallons to liters.
 * Call this program GallonsToLiters.java.
 */
package gallonstoliters;

/**
 *
 * @author Kellie Hoiland
 */
public class GallonsToLiters {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double gallons; // holds the number of gallons
        double liters; // holds conversion to liters
        
        gallons = 10; // start with 10 gallons
        liters = gallons * 3.7854; // convert to liters
        
        // outputs the conversion to the screen
        System.out.println(gallons + "gallons is " + liters + " liters.");       
    }
}

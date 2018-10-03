/*
 * To find the cost of a carpet.
 * Jessica Qiao
 * September 20th,2018.
 */

package carpet;

/**
 *
 * @author shqia0005
 */
public class Carpet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double l = 8.5;
        int w = 6;
        double p = 19.95;
        double c = 0.0;
        
        
        
        // Use the following formula
        c = l*w*p;
        
        System.out.println( "The cost of a carpet is " + c + " m");
    }
    
}
